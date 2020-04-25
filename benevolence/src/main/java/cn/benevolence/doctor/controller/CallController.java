package cn.benevolence.doctor.controller;

import cn.benevolence.doctor.service.CallService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.utils.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xianshan
 * @create 2020-03 11:29
 */
@Controller
@RequestMapping("doctor/call")
public class CallController {
    @Autowired
    private CallService callService;

    @GetMapping("page")
    public String topage(){
        return "doctor/call";
    }

    //查询登录医生名下的，所有患者排队信息
    @GetMapping("list")
    @SysLog("预约浏览")
    @ResponseBody  //返回json格式
    public EData getMyTriageList(PageBean pageBean, String name){
        return callService.getMyTriageList(pageBean,name);
    }

    //就诊
    @PostMapping("update")
    @ResponseBody
    public EData update(Integer curpatientid){
        return callService.update(curpatientid);
    }

    //根据status的状态获取待诊人数
    @PostMapping("getWaitingNum")
    @ResponseBody
    public Integer getWaitingNumByDeptId(Integer status){
        return callService.getWaitingNumByStatus(status);
    }

    //根据deptid和doctorid获取当前候诊人 和  下一位候诊人的姓名
    @PostMapping("getCurAndNextPatient")
    @ResponseBody
    public EData getCurAndNextPatient(Integer curpatientid, Integer nextpatientid, Integer status){
        return callService.getCurAndNextPatient(curpatientid,nextpatientid,status);
    }


}
