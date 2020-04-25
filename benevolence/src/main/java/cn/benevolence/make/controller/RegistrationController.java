package cn.benevolence.make.controller;

import cn.benevolence.make.domodel.MySchedule1;
import cn.benevolence.make.service.RegistrationService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.utils.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xianshan
 * @create 2020-02 15:52
 */
@Controller
@RequestMapping("make/regist")
public class RegistrationController {
   @Autowired
    private RegistrationService registrationService;
    //页面跳转：在线预约
    @GetMapping("page")
    public String toPage(){
        return "make/registration";
    }
    //显示所有挂号列表
    @GetMapping("info")
    public String toInfo(){
        return "make/info";
    }
    //跳转到本地挂号窗口
    @GetMapping("local")
    public String tocall(){
        return "make/local";
    }
    //跳转到我的预约页面
    @GetMapping("myInfo")
    public String myInfo(){
        return "make/myInfo";
    }

    //查询所有挂号信息
    @GetMapping
    @SysLog("预约浏览")
    @ResponseBody  //返回json格式
    public EData list(PageBean pageBean, String name){
        return registrationService.list(pageBean,name);
    }

    //根据登录名查询用户挂号信息
    @GetMapping("myReg")
    @ResponseBody  //返回json格式
    public EData myReg(){
        return registrationService.getUserRegByuserId();
    }

    //添加挂号信息
    @PostMapping("save")
    @ResponseBody  //返回json格式
    public R save(MySchedule1 mySchedule1){
        System.out.println(mySchedule1.toString());
        return registrationService.save(mySchedule1);
    }
    //批量删除
/*    @PostMapping("/deleteAll")
    @ResponseBody
    public R deleteAll(String ids){
        return registrationService.deleteAll(ids);
    }*/
    //删除单条数据
    @PostMapping("/delete")
    @ResponseBody
    public R delete(Integer id){
        return registrationService.delete(id);
    }

    //获取所有值班的医生
    @GetMapping("doclist")
    @ResponseBody  //返回json格式
    public EData doclist(PageBean pageBean, String name){
        return registrationService.doclist(pageBean,name);
    }

    //根据部门信息和职称获取当日医生值班信息
    @GetMapping("doclist1")
    @ResponseBody //返回json格式
    public EData list(PageBean pageBean, Integer deptid, String position){
        return registrationService.doclist1(pageBean,deptid,position);
    }
   //根据部门信息和职称获取大于等于当前时间的医生值班信息
   @GetMapping("list1")
   @ResponseBody //返回json格式
   public EData list1(PageBean pageBean, Integer deptid, String position){
    return registrationService.doclist2(pageBean,deptid,position);
   }


}
