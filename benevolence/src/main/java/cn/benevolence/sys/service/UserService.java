package cn.benevolence.sys.service;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.sys.model.User;

/**
 * @author 小马
 * @create 2020-02-19 21:03
 */
public interface UserService {

    R modifyPassword(String newPassword, String oldPassword);

    EData list(PageBean pageBean, String name);

    R save(User user);

    R del(Integer id);

    R saveRoleSet(String roleIds, String roleNames, Integer userId);
}
