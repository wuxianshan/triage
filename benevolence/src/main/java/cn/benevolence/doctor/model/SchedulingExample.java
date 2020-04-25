package cn.benevolence.doctor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SchedulingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    public SchedulingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_scheduling
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
     * This method corresponds to the database table doc_scheduling
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
     * This method corresponds to the database table doc_scheduling
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_scheduling
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
     * This class corresponds to the database table doc_scheduling
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDocidIsNull() {
            addCriterion("docid is null");
            return (Criteria) this;
        }

        public Criteria andDocidIsNotNull() {
            addCriterion("docid is not null");
            return (Criteria) this;
        }

        public Criteria andDocidEqualTo(Integer value) {
            addCriterion("docid =", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotEqualTo(Integer value) {
            addCriterion("docid <>", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThan(Integer value) {
            addCriterion("docid >", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docid >=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThan(Integer value) {
            addCriterion("docid <", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThanOrEqualTo(Integer value) {
            addCriterion("docid <=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidIn(List<Integer> values) {
            addCriterion("docid in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotIn(List<Integer> values) {
            addCriterion("docid not in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidBetween(Integer value1, Integer value2) {
            addCriterion("docid between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotBetween(Integer value1, Integer value2) {
            addCriterion("docid not between", value1, value2, "docid");
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

        public Criteria andClimitIsNull() {
            addCriterion("climit is null");
            return (Criteria) this;
        }

        public Criteria andClimitIsNotNull() {
            addCriterion("climit is not null");
            return (Criteria) this;
        }

        public Criteria andClimitEqualTo(Integer value) {
            addCriterion("climit =", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitNotEqualTo(Integer value) {
            addCriterion("climit <>", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitGreaterThan(Integer value) {
            addCriterion("climit >", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("climit >=", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitLessThan(Integer value) {
            addCriterion("climit <", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitLessThanOrEqualTo(Integer value) {
            addCriterion("climit <=", value, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitIn(List<Integer> values) {
            addCriterion("climit in", values, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitNotIn(List<Integer> values) {
            addCriterion("climit not in", values, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitBetween(Integer value1, Integer value2) {
            addCriterion("climit between", value1, value2, "climit");
            return (Criteria) this;
        }

        public Criteria andClimitNotBetween(Integer value1, Integer value2) {
            addCriterion("climit not between", value1, value2, "climit");
            return (Criteria) this;
        }

        public Criteria andSdateIsNull() {
            addCriterion("sdate is null");
            return (Criteria) this;
        }

        public Criteria andSdateIsNotNull() {
            addCriterion("sdate is not null");
            return (Criteria) this;
        }

        public Criteria andSdateEqualTo(Date value) {
            addCriterionForJDBCDate("sdate =", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sdate <>", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThan(Date value) {
            addCriterionForJDBCDate("sdate >", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sdate >=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThan(Date value) {
            addCriterionForJDBCDate("sdate <", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sdate <=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateIn(List<Date> values) {
            addCriterionForJDBCDate("sdate in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sdate not in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sdate between", value1, value2, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sdate not between", value1, value2, "sdate");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorIsNull() {
            addCriterion("backgroundColor is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorIsNotNull() {
            addCriterion("backgroundColor is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorEqualTo(String value) {
            addCriterion("backgroundColor =", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotEqualTo(String value) {
            addCriterion("backgroundColor <>", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorGreaterThan(String value) {
            addCriterion("backgroundColor >", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorGreaterThanOrEqualTo(String value) {
            addCriterion("backgroundColor >=", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorLessThan(String value) {
            addCriterion("backgroundColor <", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorLessThanOrEqualTo(String value) {
            addCriterion("backgroundColor <=", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorLike(String value) {
            addCriterion("backgroundColor like", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotLike(String value) {
            addCriterion("backgroundColor not like", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorIn(List<String> values) {
            addCriterion("backgroundColor in", values, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotIn(List<String> values) {
            addCriterion("backgroundColor not in", values, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorBetween(String value1, String value2) {
            addCriterion("backgroundColor between", value1, value2, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotBetween(String value1, String value2) {
            addCriterion("backgroundColor not between", value1, value2, "backgroundcolor");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table doc_scheduling
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
     * This class corresponds to the database table doc_scheduling
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