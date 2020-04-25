package cn.benevolence.sys.controller;

import cn.benevolence.sys.model.Echart;
import cn.benevolence.sys.service.EchartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-22 11:33
 */
@Controller
@RequestMapping("echart")
public class EchartController {
    @Autowired
    private EchartService echartService;

    @ResponseBody
    @GetMapping ("getdata")
    public Object echart(){
//        Map<String,Object> map =new HashMap<>();
        List<Echart> dept = echartService.deptNumber();
//        String[] x ={};
//        Integer[] s={};
//        for(int i=0;i<dept.size();i++){
//            x[i]=dept.get(i).getName();
//        }

//        String [] xdata={"骨科", "妇科", "皮肤科", "病毒科", "神经科", "心脑科"};
//        Integer[] sdate ={552, 500, 590, 600, 450, 600};
//        map.put("xdata",xdata);
//        map.put("sdate",sdate);
        return dept;
    }

    @ResponseBody
    @RequestMapping("zhexian")
    public Object zhenXian(){
        return echartService.users();
    }

    @ResponseBody
    @RequestMapping("hospatoal")
    public Object hospatoal(){
//        List hospatoal = echartService.hospatoal();
//        Map<String,Object> map =new HashMap<>();
//        String[] x ={"医生总数", "住院人数", "预约人数", "挂号人数", "医院总数"};
//        Integer[] s={};
//        for(int i=0;i<hospatoal.size();i++){
//            s= (Integer[]) hospatoal.get(i);
//        }
//        map.put("name",x);
//        map.put("number",s);
        return echartService.hospatoal();
    }

}
