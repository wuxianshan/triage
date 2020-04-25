package cn.benevolence.make.domodel;

import lombok.Data;

/**
 * @author xianshan
 * @create 2020-02 11:04
 */
@Data
public class MyInformation {
    private Integer id;
    private String patient;  //患者
    private String doctor;  //医生
    private String date;  //就诊日期
    private String content;  //就诊内容

}
