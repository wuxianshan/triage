package cn.benevolence.doctor.domodel;

import lombok.Data;

/**
 * @author xianshan
 * @create 2020-02 20:43
 */
@Data
public class MySchedule {
    private Integer id;
//    private String deptName;  //对应schedule.html中医生排班表的科室名
//    private String docName;   //医生姓名
    private String sdate;
//    private String startdate; //开始日期
//    private String enddate;  //结束日期
    private Integer climit;  //每日该医生挂号最大数量
    private Integer sn;      //当日该医生名下已挂号
    private Integer docid;
    private String backgroundColor;
    private String dname;
    private String name;
}
