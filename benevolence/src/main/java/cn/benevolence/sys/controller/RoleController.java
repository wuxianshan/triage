package cn.benevolence.sys.controller;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.sys.model.Role;
import cn.benevolence.sys.service.RoleService;
import cn.benevolence.utils.SysLog;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小马
 * @create 2020-02-13 15:27
 */
@Controller
@RequestMapping("sys/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("page")
    public String page(){
        return "sys/role";
    }

    @RequestMapping
    @SysLog("角色浏览")
    @ResponseBody
    public EData list(PageBean pageBean,String name){
        return roleService.list(pageBean,name);
    }

    @PostMapping
    @ResponseBody
    @RequiresPermissions("sys:role:sava")
    public R save(Role role){
       return roleService.save(role);
    }

    @PostMapping("del")
    @RequiresPermissions("sys:role:delete")
    @ResponseBody
    public R del(Integer id){
        return roleService.del(id);
    }


    @GetMapping("getAll")
    @RequiresPermissions("sys:role:getAll")
    @ResponseBody
    public EData getAll(PageBean pageBean, String name){
        return roleService.getAll();
    }

}
