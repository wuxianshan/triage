package cn.benevolence.sys.domapper;

import cn.benevolence.sys.model.Log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-19 13:34
 */
@Mapper
public interface LogDoMapper {

    @Select("SELECT * FROM sys_log ")
    List<Log> all();


}
