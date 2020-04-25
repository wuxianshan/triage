package cn.benevolence.make.service.impl;

import cn.benevolence.doctor.mapper.DeptMapper;
import cn.benevolence.doctor.mapper.DoctorMapper;
import cn.benevolence.doctor.model.Dept;
import cn.benevolence.doctor.model.DeptExample;
import cn.benevolence.doctor.model.Doctor;
import cn.benevolence.make.doMapper.InformationDoMapper;
import cn.benevolence.make.domodel.MyInformation;
import cn.benevolence.make.mapper.InformationMapper;
import cn.benevolence.make.model.Information;
import cn.benevolence.make.model.InformationExample;
import cn.benevolence.make.service.InformationService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.patient.mapper.PatientMapper;
import cn.benevolence.patient.model.Patient;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xianshan
 * @create 2020-02 11:17
 */
@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    private InformationMapper informationMapper;
    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private InformationDoMapper informationDoMapper;
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public EData list(PageBean pageBean, String name) {
        //根据name 查出患者id
        Integer patientId = informationDoMapper.getPatientId( name );
        InformationExample informationExample = new InformationExample();
        InformationExample.Criteria criteria = informationExample
                .createCriteria()
                .andIsdelEqualTo(false);  //Information表的查询条件：所有isdel=0的数据
        if( !StringUtils.isEmpty(name) ){
            criteria.andPatientidEqualTo( patientId );
        }
        List<Information> informations =informationMapper.selectByExample(informationExample);
        List<MyInformation> list = new ArrayList<>();
        for( int i = 0; i < informations.size(); i++ ){
            Patient patient = patientMapper.selectByPrimaryKey( informations.get(i).getPatientid() );  //根据patientId查询患者信息
            if( patient.getIsdel().equals(0) ){
                Doctor doctor = doctorMapper.selectByPrimaryKey( informations.get(i).getDoctorid() ); //根据doctorId查询医生信息
                MyInformation myInformation =new MyInformation();
                myInformation.setId( informations.get(i).getId() ); //编号
                myInformation.setPatient( patient.getPdname()); //患者姓名
                myInformation.setDoctor( doctor.getDname() );  //医生姓名
                myInformation.setContent( informations.get(i).getContent() ); //就诊内容
                myInformation.setDate( informations.get(i).getDate() ); //就诊时间
                list.add(myInformation);
            }
        }
        //分页
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<MyInformation> info =new PageInfo<>(list);
        return EData.setData( info.getTotal(),info.getList() );
    }

    //新增挂号信息
    @Override
    /*@Transactional*/
    public R save(MyInformation myInformation) {
        System.out.println( myInformation.toString() );
        //根据患者姓名：查出患者id  patientId,如果没有此患者，需要先添加患者信息到patient表
        String patientName = myInformation.getPatient();
        Integer patientId = informationDoMapper.getPatientId( patientName );
        if( patientId == null ){
            //新增：
            Patient patient1 = new Patient();
            patient1.setPname(patientName);
            patient1.setPdname(patientName);
            patientMapper.insertSelective(patient1);
            System.out.println("添加患者成功");

        }
        //根据医生姓名：查出医生的id
        String doctorName = myInformation.getDoctor();
        System.out.println(doctorName);
        Integer doctorId = informationDoMapper.getDoctorId(doctorName);
        System.out.println( "doctorid=======" + doctorId);//医生did


        String date = myInformation.getDate();
        String content = myInformation.getContent();
        //向在线挂号表中添加/修改一条挂号信息: doctorid patientid date content
        Information information = new Information();
        information.setId(myInformation.getId());
        information.setPatientid(informationDoMapper.getPatientId( patientName ));
        information.setDoctorid(doctorId);
        information.setContent(content);
        information.setDate(date);
        System.out.println(information.getContent()+"===information");
        System.out.println(information.getPatientid()+"《《《《《《《《《《患者id");

            //修改
            if(myInformation.getId()!=null){
                informationMapper.updateByPrimaryKeySelective(information);
                System.out.println("修改成功");
            }else{
                informationMapper.insertSelective(information);
            }
            return R.ok();


    }

    @Override
    public R del(Integer id) {
        try {
            if (id!=null){
                Information information = new Information();
                information.setId(id);
                information.setIsdel(true);
                informationMapper.updateByPrimaryKeySelective(information);
            }
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            return R.error("操作失败");
        }
    }
    @Override
    public R deleteAll(String ids) {
        informationDoMapper.deleteAllByIds(ids);
        return R.ok();
    }

    @Override
    public EData deptList() {
        DeptExample deptExample = new DeptExample();
        DeptExample.Criteria criteria =deptExample.createCriteria()
                .andIsdelEqualTo(false)
                .andIsstopEqualTo(false);
        PageInfo<Dept> info = new PageInfo<>(deptMapper.selectByExample(deptExample));
        return EData.setData(info.getTotal(),info.getList());
    }

    @Override
    public List<Doctor> doctorList(String name) {
        //根据科室名查询所有的医生
        System.out.println( informationDoMapper.getDoctorList(name).size());
        return informationDoMapper.getDoctorList(name);
    }



}
