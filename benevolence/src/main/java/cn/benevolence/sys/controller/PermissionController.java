package cn.benevolence.sys.controller;

import cn.benevolence.model.EUNode;
import cn.benevolence.model.R;
import cn.benevolence.sys.service.PermissionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小马
 * @create 2020-02-13 12:18
 */
@RestController
@RequestMapping("/sys/perm")
public class PermissionController {


    @Resource
    private PermissionService permissionService;

    @GetMapping()
    public List<EUNode> list(){
        return permissionService.getMenu(1);
    }

    @GetMapping("/right")
    public List<EUNode> getRight(Integer roleId){
        return permissionService.getRight(roleId);
    }

    @PostMapping("saveRolePerms")
    public R saveRolePerms(String menuIds, Integer roleId){
        return permissionService.saveRolePerms(menuIds,roleId);
    }
}
