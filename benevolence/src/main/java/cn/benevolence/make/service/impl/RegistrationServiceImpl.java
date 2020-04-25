package cn.benevolence.make.service.impl;

import cn.benevolence.doctor.doMapper.CallDoMapper;
import cn.benevolence.make.doMapper.RegistrationDoMapper;
import cn.benevolence.make.domodel.MyRegistration;
import cn.benevolence.make.domodel.MySchedule1;
import cn.benevolence.make.mapper.RegistrationMapper;
import cn.benevolence.make.mapper.VRegistrationMapper;
import cn.benevolence.make.model.Registration;
import cn.benevolence.make.model.VRegistration;
import cn.benevolence.make.model.VRegistrationExample;
import cn.benevolence.make.service.RegistrationService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.patient.mapper.PatientMapper;
import cn.benevolence.patient.model.Patient;
import cn.benevolence.patient.model.PatientExample;
import cn.benevolence.patient.service.PatientService;
import cn.benevolence.sys.model.User;
import cn.benevolence.utils.ShiroUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author xianshan
 * @create 2020-02 20:31
 */
@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private VRegistrationMapper vRegistrationMapper;
    @Autowired
    private RegistrationMapper registrationMapper;
    @Autowired
    private RegistrationDoMapper registrationDoMapper;
    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private CallDoMapper callDoMapper;

    @Override
    public EData list(PageBean pageBean, String name) {
        //获取登录医生的id
        User user= ShiroUtils.getUser();
        Integer did = callDoMapper.getDidByDname(user.getCname());
        Date date = new Date();
        /*使用视图*/
        VRegistrationExample example = new VRegistrationExample();
        VRegistrationExample.Criteria criteria = example
                .createCriteria()
                .andIsdelEqualTo(false)
                .andDoctoridEqualTo(did)
                .andResdateGreaterThanOrEqualTo(date);
        if (!StringUtils.isEmpty(name)){
            criteria.andPatientnameLike("%"+name+"%");
        }
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        List<VRegistration> informations = vRegistrationMapper.selectByExample(example);
        PageInfo<VRegistration> info =new PageInfo<>(informations);
        return EData.setData( info.getTotal(),info.getList() );
    }

    @Autowired
    private PatientService patientService;
    //添加预约
    @Override
    public R save(MySchedule1 mySchedule) {
        Integer pid = registrationDoMapper.getpid(mySchedule.getPatientname());
        Patient patient = null;
        Integer sn=null;
        try{
            if ( pid==null ){
                //向患者表保存patient信息
                patient = new Patient();
                patient.setPname(mySchedule.getPatientname());
                patient.setPdname(mySchedule.getPatientname());
                patientService.save(patient);
                //查询patientid
                PatientExample example = new PatientExample();
                example.createCriteria().andPdnameEqualTo(patient.getPname());
                List<Patient> list = patientMapper.selectByExample(example);
                Integer patientid = list.get(0).getPid();
                //保存预约信息
                sn = saveRes(mySchedule,patientid);
            }else if( pid != null ){
                //病人表中有该病人信息：挂号
                sn = saveRes(mySchedule,pid);
            }
        }catch (Exception e){
            e.printStackTrace();
            return  R.error("挂号失败!");
        }
        if(sn>0){
            return  R.ok("挂号成功！您的就诊号是"+sn);
        }else if(sn==0){
            return  R.error("您当日已预约过，不能再次预约");
        }
        else{
            return  R.error("挂号失败!");
        }
    }

    //根据patientid 查询该病人当天是否已预约挂号：如果有挂号的话，提示用户当日不能再预约
    public Integer getRegByCondition(MySchedule1 mySchedule, Integer patientid){
        Date sdate = mySchedule.getSdate();      //获取患者预约日期
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String resdate = df.format(sdate);
        //根据patientid 查询该病人当天是否已预约挂号：如果有挂号的话，提示用户当日不能再预约
        MyRegistration myRegistration = registrationDoMapper.getRegByCondition(patientid, mySchedule.getDdid(), mySchedule.getDid(), resdate);
        if(myRegistration != null){
            return 0;
        }
        return 1;
    }

    public Integer saveRes(MySchedule1 mySchedule, Integer patientid){
        Integer userId = ShiroUtils.getUserId();
        /*添加挂号*/
        //查询此患者是否已经预约过
        Integer result = getRegByCondition(mySchedule, patientid);
        if(result==0){
            return 0; //预约过，返回0
        }
        Date sdate = mySchedule.getSdate();      //获取患者预约日期
        Integer sn = registrationDoMapper.getsn(mySchedule.getDocid(),sdate);
        if( sn>0 ){
            Registration registration = new Registration();
            registration.setNumber(sn);
            registration.setPatientid(patientid);
            registration.setDoctorid(mySchedule.getDocid());
            registration.setDeptid(mySchedule.getDdid());
            registration.setResdate(sdate);
            registration.setCdate(new Date());
            registration.setUid(userId);
            registrationMapper.insertSelective(registration);
        }
        return sn;
    }

    //批量删除
    /*@Override
    public R deleteAll(String ids) {
        registrationDoMapper.deleteAllByIds(ids);
        return R.ok();
    }*/

    //删除单条:患者取消预约
    @Override
    public R delete(Integer id) {
        try {
            if (id!=null){
                Registration registration = new Registration();
                registration.setId(id);
                registration.setIsdel(true);
                registrationMapper.updateByPrimaryKeySelective(registration);
            }
            return R.ok("成功取消本次预约");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("取消失败");
        }
    }

    //根据用户名：查询该用户的所有挂号信息
    @Override
    public EData getUserRegByuserId() {
        Integer userId = ShiroUtils.getUserId();
        List<MyRegistration> list = registrationDoMapper.getUserRegByuserId(userId);
        PageInfo<MyRegistration> info =new PageInfo<>(list);
        return EData.setData( info.getTotal(),info.getList() );
    }

    //根据条件查询当前值班的医生
    @Override
    public EData doclist(PageBean pageBean, String name) {
        Date date = new Date();//获取当前的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String sdate = df.format(date);
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<MySchedule1> info = new PageInfo<>(registrationDoMapper.getdlist(sdate));
        return EData.setData( info.getTotal(),info.getList() );
    }

    @Override
    public EData doclist1(PageBean pageBean, Integer deptid, String position) {
        Date date = new Date();//获取当前的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String sdate = df.format(date);
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<MySchedule1> info = new PageInfo<>(registrationDoMapper.getdlist1(deptid,position,sdate));
        System.out.println( "======================="+info.getTotal()+info.getList().size());
        return EData.setData( info.getTotal(),info.getList() );
    }

    @Override
    public EData doclist2(PageBean pageBean, Integer deptid, String position) {
        Date date = new Date();           //获取当前的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String sdate = df.format(date);
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<MySchedule1> info = new PageInfo<>(registrationDoMapper.doclist2(deptid,position,sdate));
        return EData.setData( info.getTotal(),info.getList() );
    }


}
