package cn.benevolence.patient.domapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author 小马
 * @create 2020-02-16 16:16
 */
@Mapper
public interface PatientDoMapper {
    @Update("UPDATE patient SET pmoney=pmoney+#{pmoney}  WHERE pphone=#{pphone}  ")
    int upMoney(@Param("pmoney") Integer pmoney,@Param("pphone") String pphone);

}
