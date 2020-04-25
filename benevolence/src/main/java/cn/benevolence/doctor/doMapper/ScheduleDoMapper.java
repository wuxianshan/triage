package cn.benevolence.doctor.doMapper;

import cn.benevolence.doctor.domodel.MySchedule;
import cn.benevolence.make.domodel.MySchedule1;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * @author xianshan
 * @create 2020-02 20:49
 */
@Mapper
public interface ScheduleDoMapper {
    /* 获取医生排班信息*/
    @Select("SELECT tri_dept.name AS 'deptName',doctor.dname AS 'docName',sdate,climit,sn FROM doc_scheduling INNER JOIN doctor\n" +
            "ON doc_scheduling.docid=doctor.did INNER JOIN tri_dept ON doctor.ddid=tri_dept.id")
    List<MySchedule> scheduleList();
    /*插入医生值班数据*/
    @Insert("INSERT INTO doc_scheduling(docid,climit,sdate) VALUES(#{docid},#{climit},#{sdate})")
    Integer insertSchedule(@Param("docid") Integer docid,
                           @Param("climit") Integer climit,
                           @Param("sdate") Date sdate);

    @Select("SELECT NAME FROM tri_dept WHERE id=(SELECT ddid FROM doctor WHERE did=#{id} )")
    String getDeptName(@Param("id") Integer id);

    @Select("SELECT doc_scheduling.`id`,doc_scheduling.`docid`,doctor.`dname`,\n" +
            "doc_scheduling.`backgroundColor`,tri_dept.name,doc_scheduling.`sdate`\n" +
            "FROM doctor JOIN doc_scheduling ON doctor.`did`=doc_scheduling.`docid`\n" +
            "JOIN tri_dept ON doctor.`ddid`=tri_dept.`id`")
    List<MySchedule> even();

    @Select("SELECT doc_scheduling.*,doctor.did,doctor.ddid,doctor.dname,(doc_scheduling.climit-doc_scheduling.sn) AS yuhao,\n" +
            "tri_dept.name AS deptname\n" +
            "FROM doc_scheduling LEFT JOIN doctor\n" +
            "ON doctor.did=doc_scheduling.docid JOIN\n" +
            "tri_dept ON doctor.ddid=tri_dept.id\n" +
            "WHERE doctor.ddid=#{deptid}  AND doctor.position=#{position} ")
    List<MySchedule1> doclist(@Param("deptid") Integer deptid, @Param("position") String position);

    @Update("UPDATE doc_scheduling SET docid=#{did}  sdate=#{sdate}  background= WHERE id=#{id} ")
    Integer upWork(@Param("did") Integer did, @Param("sdate") String sdate, @Param("id") Integer id);

}
