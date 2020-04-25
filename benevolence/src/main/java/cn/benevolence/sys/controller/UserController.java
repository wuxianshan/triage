package cn.benevolence.sys.controller;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.sys.model.User;
import cn.benevolence.sys.service.UserService;
import cn.benevolence.utils.SysLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 小马
 * @create 2020-02-20 15:18
 */
@Controller
@RequestMapping("sys/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("page")
    public String toPage(){
        return "sys/user";
    }

    @GetMapping
    @SysLog("用户浏览")
    @ResponseBody
    public EData list(PageBean pageBean, String name){
        return userService.list(pageBean,name);
    }

    @PostMapping
    @ResponseBody
    public R save(User user){
        return userService.save(user);
    }

    @PostMapping("del")
    @ResponseBody
    public R del(Integer id){
        return userService.del(id);
    }

    @PostMapping("saveRoleSet")
    @ResponseBody
    public R saveRoleSet(String roleIds,String roleNames,Integer userId){
        System.out.println("roleId>>>"+roleIds+"rolename>>>"+roleNames+"userId>>>>>"+userId);
        return userService.saveRoleSet(roleIds,roleNames,userId);
    }


}
