package cn.benevolence.make.doMapper;

import cn.benevolence.make.domodel.MyRegistration;
import cn.benevolence.make.domodel.MySchedule1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

/**
 * @author xianshan
 * @create 2020-02 18:55
 */
//    @Select("SELECT f_generate_sn(#{docid},DATE_ADD(#{sdate},INTERVAL 1 DAY))")
@Mapper
public interface RegistrationDoMapper {
    @Select("SELECT f_generate_sn(#{docid},#{sdate})")
    Integer getsn(@Param("docid") Integer docid, @Param("sdate") Date sdate);

    @Select("SELECT pid FROM patient WHERE pname=#{patientname}")
    Integer getpid(@Param("patientname") String patientname);

    @Update("UPDATE make_registration SET isdel=1 WHERE id IN (${ids})")
    Integer deleteAllByIds(@Param("ids") String ids);

    @Select("SELECT doc_scheduling.*,doctor.did,doctor.ddid,doctor.dname,(doc_scheduling.climit-doc_scheduling.sn) AS yuhao,tri_dept.name AS deptname \n" +
            "FROM doc_scheduling LEFT JOIN doctor ON doctor.did=doc_scheduling.docid JOIN tri_dept\n" +
            "ON doctor.ddid=tri_dept.id WHERE doctor.ddid=#{deptid} AND doctor.position=#{position} AND doc_scheduling.sdate>=#{sdate} ORDER BY sdate ASC")
    List<MySchedule1> doclist2(@Param("deptid") Integer deptid, @Param("position") String position, @Param("sdate") String sdate);

    @Select("SELECT doc_scheduling.*,doctor.did,doctor.ddid,doctor.dname,(doc_scheduling.climit-doc_scheduling.sn) AS yuhao,tri_dept.name as deptname\n" +
            "FROM doc_scheduling LEFT JOIN doctor ON doctor.did=doc_scheduling.docid JOIN tri_dept ON doctor.ddid=tri_dept.id\n" +
            "WHERE sdate=#{sdate}")
    List<MySchedule1> getdlist(@Param("sdate") String sdate);

    @Select("SELECT doc_scheduling.*,doctor.did,doctor.ddid,doctor.dname,(doc_scheduling.climit-doc_scheduling.sn) AS yuhao,tri_dept.name AS deptname \n" +
            "FROM doc_scheduling LEFT JOIN doctor ON doctor.did=doc_scheduling.docid JOIN tri_dept\n" +
            "ON doctor.ddid=tri_dept.id WHERE doctor.ddid=#{ddid} AND doctor.position=#{position} AND doc_scheduling.sdate=#{sdate}")
    List<MySchedule1> getdlist1(@Param("ddid") Integer ddid, @Param("position") String position, @Param("sdate") String sdate);

    //根据用户登录名 查询用户预约信息
    @Select("SELECT make_registration.id,make_registration.number,make_registration.resdate,patient.pname AS patientname,tri_dept.name AS deptname,doctor.dname\n" +
            "FROM make_registration,patient,tri_dept,doctor WHERE patient.pid=make_registration.patientid AND tri_dept.id=make_registration.deptid\n" +
            "AND doctor.did=make_registration.doctorid AND make_registration.uid=#{uid} AND make_registration.isdel =0")
    List<MyRegistration> getUserRegByuserId(@Param("uid") Integer uid);

    //查询用户是否已经预约当天的号
    @Select("SELECT make_registration.* FROM make_registration,patient WHERE patient.pid=make_registration.patientid\n" +
            "AND patientid=#{patientid} AND deptid=#{deptid} AND doctorid=#{doctorid} AND make_registration.isdel=0 AND resdate=#{resdate}")
    MyRegistration getRegByCondition(@Param("patientid") Integer patientid, @Param("deptid") Integer deptid,
                                     @Param("doctorid") Integer doctorid, @Param("resdate") String resdate);
}
