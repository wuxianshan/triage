package cn.benevolence.sys.service.Impl;

import cn.benevolence.doctor.model.Dept;
import cn.benevolence.sys.domapper.EchartDoMapper;
import cn.benevolence.sys.model.Echart;
import cn.benevolence.sys.service.EchartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小马
 * @create 2020-02-22 11:45
 */
@Service
public class EchartServiceImpl implements EchartService {

    @Autowired
    private EchartDoMapper echartDoMapper;
    @Override
    public List<Echart> dept() {
        List<Dept> dept = echartDoMapper.dept();
        List<Echart> list = new ArrayList<>();
        for(Dept d:dept){
            Echart echart = new Echart();
            System.out.println(d.getName()+">>>"+d.getId());
            Integer ddid = echartDoMapper.doctorNumber(d.getId());
            echart.setNumber(ddid);
            echart.setName(d.getName());
             list.add(echart);
        }
//        System.out.println(list.toString());
        return list;
    }

    @Override
    public List patient() {
        Integer zhuyuan= echartDoMapper.patientZ();//住院人数
        Integer sex0=echartDoMapper.gender0();//男性
        Integer sex1=echartDoMapper.gender1();//女性
        Integer kangfu=echartDoMapper.huifu();//出院人数
        Integer count=echartDoMapper.count();//住院和出院总数
        List list = new ArrayList();
        list.add(zhuyuan);
        list.add(sex0);
        list.add(sex1);
        list.add(kangfu);
        list.add(count);
        return list;
    }

    @Override
    public List<Echart> hospatoal() {
        List<Echart> list = new ArrayList();
        Echart echart = new Echart();
        Echart echart2 = new Echart();
        Echart echart3 = new Echart();
        Echart echart4 = new Echart();
        Echart echart5 = new Echart();
//                String[] x ={"医生总数", "住院人数", "预约人数", "挂号人数", "医院总数"};
        Integer doctor=echartDoMapper.doctors();//医生在职总人数
        Integer zhuyuan=echartDoMapper.patientZ();//住院人数
        Integer yuyue=echartDoMapper.yuyue();//预约人数
        Integer guahao=echartDoMapper.guahao();//挂号数
        Integer zs=doctor+zhuyuan;//医院总数
        echart.setNumber(doctor);
        echart.setName("医生总数");
        echart2.setNumber(zhuyuan);
        echart2.setName("住院人数");
        echart3.setNumber(yuyue);
        echart3.setName("预约人数");
        echart4.setNumber(guahao);
        echart4.setName("挂号人数");
        echart5.setNumber(zs);
        echart5.setName("医院总数");
//        list.add(doctor);
//        list.add(zhuyuan);
//        list.add(yuyue);
//        list.add(guahao);
//        list.add(zs);
        list.add(echart);
        list.add(echart2);
        list.add(echart3);
        list.add(echart4);
        list.add(echart5);
//        System.out.println(list.toString());
//        System.out.println("总数》》》》"+zs);
        return list;
    }

    @Override
    @Transactional
    public List<Echart> deptNumber() {
        List<Dept> dept = echartDoMapper.dept();
        List<Echart> list = new ArrayList<>();
        for(Dept d:dept){
            System.out.println(d.getName()+">>"+d.getId());
            Echart echart = new Echart();
            Integer deptNumber = echartDoMapper.deptCount(d.getId());
            echart.setName(d.getName());
            echart.setNumber(deptNumber);
            list.add(echart);
        }
        return list;
    }

    @Override
    public List<Echart> users() {
        List<Echart> list = new ArrayList<>();
        Echart echart1 = new Echart();
        Echart echart2 = new Echart();
        Echart echart3 = new Echart();
        Echart echart4 = new Echart();
        Echart echart5 = new Echart();
        Echart echart6 = new Echart();
        Echart echart7 = new Echart();
        Echart month = new Echart();
        echart1.setNumber(echartDoMapper.week1());
        echart2.setNumber(echartDoMapper.week2());
        echart3.setNumber(echartDoMapper.week3());
        echart4.setNumber(echartDoMapper.week4());
        echart5.setNumber(echartDoMapper.week5());
        echart6.setNumber(echartDoMapper.week6());
        echart7.setNumber(echartDoMapper.week7());
        month.setNumber(echartDoMapper.month());
        list.add(echart1);
        list.add(echart2);
        list.add(echart3);
        list.add(echart4);
        list.add(echart5);
        list.add(echart6);
        list.add(echart7);
//        list.add(month);
        return list;
    }


}
