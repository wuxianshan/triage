package cn.benevolence.doctor.doMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author xianshan
 * @create 2020-02 11:27
 */
@Mapper
public interface DeptDoMapper {
    @Update("UPDATE `tri_dept` SET isdel=1 WHERE id IN (${ids})")
    Integer deleteAllByIds(@Param("ids") String ids);

    @Select("SELECT dalias FROM tri_dept WHERE NAME=#{deptName}")
    String getDalias(@Param("deptName") String deptName);

    @Select("SELECT id FROM tri_dept WHERE NAME=#{deptName}")
    Integer getdeptid(@Param("deptName") String deptName);
}
