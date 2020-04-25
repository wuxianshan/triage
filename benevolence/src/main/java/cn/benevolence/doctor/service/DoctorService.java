package cn.benevolence.doctor.service;

import cn.benevolence.doctor.model.Dept;
import cn.benevolence.doctor.model.Doctor;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;

/**
 * @author JYSH
 * @create 2020-02-17-19:33
 */
public interface DoctorService {
    EData list(PageBean pageBean, String name);

    R save(Doctor doctor);

    R del(Integer did);

    EData deptList(PageBean pageBean, String name);

    R saveDept(Dept dept);

    EData dept(PageBean pageBean, String name);


    R deptDel(Integer id);
}
