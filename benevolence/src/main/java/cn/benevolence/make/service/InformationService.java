package cn.benevolence.make.service;

import cn.benevolence.doctor.model.Doctor;
import cn.benevolence.make.domodel.MyInformation;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;

import java.util.List;

/**
 * @author xianshan
 * @create 2020-02 11:09
 */
public interface InformationService {

    EData list(PageBean pageBean, String name);

    R save(MyInformation myInformation);

    R del(Integer did);

    R deleteAll(String ids);

    EData deptList();

    List<Doctor> doctorList(String name);
}
