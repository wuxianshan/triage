package cn.benevolence.patient.controller;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.patient.model.Patient;
import cn.benevolence.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小马
 * @create 2020-02-16 15:38
 */
@Controller
@RequestMapping("patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("page")
    public String page(){
        return "patient/patient";
    }

    @GetMapping("money")
    public String mon(){
        return "patient/money";
    }

    @RequestMapping
    @ResponseBody
    public EData list(PageBean pageBean,String name){
        return patientService.list(pageBean,name);
    }

    @RequestMapping("moneys")
    @ResponseBody
    public R money(Integer pmoney,String pphone){
        return patientService.upMoney(pmoney, pphone);
    }

    @RequestMapping("save")
    @ResponseBody
    public R save(Patient patient){
        return patientService.save(patient);
    }

    @RequestMapping("del")
    @ResponseBody
    public R del(Integer pid){
        return patientService.del(pid);
    }

}
