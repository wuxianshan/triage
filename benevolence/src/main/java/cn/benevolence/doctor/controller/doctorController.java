package cn.benevolence.doctor.controller;

import cn.benevolence.doctor.model.Dept;
import cn.benevolence.doctor.model.Doctor;
import cn.benevolence.make.service.InformationService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.doctor.service.DoctorService;
import cn.benevolence.utils.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author 小马
 * @create 2020-02-19-19:00
 */
@Controller
@RequestMapping("doctor/doctor")
public class doctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("page")
    public String page() {
        return "doctor/doctor";  //返回doctor/doctor.html
    }

    @GetMapping("deptPage")
    public String deptPage(){
        return "doctor/dept";
    }

    //查询所有医生信息
    @RequestMapping("dept")
    @SysLog("医生信息浏览")
    @ResponseBody //返回json格式
    public EData list(PageBean pageBean, String name){
        return doctorService.deptList(pageBean, name);
    }

    @PostMapping("/save")
    @ResponseBody
    public R save(Doctor doctor){
        return doctorService.save(doctor);
    }

    @PostMapping("/del")
    @ResponseBody
    public R del(Integer did){
        System.out.println(did);
        return doctorService.del(did);
    }

    @Autowired
    private InformationService informationService;

    @PostMapping("deptall")
    @ResponseBody
    public EData deptList(){
        return informationService.deptList();
    }


    @RequestMapping("deptlist")
    @ResponseBody
    public EData deptList(PageBean pageBean,String name){
        return doctorService.dept(pageBean,name);
    }

    @RequestMapping("deptSave")
    @ResponseBody
    public R saveDept(Dept dept){
        return doctorService.saveDept(dept);
    }

    @RequestMapping("deptDel")
    @ResponseBody
    public R deptDel(Integer id){
        return doctorService.deptDel(id);
    }

}
