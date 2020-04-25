package cn.benevolence.make.domodel;

import cn.benevolence.doctor.model.Scheduling;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author xianshan
 * @create 2020-02 20:43
 */
@Data
public class MySchedule1 extends Scheduling {
    private Integer id;
    private String dname; //医生姓名
    private String deptname;
    private String yuhao;
    private String patientname;
    private Integer did;
    private Integer ddid;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date sdate;
}
