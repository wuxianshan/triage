package cn.benevolence.history.controller;

import cn.benevolence.history.service.HistoryService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.patient.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小马
 * @create 2020-02-15 14:55
 */
@Controller
@RequestMapping("history")
public class HistoryController {
    @Autowired
    private HistoryService historyService;

    @GetMapping("page")
    public String page(){
        return "history/history";
    }

    @RequestMapping("list")
    @ResponseBody
    public EData list(PageBean pageBean,String name){
        return historyService.list(pageBean,name);
    }

    @RequestMapping("save")
    @ResponseBody
    public R save(Patient patient){
        return historyService.save(patient);
    }

    @RequestMapping("del")
    @ResponseBody
    public R del(Integer id){
        return historyService.del(id);
    }

    @RequestMapping("like")
    @ResponseBody
    public EData like(PageBean pageBean,String pname){
        return historyService.likeList(pageBean, pname);
    }
    @RequestMapping("likes")
    @ResponseBody
    public EData likes(PageBean pageBean,String pname){
        return historyService.like(pageBean,pname);
    }



    @GetMapping("pagelike")
    public String pageLike(){
        return "history/pati";
    }

    @RequestMapping("all")
    @ResponseBody
    public EData all(PageBean pageBean,String name){
        return historyService.all(pageBean,name);
    }

    @RequestMapping("psave")
    @ResponseBody
    public R psave(Integer id,String pid, String hdiagnose, String hsymptom, String hprescription){
        System.out.println(id+pid+hdiagnose+hdiagnose+hprescription);
        return historyService.saveIn(id,pid, hdiagnose, hsymptom, hprescription);
    }

}
