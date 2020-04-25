package cn.benevolence.sys.domapper;

import cn.benevolence.sys.model.Permission;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-13 11:20
 */
@Mapper
public interface PermissionDoMapper {

    @Select("SELECT id,pid,cname,url,icon FROM sys_permission WHERE id IN(\n" +
            "            SELECT permid FROM sys_role_permission WHERE roleid IN(\n" +
            "            SELECT roleid FROM sys_user_role WHERE userid=#{userId})) AND isdel=0 AND isstop=0 AND ctype=0\n")
    List<Permission> getMenu(@Param("userId") Integer userId);

    @Select("SELECT id,pid,cname,icon,IF(p1.permid IS NULL,0,1) isdel FROM sys_permission p LEFT JOIN(\n" +
            "SELECT permid FROM sys_role_permission WHERE roleid=#{roleId}) p1 ON (p.id=p1.permid) WHERE p.isdel=0")
    List<Permission> getRight(@Param("roleId") Integer roleId);

    @Insert("INSERT INTO sys_role_permission (roleid,permid) \n" +
            "SELECT #{roleId},id FROM sys_permission WHERE id\n" +
            "IN(${permIds})")
    Integer insertRolePerms(@Param("roleId") Integer roleId,
                            @Param("permIds") String permIds);

    @Delete("DELETE FROM sys_role_permission WHERE roleid=#{roleId}")
    Integer deleteRolePerms(@Param("roleId") Integer roleId);

    @Select("SELECT perm FROM sys_permission  WHERE id IN(SELECT permid FROM sys_role_permission WHERE roleid IN(SELECT roleid FROM sys_user_role WHERE userid=#{userid} ))")
    List<String> getPermByUserid(@Param("userid") Integer userid);
}
