package cn.benevolence.doctor.domodel;

import cn.benevolence.make.model.Registration;
import lombok.Data;

/**
 * @author xianshan
 * @create 2020-03 15:37
 */
@Data
public class MyCall extends Registration {
    private String pname;
    private String deptname;
    private String dname;
    private Integer total; //前方排队人数
    private String state; //就诊状态
}
