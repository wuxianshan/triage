package cn.benevolence.doctor.service;

import cn.benevolence.doctor.domodel.MySchedule;
import cn.benevolence.doctor.model.Doctor;
import cn.benevolence.doctor.model.Scheduling;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-26 17:32
 */
public interface SchService {


    List<Doctor> list();

    List<Scheduling> workList();

    String getDeptName(Integer id);

    R save(Scheduling scheduling);

    List<MySchedule>  evens();

    EData doclist(PageBean pageBean, Integer deptid, String position);

    R del(Integer id);

    R upWork(Scheduling scheduling);
}
