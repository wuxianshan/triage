package cn.benevolence.make.doMapper;

import cn.benevolence.doctor.model.Dept;
import cn.benevolence.doctor.model.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author xianshan
 * @create 2020-02 15:01
 */
@Mapper
public interface InformationDoMapper {
    @Select("SELECT did FROM doctor WHERE dname=#{doctor}")
    Integer getDoctorId(@Param("doctor") String doctor);

    @Select("SELECT pid FROM patient WHERE pname=#{patient}")
    Integer getPatientId(@Param("patient") String patient);

    @Update("UPDATE `information` SET isdel=1 WHERE id IN (${ids})")
    Integer deleteAllByIds(@Param("ids") String ids);

    @Select("SELECT name FROM tri_dept")
    List<Dept> getDeptList();

    //根据科室名称获取该科室下面的所有医生姓名
    @Select(" SELECT dname FROM doctor WHERE ddid=(SELECT id FROM tri_dept WHERE NAME=#{name})")
    List<Doctor> getDoctorList(@Param("name") String name);


}
