package com.gsy.swagger.mybatis.po;

import java.util.ArrayList;
import java.util.List;

public class CoursesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public CoursesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
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
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
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

        public Criteria andCoursenoIsNull() {
            addCriterion("courseno is null");
            return (Criteria) this;
        }

        public Criteria andCoursenoIsNotNull() {
            addCriterion("courseno is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenoEqualTo(String value) {
            addCriterion("courseno =", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotEqualTo(String value) {
            addCriterion("courseno <>", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoGreaterThan(String value) {
            addCriterion("courseno >", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoGreaterThanOrEqualTo(String value) {
            addCriterion("courseno >=", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLessThan(String value) {
            addCriterion("courseno <", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLessThanOrEqualTo(String value) {
            addCriterion("courseno <=", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLike(String value) {
            addCriterion("courseno like", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotLike(String value) {
            addCriterion("courseno not like", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoIn(List<String> values) {
            addCriterion("courseno in", values, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotIn(List<String> values) {
            addCriterion("courseno not in", values, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoBetween(String value1, String value2) {
            addCriterion("courseno between", value1, value2, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotBetween(String value1, String value2) {
            addCriterion("courseno not between", value1, value2, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenmIsNull() {
            addCriterion("coursenm is null");
            return (Criteria) this;
        }

        public Criteria andCoursenmIsNotNull() {
            addCriterion("coursenm is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenmEqualTo(String value) {
            addCriterion("coursenm =", value, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmNotEqualTo(String value) {
            addCriterion("coursenm <>", value, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmGreaterThan(String value) {
            addCriterion("coursenm >", value, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmGreaterThanOrEqualTo(String value) {
            addCriterion("coursenm >=", value, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmLessThan(String value) {
            addCriterion("coursenm <", value, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmLessThanOrEqualTo(String value) {
            addCriterion("coursenm <=", value, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmLike(String value) {
            addCriterion("coursenm like", value, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmNotLike(String value) {
            addCriterion("coursenm not like", value, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmIn(List<String> values) {
            addCriterion("coursenm in", values, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmNotIn(List<String> values) {
            addCriterion("coursenm not in", values, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmBetween(String value1, String value2) {
            addCriterion("coursenm between", value1, value2, "coursenm");
            return (Criteria) this;
        }

        public Criteria andCoursenmNotBetween(String value1, String value2) {
            addCriterion("coursenm not between", value1, value2, "coursenm");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table courses
     *
     * @mbggenerated do_not_delete_during_merge Sun Oct 20 11:29:28 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table courses
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
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