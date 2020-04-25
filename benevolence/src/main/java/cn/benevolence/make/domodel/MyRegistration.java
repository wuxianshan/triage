package cn.benevolence.make.domodel;

import cn.benevolence.make.model.Registration;
import lombok.Data;

/**
 * @author xianshan
 * @create 2020-03 9:30
 */
@Data
public class MyRegistration extends Registration {
    private String patientname;
    private String dname; //医生姓名
    private String deptname;
}
