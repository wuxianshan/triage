package cn.benevolence.sys.service;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.sys.model.Role;

/**
 * @author 小马
 * @create 2020-02-13 15:28
 */
public interface RoleService {

    EData list(PageBean pageBean, String name);


    R save(Role role);

    EData getAll();

    R del(Integer id);
}
