package cn.benevolence.sys.service;

import cn.benevolence.model.R;
import cn.benevolence.model.EUNode;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-13 11:17
 */
public interface PermissionService {

    List<EUNode> getMenu(Integer userId);
    List<EUNode> getRight(Integer roleId);

    R saveRolePerms(String menuIds, Integer roleId);

}
