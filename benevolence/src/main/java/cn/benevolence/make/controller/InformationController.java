package cn.benevolence.make.controller;

import cn.benevolence.doctor.model.Doctor;
import cn.benevolence.make.domodel.MyInformation;
import cn.benevolence.make.service.InformationService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 在线预约controller
 * @author xianshan
 * @create 2020-02 8:53
 */
@Controller
@RequestMapping("make/info")
public class InformationController {
    @Autowired
    private InformationService informationService;
    @Autowired

    @GetMapping("page")
    public String page(){
        return "make/information";  //返回make/info.html
    }

    //查询所有挂号信息
    @GetMapping
    @ResponseBody  //返回json格式
    public EData list(PageBean pageBean, String name){
        return informationService.list(pageBean,name);
    }
    //挂号：新增一条挂号信息
    @PostMapping("save")
    @ResponseBody
    public R save(MyInformation myInformation){
        System.out.println( myInformation.toString() );
        return informationService.save(myInformation);
    }

    @PostMapping("del")
    @ResponseBody
    public R del(Integer id){
        System.out.println( id);
        return informationService.del(id);
    }

    @PostMapping("/deleteAll")
    @ResponseBody
    public R deleteAll(String ids){
        return informationService.deleteAll(ids);
    }

    @PostMapping("deptList")
    @ResponseBody
    public EData deptList(){
        return informationService.deptList();
    }

    @PostMapping("doctorList")
    @ResponseBody
    public List<Doctor> doctorList(String name){
        System.out.println("name======" + name);
        return informationService.doctorList(name);
    }

}
