package cn.benevolence.make.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class VRegistration {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.patientid
     *
     * @mbg.generated
     */
    private Integer patientid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.deptid
     *
     * @mbg.generated
     */
    private Integer deptid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.doctorid
     *
     * @mbg.generated
     */
    private Integer doctorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.number
     *
     * @mbg.generated
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.resdate
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date resdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.cdate
     *
     * @mbg.generated
     */
    private Date cdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.isdel
     *
     * @mbg.generated
     */
    private Boolean isdel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.patientname
     *
     * @mbg.generated
     */
    private String patientname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.deptname
     *
     * @mbg.generated
     */
    private String deptname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_registration.doctorname
     *
     * @mbg.generated
     */
    private String doctorname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.id
     *
     * @return the value of v_registration.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.id
     *
     * @param id the value for v_registration.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.patientid
     *
     * @return the value of v_registration.patientid
     *
     * @mbg.generated
     */
    public Integer getPatientid() {
        return patientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.patientid
     *
     * @param patientid the value for v_registration.patientid
     *
     * @mbg.generated
     */
    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.deptid
     *
     * @return the value of v_registration.deptid
     *
     * @mbg.generated
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.deptid
     *
     * @param deptid the value for v_registration.deptid
     *
     * @mbg.generated
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.doctorid
     *
     * @return the value of v_registration.doctorid
     *
     * @mbg.generated
     */
    public Integer getDoctorid() {
        return doctorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.doctorid
     *
     * @param doctorid the value for v_registration.doctorid
     *
     * @mbg.generated
     */
    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.number
     *
     * @return the value of v_registration.number
     *
     * @mbg.generated
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.number
     *
     * @param number the value for v_registration.number
     *
     * @mbg.generated
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.resdate
     *
     * @return the value of v_registration.resdate
     *
     * @mbg.generated
     */
    public Date getResdate() {
        return resdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.resdate
     *
     * @param resdate the value for v_registration.resdate
     *
     * @mbg.generated
     */
    public void setResdate(Date resdate) {
        this.resdate = resdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.cdate
     *
     * @return the value of v_registration.cdate
     *
     * @mbg.generated
     */
    public Date getCdate() {
        return cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.cdate
     *
     * @param cdate the value for v_registration.cdate
     *
     * @mbg.generated
     */
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.isdel
     *
     * @return the value of v_registration.isdel
     *
     * @mbg.generated
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.isdel
     *
     * @param isdel the value for v_registration.isdel
     *
     * @mbg.generated
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.patientname
     *
     * @return the value of v_registration.patientname
     *
     * @mbg.generated
     */
    public String getPatientname() {
        return patientname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.patientname
     *
     * @param patientname the value for v_registration.patientname
     *
     * @mbg.generated
     */
    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.deptname
     *
     * @return the value of v_registration.deptname
     *
     * @mbg.generated
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.deptname
     *
     * @param deptname the value for v_registration.deptname
     *
     * @mbg.generated
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_registration.doctorname
     *
     * @return the value of v_registration.doctorname
     *
     * @mbg.generated
     */
    public String getDoctorname() {
        return doctorname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_registration.doctorname
     *
     * @param doctorname the value for v_registration.doctorname
     *
     * @mbg.generated
     */
    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
}