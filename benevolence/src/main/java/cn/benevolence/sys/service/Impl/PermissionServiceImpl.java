package cn.benevolence.sys.service.Impl;

import cn.benevolence.model.EUAttributes;
import cn.benevolence.model.R;
import cn.benevolence.sys.domapper.PermissionDoMapper;
import cn.benevolence.sys.model.Permission;
import cn.benevolence.sys.service.PermissionService;
import cn.benevolence.model.EUNode;
import cn.benevolence.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小马
 * @create 2020-02-13 11:18
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDoMapper permissionDoMapper;

    //菜单：树形结构
    @Override
    public List<EUNode> getMenu(Integer userId) {
        List<Permission> perms=permissionDoMapper.getMenu(ShiroUtils.getUserId());
        List<EUNode> nodes=new ArrayList<>();
        createNode(perms,nodes,-1);
        return nodes;
    }

    @Override
    public List<EUNode> getRight(Integer roleId) {
        List<Permission> perms=permissionDoMapper.getRight(roleId);
        List<EUNode> nodes=new ArrayList<>();
        createNode(perms,nodes,-1);
        return nodes;
    }

    @Transactional
    @Override
    public R saveRolePerms(String menuIds, Integer roleId) {
        permissionDoMapper.deleteRolePerms(roleId);
        permissionDoMapper.insertRolePerms(roleId,menuIds);
        return R.ok();
    }

    private void createNode(List<Permission> perms, List<EUNode> nodes, Integer pid) {
        for (Permission perm:perms){
            if (perm.getPid().equals(pid)){
                EUNode node=new EUNode();
                node.setId(perm.getId());
                node.setText(perm.getCname());
                node.setIconCls(perm.getIcon());
                node.setChildren(new ArrayList<>());
                node.setChecked(perm.getIsdel());
                createNode(perms,node.getChildren(),perm.getId());
                if (node.getChildren().size()>0){
                    node.setState("closed");
                }else {
                    node.setState("open");
                    if (!StringUtils.isEmpty(perm.getUrl())){
                        node.setAttributes(new EUAttributes(perm.getUrl()));
                    }
                }
                nodes.add(node);
            }
        }
    }
}
