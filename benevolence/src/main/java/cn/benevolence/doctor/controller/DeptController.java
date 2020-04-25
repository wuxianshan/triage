package cn.benevolence.doctor.controller;

import cn.benevolence.doctor.model.Dept;
import cn.benevolence.doctor.service.DeptService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xianshan
 * @create 2020-02 11:00
 */
@Controller
@RequestMapping("doctor/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping("page")
    public String topage(){
        return "doctor/dept";
    }

    @GetMapping
    @ResponseBody
    public EData list(PageBean pageBean, String name){
        System.out.println("进入--------------");

        return deptService.list(pageBean,name);
    }
    @PostMapping
    @ResponseBody
    public R save(Dept dept){
        return deptService.save(dept);
    }
    @PostMapping("/delete")
    @ResponseBody
    public R delete(Integer id){
        return deptService.delete(id);
    }
    @PostMapping("/deleteAll")
    @ResponseBody
    public R deleteAll(String ids){
        return deptService.deleteAll(ids);
    }


}
