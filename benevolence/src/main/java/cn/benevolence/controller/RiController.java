package cn.benevolence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 小马
 * @create 2020-02-24 12:36
 */
@Controller
@RequestMapping("riqi")
public class RiController {

    @RequestMapping("dd")
    public String dd(){
        return "ddd";
    }

    @GetMapping("element")
    public String ht(){
        return "16";
    }

}
