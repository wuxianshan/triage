package cn.benevolence.sys.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermissionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public PermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("ctype is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("ctype is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(Byte value) {
            addCriterion("ctype =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(Byte value) {
            addCriterion("ctype <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(Byte value) {
            addCriterion("ctype >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ctype >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(Byte value) {
            addCriterion("ctype <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(Byte value) {
            addCriterion("ctype <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<Byte> values) {
            addCriterion("ctype in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<Byte> values) {
            addCriterion("ctype not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(Byte value1, Byte value2) {
            addCriterion("ctype between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ctype not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(Integer value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(Integer value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(Integer value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(Integer value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(Integer value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<Integer> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<Integer> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(Integer value1, Integer value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(Integer value1, Integer value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPermIsNull() {
            addCriterion("perm is null");
            return (Criteria) this;
        }

        public Criteria andPermIsNotNull() {
            addCriterion("perm is not null");
            return (Criteria) this;
        }

        public Criteria andPermEqualTo(String value) {
            addCriterion("perm =", value, "perm");
            return (Criteria) this;
        }

        public Criteria andPermNotEqualTo(String value) {
            addCriterion("perm <>", value, "perm");
            return (Criteria) this;
        }

        public Criteria andPermGreaterThan(String value) {
            addCriterion("perm >", value, "perm");
            return (Criteria) this;
        }

        public Criteria andPermGreaterThanOrEqualTo(String value) {
            addCriterion("perm >=", value, "perm");
            return (Criteria) this;
        }

        public Criteria andPermLessThan(String value) {
            addCriterion("perm <", value, "perm");
            return (Criteria) this;
        }

        public Criteria andPermLessThanOrEqualTo(String value) {
            addCriterion("perm <=", value, "perm");
            return (Criteria) this;
        }

        public Criteria andPermLike(String value) {
            addCriterion("perm like", value, "perm");
            return (Criteria) this;
        }

        public Criteria andPermNotLike(String value) {
            addCriterion("perm not like", value, "perm");
            return (Criteria) this;
        }

        public Criteria andPermIn(List<String> values) {
            addCriterion("perm in", values, "perm");
            return (Criteria) this;
        }

        public Criteria andPermNotIn(List<String> values) {
            addCriterion("perm not in", values, "perm");
            return (Criteria) this;
        }

        public Criteria andPermBetween(String value1, String value2) {
            addCriterion("perm between", value1, value2, "perm");
            return (Criteria) this;
        }

        public Criteria andPermNotBetween(String value1, String value2) {
            addCriterion("perm not between", value1, value2, "perm");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDescriptiomIsNull() {
            addCriterion("descriptiom is null");
            return (Criteria) this;
        }

        public Criteria andDescriptiomIsNotNull() {
            addCriterion("descriptiom is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptiomEqualTo(String value) {
            addCriterion("descriptiom =", value, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomNotEqualTo(String value) {
            addCriterion("descriptiom <>", value, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomGreaterThan(String value) {
            addCriterion("descriptiom >", value, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomGreaterThanOrEqualTo(String value) {
            addCriterion("descriptiom >=", value, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomLessThan(String value) {
            addCriterion("descriptiom <", value, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomLessThanOrEqualTo(String value) {
            addCriterion("descriptiom <=", value, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomLike(String value) {
            addCriterion("descriptiom like", value, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomNotLike(String value) {
            addCriterion("descriptiom not like", value, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomIn(List<String> values) {
            addCriterion("descriptiom in", values, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomNotIn(List<String> values) {
            addCriterion("descriptiom not in", values, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomBetween(String value1, String value2) {
            addCriterion("descriptiom between", value1, value2, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andDescriptiomNotBetween(String value1, String value2) {
            addCriterion("descriptiom not between", value1, value2, "descriptiom");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNull() {
            addCriterion("ltime is null");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNotNull() {
            addCriterion("ltime is not null");
            return (Criteria) this;
        }

        public Criteria andLtimeEqualTo(Date value) {
            addCriterion("ltime =", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotEqualTo(Date value) {
            addCriterion("ltime <>", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThan(Date value) {
            addCriterion("ltime >", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ltime >=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThan(Date value) {
            addCriterion("ltime <", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThanOrEqualTo(Date value) {
            addCriterion("ltime <=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeIn(List<Date> values) {
            addCriterion("ltime in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotIn(List<Date> values) {
            addCriterion("ltime not in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeBetween(Date value1, Date value2) {
            addCriterion("ltime between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotBetween(Date value1, Date value2) {
            addCriterion("ltime not between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isdel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isdel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Boolean value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Boolean value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Boolean value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Boolean value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Boolean value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Boolean> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Boolean> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Boolean value1, Boolean value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsstopIsNull() {
            addCriterion("isstop is null");
            return (Criteria) this;
        }

        public Criteria andIsstopIsNotNull() {
            addCriterion("isstop is not null");
            return (Criteria) this;
        }

        public Criteria andIsstopEqualTo(Boolean value) {
            addCriterion("isstop =", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotEqualTo(Boolean value) {
            addCriterion("isstop <>", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopGreaterThan(Boolean value) {
            addCriterion("isstop >", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isstop >=", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopLessThan(Boolean value) {
            addCriterion("isstop <", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopLessThanOrEqualTo(Boolean value) {
            addCriterion("isstop <=", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopIn(List<Boolean> values) {
            addCriterion("isstop in", values, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotIn(List<Boolean> values) {
            addCriterion("isstop not in", values, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopBetween(Boolean value1, Boolean value2) {
            addCriterion("isstop between", value1, value2, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isstop not between", value1, value2, "isstop");
            return (Criteria) this;
        }

        public Criteria andOpidIsNull() {
            addCriterion("opid is null");
            return (Criteria) this;
        }

        public Criteria andOpidIsNotNull() {
            addCriterion("opid is not null");
            return (Criteria) this;
        }

        public Criteria andOpidEqualTo(Integer value) {
            addCriterion("opid =", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotEqualTo(Integer value) {
            addCriterion("opid <>", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidGreaterThan(Integer value) {
            addCriterion("opid >", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("opid >=", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidLessThan(Integer value) {
            addCriterion("opid <", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidLessThanOrEqualTo(Integer value) {
            addCriterion("opid <=", value, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidIn(List<Integer> values) {
            addCriterion("opid in", values, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotIn(List<Integer> values) {
            addCriterion("opid not in", values, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidBetween(Integer value1, Integer value2) {
            addCriterion("opid between", value1, value2, "opid");
            return (Criteria) this;
        }

        public Criteria andOpidNotBetween(Integer value1, Integer value2) {
            addCriterion("opid not between", value1, value2, "opid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_permission
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}