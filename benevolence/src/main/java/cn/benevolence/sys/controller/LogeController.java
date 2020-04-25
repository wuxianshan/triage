package cn.benevolence.sys.controller;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.sys.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小马
 * @create 2020-02-19 11:54
 */
@Controller
@RequestMapping("sys/log")
public class LogeController {
    @Autowired
    private LogService logService;

    @GetMapping("page")
    public String page(){
        return "sys/log";
    }

     @RequestMapping("list")
     @ResponseBody
     public EData log(PageBean pageBean,String name){
        return logService.list(pageBean,name);
        }

}
