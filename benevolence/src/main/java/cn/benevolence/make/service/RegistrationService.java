package cn.benevolence.make.service;

import cn.benevolence.make.domodel.MySchedule1;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;

/**
 * @author xianshan
 * @create 2020-02 15:58
 */
public interface RegistrationService {

    EData list(PageBean pageBean, String name);

    R save(MySchedule1 mySchedule1);

    /*R deleteAll(String ids);*/

    R delete(Integer id);

    EData getUserRegByuserId();

    EData doclist(PageBean pageBean, String name);

    EData doclist1(PageBean pageBean, Integer deptid, String position);

    EData doclist2(PageBean pageBean, Integer deptid, String position);


}
