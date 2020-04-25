package cn.benevolence.history.model;

import java.util.ArrayList;
import java.util.List;

public class HistoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table history
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table history
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table history
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbg.generated
     */
    public HistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
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
     * This method corresponds to the database table history
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
     * This method corresponds to the database table history
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
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
     * This class corresponds to the database table history
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(String value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(String value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(String value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(String value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(String value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(String value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLike(String value) {
            addCriterion("did like", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotLike(String value) {
            addCriterion("did not like", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<String> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<String> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(String value1, String value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(String value1, String value2) {
            addCriterion("did not between", value1, value2, "did");
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

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseIsNull() {
            addCriterion("hdiagnose is null");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseIsNotNull() {
            addCriterion("hdiagnose is not null");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseEqualTo(String value) {
            addCriterion("hdiagnose =", value, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseNotEqualTo(String value) {
            addCriterion("hdiagnose <>", value, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseGreaterThan(String value) {
            addCriterion("hdiagnose >", value, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseGreaterThanOrEqualTo(String value) {
            addCriterion("hdiagnose >=", value, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseLessThan(String value) {
            addCriterion("hdiagnose <", value, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseLessThanOrEqualTo(String value) {
            addCriterion("hdiagnose <=", value, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseLike(String value) {
            addCriterion("hdiagnose like", value, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseNotLike(String value) {
            addCriterion("hdiagnose not like", value, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseIn(List<String> values) {
            addCriterion("hdiagnose in", values, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseNotIn(List<String> values) {
            addCriterion("hdiagnose not in", values, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseBetween(String value1, String value2) {
            addCriterion("hdiagnose between", value1, value2, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHdiagnoseNotBetween(String value1, String value2) {
            addCriterion("hdiagnose not between", value1, value2, "hdiagnose");
            return (Criteria) this;
        }

        public Criteria andHsymptomIsNull() {
            addCriterion("hsymptom is null");
            return (Criteria) this;
        }

        public Criteria andHsymptomIsNotNull() {
            addCriterion("hsymptom is not null");
            return (Criteria) this;
        }

        public Criteria andHsymptomEqualTo(String value) {
            addCriterion("hsymptom =", value, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomNotEqualTo(String value) {
            addCriterion("hsymptom <>", value, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomGreaterThan(String value) {
            addCriterion("hsymptom >", value, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomGreaterThanOrEqualTo(String value) {
            addCriterion("hsymptom >=", value, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomLessThan(String value) {
            addCriterion("hsymptom <", value, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomLessThanOrEqualTo(String value) {
            addCriterion("hsymptom <=", value, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomLike(String value) {
            addCriterion("hsymptom like", value, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomNotLike(String value) {
            addCriterion("hsymptom not like", value, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomIn(List<String> values) {
            addCriterion("hsymptom in", values, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomNotIn(List<String> values) {
            addCriterion("hsymptom not in", values, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomBetween(String value1, String value2) {
            addCriterion("hsymptom between", value1, value2, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHsymptomNotBetween(String value1, String value2) {
            addCriterion("hsymptom not between", value1, value2, "hsymptom");
            return (Criteria) this;
        }

        public Criteria andHprescriptionIsNull() {
            addCriterion("hprescription is null");
            return (Criteria) this;
        }

        public Criteria andHprescriptionIsNotNull() {
            addCriterion("hprescription is not null");
            return (Criteria) this;
        }

        public Criteria andHprescriptionEqualTo(String value) {
            addCriterion("hprescription =", value, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionNotEqualTo(String value) {
            addCriterion("hprescription <>", value, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionGreaterThan(String value) {
            addCriterion("hprescription >", value, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("hprescription >=", value, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionLessThan(String value) {
            addCriterion("hprescription <", value, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionLessThanOrEqualTo(String value) {
            addCriterion("hprescription <=", value, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionLike(String value) {
            addCriterion("hprescription like", value, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionNotLike(String value) {
            addCriterion("hprescription not like", value, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionIn(List<String> values) {
            addCriterion("hprescription in", values, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionNotIn(List<String> values) {
            addCriterion("hprescription not in", values, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionBetween(String value1, String value2) {
            addCriterion("hprescription between", value1, value2, "hprescription");
            return (Criteria) this;
        }

        public Criteria andHprescriptionNotBetween(String value1, String value2) {
            addCriterion("hprescription not between", value1, value2, "hprescription");
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

        public Criteria andIsdelEqualTo(Integer value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Integer value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Integer value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Integer value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Integer> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Integer> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Integer value1, Integer value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table history
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
     * This class corresponds to the database table history
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