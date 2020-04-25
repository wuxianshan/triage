package cn.benevolence.doctor.service.impl;

import cn.benevolence.doctor.doMapper.CallDoMapper;
import cn.benevolence.doctor.domodel.MyCall;
import cn.benevolence.doctor.service.CallService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.patient.model.Patient;
import cn.benevolence.sys.model.User;
import cn.benevolence.utils.ShiroUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xianshan
 * @create 2020-03 15:45
 */
@Service
public class CallServiceImpl implements CallService {
    @Autowired
    private CallDoMapper callDoMapper;
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String resdate = format.format(date);

    //1.获取所有的患者排队信息
    @Override
    public EData getMyTriageList(PageBean pageBean, String name) {
        //获得用户，即为当前登录的医生，根据医生姓名名查询医生的id
        List<MyCall> infors = callDoMapper.
                getPatientByDoctorId(resdate,getDidByDname());
        List<MyCall> list = new ArrayList<>();
        for ( int i=0; i<infors.size(); i++ ){
            MyCall myCall = new MyCall();
            myCall.setNumber(infors.get(i).getNumber());
            myCall.setId(infors.get(i).getId());
            myCall.setPname(infors.get(i).getPname());
            myCall.setPatientid(infors.get(i).getPatientid());
            myCall.setDeptname(infors.get(i).getDeptname());
            myCall.setDname(infors.get(i).getDname());
            myCall.setResdate(infors.get(i).getResdate());
            Integer status = infors.get(i).getStatus();
            if(status==0){
                myCall.setState("待诊断");
            }else if(status==1){
                myCall.setState("正在就诊");
            }else if(status==2){
                myCall.setState("诊断结束");
            }else if(status==3){
                myCall.setState("过号");
            }
            list.add(myCall);//添加到集合中
        }
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<MyCall> info =new PageInfo<>(list);
        return EData.setData( info.getTotal(),info.getList() );
    }
    //2.根据医生姓名获取医生id
    public Integer getDidByDname(){
        User user= ShiroUtils.getUser();
        Integer did = callDoMapper.getDidByDname(user.getCname());
        return did;
    }
    //3.就诊
    @Override
    public EData update(Integer curpatientid) {
        Integer doctorid=getDidByDname();
        //1.根据curpatientid修改 该挂号中status状态为1：就诊中
        Integer STATUS=1;
        Integer data = callDoMapper.updateStatus(STATUS, curpatientid, resdate, doctorid);
        List<Patient> list=null;
        if( data>0 ){
            //根据患者id查出患者姓名
            list = callDoMapper.getPnameByPid(curpatientid);
        }
        PageInfo<Patient> info =new PageInfo<>(list);
        return EData.setData( info.getTotal(),info.getList() );
    }

    //4.根据status的状态获取待诊人数
    @Override
    public Integer getWaitingNumByStatus(Integer status) {
        Integer doctorid=getDidByDname();
        return callDoMapper.getWaitingNumByStatus(status,resdate,doctorid);
    }

    //获取当前和下一位 候诊人的信息
    @Override
    @ResponseBody
    public EData getCurAndNextPatient(Integer curpatientid, Integer nextpatientid, Integer status) {
        Integer doctorid=getDidByDname();
        if(curpatientid != null){
            Integer result = callDoMapper.updateStatus(status, curpatientid, resdate,doctorid);
        }
        List<MyCall> list = callDoMapper.getCurAndNextPatient(resdate,doctorid);
        PageInfo<MyCall> info =new PageInfo<>(list);
        return EData.setData( info.getTotal(),info.getList() );
    }


}
