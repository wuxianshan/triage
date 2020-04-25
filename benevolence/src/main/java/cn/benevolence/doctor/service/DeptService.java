package cn.benevolence.doctor.service;

import cn.benevolence.doctor.model.Dept;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;

/**
 * @author xianshan
 * @create 2020-02 11:25
 */
public interface DeptService {
    EData list(PageBean pageBean, String name);

    R save(Dept dept);

    R delete(Integer id);

    R deleteAll(String ids);

}
