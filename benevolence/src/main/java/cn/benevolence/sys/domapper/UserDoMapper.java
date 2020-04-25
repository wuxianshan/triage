package cn.benevolence.sys.domapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 小马
 * @create 2020-03-18 12:54
 */
@Mapper
public interface UserDoMapper {
    @Select("SELECT id FROM sys_user WHERE cname=#{name} ")
    Integer userId(@Param("name") String name);
}
