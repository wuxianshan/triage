package cn.benevolence.doctor.doMapper;


import cn.benevolence.doctor.domodel.MyCall;
import cn.benevolence.doctor.model.Doctor;
import cn.benevolence.patient.model.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


/**
 * @author xianshan
 * @create 2020-03 15:33
 */
@Mapper
public interface CallDoMapper {
   /* //1.获取当日所有的患者排队信息
    @Select("SELECT make_registration.*,patient.pname,tri_dept.name AS deptname,doctor.dname,(SELECT COUNT(0) FROM make_registration WHERE STATUS=0)total\n" +
            "FROM make_registration LEFT JOIN patient ON patient.pid=make_registration.patientid JOIN tri_dept\n" +
            "ON make_registration.deptid=tri_dept.id JOIN doctor ON doctor.did=make_registration.doctorid where resdate=#{resdate}")
    List<MyCall> getMyTriageList(@Param("resdate")String resdate);
*/
    //2.查询表中第一个status为0的id
    @Select("SELECT id FROM make_registration WHERE deptid=#{deptid} AND STATUS=0 and resdate=#{resdate} ORDER BY number LIMIT 0,1")
    Integer gets0(@Param("deptid") Integer deptid,
                  @Param("resdate") String resdate);


    //2-1.查询表中第一个前2个  status为0的病人的信息（xin）
    @Select("SELECT make_registration.*,patient.pname FROM make_registration LEFT JOIN patient ON patient.pid=make_registration.patientid\n" +
            "WHERE STATUS=0 AND resdate=#{resdate} AND doctorid=#{doctorid} ORDER BY number ASC LIMIT 0,2")
    List<MyCall> getCurAndNextPatient(@Param("resdate") String resdate,
                                      @Param("doctorid") Integer doctorid);

    //2-2根据curpatientid 修改status(xin)
    @Update("UPDATE make_registration SET STATUS=#{STATUS} WHERE patientid=#{patientid} AND resdate=#{resdate} AND doctorid=#{doctorid}")
    Integer updateStatus(@Param("STATUS") Integer STATUS,
                         @Param("patientid") Integer patientid,
                         @Param("resdate") String resdate,
                         @Param("doctorid") Integer doctorid);

    //查询表中status=1的
    @Select("SELECT id FROM make_registration WHERE deptid=#{deptid} AND STATUS=1 and resdate=#{resdate}")
    Integer gets1(@Param("deptid") Integer deptid,
                  @Param("resdate") String resdate);

    //3.修改status
    @Update("UPDATE make_registration SET STATUS=1 WHERE id=#{id}")
    void update0(@Param("id") Integer id);
    @Update("UPDATE make_registration SET STATUS=2 WHERE id=#{id}")
    void update1(@Param("id") Integer id);


    //4.根据DoctorId查询患者未就诊的患者信息  (0316)
    @Select("SELECT make_registration.*,patient.pname,tri_dept.name AS deptname,doctor.dname,(SELECT COUNT(0) FROM make_registration WHERE STATUS=0)total\n" +
            "FROM make_registration LEFT JOIN patient ON patient.pid=make_registration.patientid JOIN tri_dept\n" +
            "ON make_registration.deptid=tri_dept.id JOIN doctor ON doctor.did=make_registration.doctorid WHERE resdate=#{resdate} and doctorid=#{doctorid} and status=0")
    List<MyCall> getPatientByDoctorId(@Param("resdate") String resdate,
                                      @Param("doctorid") Integer doctorid);
    //4-1.根据医生姓名查询医生的id  (0316)
    @Select("SELECT did FROM doctor WHERE dname=#{dname}")
    Integer getDidByDname(@Param("dname") String dname);

    //5.根据status的状态获取待诊人数  (0316)
    @Select("SELECT COUNT(0) FROM make_registration WHERE STATUS=#{status} AND resdate=#{resdate} AND doctorid=#{doctorid}")
    Integer getWaitingNumByStatus(@Param("status") Integer status,
                                  @Param("resdate") String resdate,
                                  @Param("doctorid") Integer doctorid);
    //根据patientid:查出patientname  (0316)
    @Select("SELECT * FROM patient WHERE pid=#{pid}")
    List<Patient> getPnameByPid(@Param("pid") Integer pid);

    //根据id查询mycall
    @Select("SELECT make_registration.*,patient.pname,tri_dept.name AS deptname,doctor.dname\n" +
            "FROM make_registration LEFT JOIN patient ON patient.pid=make_registration.patientid JOIN tri_dept\n" +
            "ON make_registration.deptid=tri_dept.id JOIN doctor ON doctor.did=make_registration.doctorid \n" +
            "WHERE STATUS=#{STATUS} AND resdate=#{resdate} AND make_registration.id=#{id}")
    List<MyCall> getMyCall(@Param("STATUS") Integer STATUS,
                           @Param("resdate") String resdate,
                           @Param("id") Integer id);

    //根据deptid查询医生信息
    @Select("SELECT * FROM doctor WHERE ddid=#{ddid}")
    List<Doctor> getdocBydeptId(@Param("ddid") Integer ddid);

}
