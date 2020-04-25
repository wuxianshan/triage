package cn.benevolence.sys.domapper;

import org.apache.ibatis.annotations.*;

/**
 * @author fanwb
 * @create 2020-01-11 10:47
 */
@Mapper
public interface RoleDoMapper {
    @Update("UPDATE role SET isdel =1 WHERE id IN(${ids})")
    int deleteAll(String ids);

    @Insert("INSERT INTO sys_user_role(userid,roleid)\n" +
            "SELECT #{userId} ,id FROM role WHERE id IN(${roleIds})")
    int insertUserRole(@Param("userId") Integer userId,
                       @Param("roleIds") String roleIds);

    @Delete("DELETE FROM sys_user_role WHERE userid=#{userId}")
    int deleteByUser(Integer userId);
}
