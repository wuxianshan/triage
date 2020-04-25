package cn.benevolence.sys.model;

import java.util.Date;

public class Permission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.cname
     *
     * @mbg.generated
     */
    private String cname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.ctype
     *
     * @mbg.generated
     */
    private Byte ctype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.sn
     *
     * @mbg.generated
     */
    private Integer sn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.perm
     *
     * @mbg.generated
     */
    private String perm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.icon
     *
     * @mbg.generated
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.descriptiom
     *
     * @mbg.generated
     */
    private String descriptiom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.ltime
     *
     * @mbg.generated
     */
    private Date ltime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.isdel
     *
     * @mbg.generated
     */
    private Boolean isdel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.isstop
     *
     * @mbg.generated
     */
    private Boolean isstop;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.opid
     *
     * @mbg.generated
     */
    private Integer opid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.id
     *
     * @return the value of sys_permission.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.id
     *
     * @param id the value for sys_permission.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.pid
     *
     * @return the value of sys_permission.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.pid
     *
     * @param pid the value for sys_permission.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.cname
     *
     * @return the value of sys_permission.cname
     *
     * @mbg.generated
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.cname
     *
     * @param cname the value for sys_permission.cname
     *
     * @mbg.generated
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.ctype
     *
     * @return the value of sys_permission.ctype
     *
     * @mbg.generated
     */
    public Byte getCtype() {
        return ctype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.ctype
     *
     * @param ctype the value for sys_permission.ctype
     *
     * @mbg.generated
     */
    public void setCtype(Byte ctype) {
        this.ctype = ctype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.sn
     *
     * @return the value of sys_permission.sn
     *
     * @mbg.generated
     */
    public Integer getSn() {
        return sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.sn
     *
     * @param sn the value for sys_permission.sn
     *
     * @mbg.generated
     */
    public void setSn(Integer sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.url
     *
     * @return the value of sys_permission.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.url
     *
     * @param url the value for sys_permission.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.perm
     *
     * @return the value of sys_permission.perm
     *
     * @mbg.generated
     */
    public String getPerm() {
        return perm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.perm
     *
     * @param perm the value for sys_permission.perm
     *
     * @mbg.generated
     */
    public void setPerm(String perm) {
        this.perm = perm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.icon
     *
     * @return the value of sys_permission.icon
     *
     * @mbg.generated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.icon
     *
     * @param icon the value for sys_permission.icon
     *
     * @mbg.generated
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.state
     *
     * @return the value of sys_permission.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.state
     *
     * @param state the value for sys_permission.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.descriptiom
     *
     * @return the value of sys_permission.descriptiom
     *
     * @mbg.generated
     */
    public String getDescriptiom() {
        return descriptiom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.descriptiom
     *
     * @param descriptiom the value for sys_permission.descriptiom
     *
     * @mbg.generated
     */
    public void setDescriptiom(String descriptiom) {
        this.descriptiom = descriptiom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.ctime
     *
     * @return the value of sys_permission.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.ctime
     *
     * @param ctime the value for sys_permission.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.ltime
     *
     * @return the value of sys_permission.ltime
     *
     * @mbg.generated
     */
    public Date getLtime() {
        return ltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.ltime
     *
     * @param ltime the value for sys_permission.ltime
     *
     * @mbg.generated
     */
    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.isdel
     *
     * @return the value of sys_permission.isdel
     *
     * @mbg.generated
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.isdel
     *
     * @param isdel the value for sys_permission.isdel
     *
     * @mbg.generated
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.isstop
     *
     * @return the value of sys_permission.isstop
     *
     * @mbg.generated
     */
    public Boolean getIsstop() {
        return isstop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.isstop
     *
     * @param isstop the value for sys_permission.isstop
     *
     * @mbg.generated
     */
    public void setIsstop(Boolean isstop) {
        this.isstop = isstop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.opid
     *
     * @return the value of sys_permission.opid
     *
     * @mbg.generated
     */
    public Integer getOpid() {
        return opid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.opid
     *
     * @param opid the value for sys_permission.opid
     *
     * @mbg.generated
     */
    public void setOpid(Integer opid) {
        this.opid = opid;
    }
}