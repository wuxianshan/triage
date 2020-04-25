package cn.benevolence.history.domapper;

import cn.benevolence.history.model.History;
import cn.benevolence.patient.model.Patient;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-15 16:28
 */
@Mapper
public interface HistoryDoMapper {
    @Select("SELECT history.`id`,patient.`pname` as pid, hdiagnose,hsymptom,hprescription FROM history JOIN patient ON patient.`pid`=history.`pid`")
    List<History> listAll();

    @Select("SELECT patient.`pid`,patient.`pname`,doctor.`dname` as pdname,patient.`hsymptom`, patient.`hdiagnose`,patient.`hprescription`\n" +
            "FROM patient LEFT JOIN p_d ON patient.`pid`=p_d.`pid` \n" +
            "JOIN doctor ON doctor.`did`=p_d.`did` WHERE patient.pname LIKE CONCAT('%',#{pname} ,'%')")
    List<Patient> likeList(@Param("pname") String pname);

    @Select("SELECT history.`id`,patient.`pname` AS pid,history.`hdiagnose`,history.`hprescription`,history.`hsymptom`\n" +
            "FROM history JOIN patient ON history.`pid`=patient.`pid` WHERE history.`isdel`=0")
    List<History> all();

    @Insert("INSERT INTO history(pid,hdiagnose,hsymptom,hprescription) \n" +
            "VALUES(#{pid} ,#{hdiagnose} ,#{hsymptom} ,#{hprescription} )")
    int save(@Param("pid")String pid,@Param("hdiagnose") String hdiagnose,
             @Param("hsymptom") String hsymptom,@Param("hprescription") String hprescription);

    @Select("SELECT patient.`pid` FROM patient WHERE patient.`pname`=#{name} ")
    String patientId(@Param("name") String name);

    @Select("SELECT history.`id`,patient.`pname` AS pid,doctor.`dname` AS did,history.`hdiagnose`,history.`hsymptom`,history.`hprescription` FROM history LEFT JOIN doctor ON history.`did`=doctor.`did`\n" +
            "JOIN patient ON patient.`pid`=history.`pid`\n" +
            "WHERE history.`pid`=(SELECT patient.`pid` FROM patient WHERE patient.`pname`=#{pname} ) AND patient.`isdel`=0")
    List<History> like(@Param("pname")String pname);

    @Select("SELECT doctorid FROM make_registration WHERE patientid=#{patientid}")
    Integer doctorid(@Param("patientid")String patientid);

    @Update("UPDATE history SET did=#{did}  WHERE pid=#{pid} ")
    Integer updid(@Param("did")String did,@Param("pid") String pid);

}
