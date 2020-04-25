package cn.benevolence.controller;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.SimpleSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouxp
 * @create 2020-01-09 14:08
 */
@Controller
public class PageController {
    private static Session session = new SimpleSession();
    @GetMapping("index")
    public String index(){
        return "main";
    }

    @GetMapping("first")
    public String first(){
        return "first";
    }


    @ResponseBody
    @GetMapping ("getdata")
    public Object echart(){
        Map<String,Object> map =new HashMap<>();
        String [] xdata={"衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子","电视"};
        Integer[] sdate ={52, 100, 555, 10, 10, 20,999};
        map.put("xdata",xdata);
        map.put("sdate",sdate);
        return map;
    }

}
