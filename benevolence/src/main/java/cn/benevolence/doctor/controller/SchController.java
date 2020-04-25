package cn.benevolence.doctor.controller;

import cn.benevolence.doctor.model.Scheduling;
import cn.benevolence.doctor.service.SchService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小马
 * @create 2020-02-26 16:32
 */
@Controller
@RequestMapping("doctor/demo")
public class SchController {
    @Autowired
    private SchService schService;

    @GetMapping("page")
    public String page(){
        return "doctor/demo";
    }

    @GetMapping("doc")
    @ResponseBody
    public Object doc(){
        return schService.list();
    }

    @GetMapping("work")
    @ResponseBody
    public Object work(){
        return schService.evens();
    }

    @GetMapping("getDeptName")
    @ResponseBody
    public Object getDeptName(Integer id){
        return schService.getDeptName(id);
    }

    @RequestMapping("save")
    @ResponseBody
    public R save(Scheduling scheduling){
        System.out.println("is"+scheduling.getId());
        System.out.println("is"+scheduling.getDocid());
        System.out.println("is"+scheduling.getBackgroundcolor());

        return schService.save(scheduling);
    }

    @GetMapping("evens")
    public Object evens(){
        return schService.evens();
    }

    //根据部门信息和职称获取医生值班信息
    @GetMapping("list")
    @ResponseBody //返回json格式
    public EData list(PageBean pageBean, Integer deptid, String position){
        System.out.println(deptid+position);
        return schService.doclist(pageBean,deptid,position);
    }

    @GetMapping("del")
    @ResponseBody
    public R del(Integer id){
        return schService.del(id);
    }

    @GetMapping("upwork")
    @ResponseBody
    public R upWork(Scheduling scheduling){
        return schService.upWork(scheduling);
    }

}
