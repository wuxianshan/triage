package cn.benevolence.sys.domapper;

import cn.benevolence.doctor.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-22 16:39
 */
@Mapper
public interface EchartDoMapper {
    //查询科室ID及名字
    @Select("select id,name from tri_dept")
    List<Dept> dept();
    //查询一周内各科室的就诊人数
    @Select("SELECT COUNT(1) FROM make_registration WHERE YEARWEEK(DATE_FORMAT(resdate,'%Y-%m-%d'),1) = YEARWEEK(NOW(),1) AND deptid=#{deptid}  AND STATUS=2")
    Integer deptCount(@Param("deptid")Integer deptid);

    @Select("SELECT COUNT(1) FROM doctor WHERE ddid=#{ddid} ")
    Integer doctorNumber(@Param("ddid") Integer ddid);

    @Select("SELECT COUNT(1) FROM patient WHERE isdel=0")
    Integer patientZ();

    @Select("SELECT COUNT(1) FROM patient WHERE psex=0")
    Integer gender0();
    @Select("SELECT COUNT(1) FROM patient WHERE psex=1")
    Integer gender1();
    @Select("SELECT COUNT(1) FROM patient WHERE isdel=1")
    Integer huifu();
    @Select("SELECT COUNT(1) FROM patient")
    Integer count();
    //医生总数
    @Select("SELECT COUNT(1) FROM doctor WHERE isdel=0")
    Integer doctors();
    //预约人数
    @Select("SELECT COUNT(1) FROM make_information WHERE isdel=0")
    Integer yuyue();
    //挂号人数
    @Select("SELECT COUNT(1) FROM make_registration WHERE isdel=0")
    Integer guahao();

    //查询每周每一天的数据 周一
    @Select("SELECT * FROM v_week1")
    Integer week1();
    //周二
    @Select("SELECT * FROM v_week2")
    Integer week2();
    //周三
    @Select("SELECT * FROM v_week3")
    Integer week3();
    //周四
    @Select("SELECT * FROM v_week4")
    Integer week4();
    //周五
    @Select("SELECT * FROM v_week5")
    Integer week5();
    //周六
    @Select("SELECT * FROM v_week6")
    Integer week6();
    //周天
    @Select("SELECT * FROM v_week7")
    Integer week7();
    //整月
    @Select("SELECT * FROM v_month")
    Integer month();


}
