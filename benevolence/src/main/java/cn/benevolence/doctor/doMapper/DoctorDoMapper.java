package cn.benevolence.doctor.doMapper;

import cn.benevolence.doctor.model.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-19 17:54
 */
@Mapper
public interface DoctorDoMapper {
    @Select("SELECT doctor.`did`,doctor.`dname`,doctor.`dage`,doctor.`dsex`,tri_dept.`name` AS ddid,doctor.`deducation` FROM doctor LEFT \n" +
            "JOIN tri_dept ON doctor.`ddid`=tri_dept.`id` WHERE doctor.`isdel`=0")
    List<Doctor> list();
    @Select("SELECT did FROM doctor WHERE dname=#{docName}")
    Integer getdocid(@Param("docName") String docName);

}
