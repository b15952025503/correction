package com.community.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andEmidIsNull() {
            addCriterion("emid is null");
            return (Criteria) this;
        }

        public Criteria andEmidIsNotNull() {
            addCriterion("emid is not null");
            return (Criteria) this;
        }

        public Criteria andEmidEqualTo(Integer value) {
            addCriterion("emid =", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidNotEqualTo(Integer value) {
            addCriterion("emid <>", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidGreaterThan(Integer value) {
            addCriterion("emid >", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("emid >=", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidLessThan(Integer value) {
            addCriterion("emid <", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidLessThanOrEqualTo(Integer value) {
            addCriterion("emid <=", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidIn(List<Integer> values) {
            addCriterion("emid in", values, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidNotIn(List<Integer> values) {
            addCriterion("emid not in", values, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidBetween(Integer value1, Integer value2) {
            addCriterion("emid between", value1, value2, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidNotBetween(Integer value1, Integer value2) {
            addCriterion("emid not between", value1, value2, "emid");
            return (Criteria) this;
        }

        public Criteria andRnoIsNull() {
            addCriterion("rNo is null");
            return (Criteria) this;
        }

        public Criteria andRnoIsNotNull() {
            addCriterion("rNo is not null");
            return (Criteria) this;
        }

        public Criteria andRnoEqualTo(String value) {
            addCriterion("rNo =", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotEqualTo(String value) {
            addCriterion("rNo <>", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThan(String value) {
            addCriterion("rNo >", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThanOrEqualTo(String value) {
            addCriterion("rNo >=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThan(String value) {
            addCriterion("rNo <", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThanOrEqualTo(String value) {
            addCriterion("rNo <=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLike(String value) {
            addCriterion("rNo like", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotLike(String value) {
            addCriterion("rNo not like", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoIn(List<String> values) {
            addCriterion("rNo in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotIn(List<String> values) {
            addCriterion("rNo not in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoBetween(String value1, String value2) {
            addCriterion("rNo between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotBetween(String value1, String value2) {
            addCriterion("rNo not between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andEmdateIsNull() {
            addCriterion("emdate is null");
            return (Criteria) this;
        }

        public Criteria andEmdateIsNotNull() {
            addCriterion("emdate is not null");
            return (Criteria) this;
        }

        public Criteria andEmdateEqualTo(Date value) {
            addCriterionForJDBCDate("emdate =", value, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("emdate <>", value, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmdateGreaterThan(Date value) {
            addCriterionForJDBCDate("emdate >", value, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emdate >=", value, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmdateLessThan(Date value) {
            addCriterionForJDBCDate("emdate <", value, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emdate <=", value, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmdateIn(List<Date> values) {
            addCriterionForJDBCDate("emdate in", values, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("emdate not in", values, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emdate between", value1, value2, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emdate not between", value1, value2, "emdate");
            return (Criteria) this;
        }

        public Criteria andEmfractionIsNull() {
            addCriterion("emFraction is null");
            return (Criteria) this;
        }

        public Criteria andEmfractionIsNotNull() {
            addCriterion("emFraction is not null");
            return (Criteria) this;
        }

        public Criteria andEmfractionEqualTo(String value) {
            addCriterion("emFraction =", value, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionNotEqualTo(String value) {
            addCriterion("emFraction <>", value, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionGreaterThan(String value) {
            addCriterion("emFraction >", value, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionGreaterThanOrEqualTo(String value) {
            addCriterion("emFraction >=", value, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionLessThan(String value) {
            addCriterion("emFraction <", value, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionLessThanOrEqualTo(String value) {
            addCriterion("emFraction <=", value, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionLike(String value) {
            addCriterion("emFraction like", value, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionNotLike(String value) {
            addCriterion("emFraction not like", value, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionIn(List<String> values) {
            addCriterion("emFraction in", values, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionNotIn(List<String> values) {
            addCriterion("emFraction not in", values, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionBetween(String value1, String value2) {
            addCriterion("emFraction between", value1, value2, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmfractionNotBetween(String value1, String value2) {
            addCriterion("emFraction not between", value1, value2, "emfraction");
            return (Criteria) this;
        }

        public Criteria andEmflagIsNull() {
            addCriterion("emflag is null");
            return (Criteria) this;
        }

        public Criteria andEmflagIsNotNull() {
            addCriterion("emflag is not null");
            return (Criteria) this;
        }

        public Criteria andEmflagEqualTo(Integer value) {
            addCriterion("emflag =", value, "emflag");
            return (Criteria) this;
        }

        public Criteria andEmflagNotEqualTo(Integer value) {
            addCriterion("emflag <>", value, "emflag");
            return (Criteria) this;
        }

        public Criteria andEmflagGreaterThan(Integer value) {
            addCriterion("emflag >", value, "emflag");
            return (Criteria) this;
        }

        public Criteria andEmflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("emflag >=", value, "emflag");
            return (Criteria) this;
        }

        public Criteria andEmflagLessThan(Integer value) {
            addCriterion("emflag <", value, "emflag");
            return (Criteria) this;
        }

        public Criteria andEmflagLessThanOrEqualTo(Integer value) {
            addCriterion("emflag <=", value, "emflag");
            return (Criteria) this;
        }

        public Criteria andEmflagIn(List<Integer> values) {
            addCriterion("emflag in", values, "emflag");
            return (Criteria) this;
        }

        public Criteria andEmflagNotIn(List<Integer> values) {
            addCriterion("emflag not in", values, "emflag");
            return (Criteria) this;
        }

        public Criteria andEmflagBetween(Integer value1, Integer value2) {
            addCriterion("emflag between", value1, value2, "emflag");
            return (Criteria) this;
        }

        public Criteria andEmflagNotBetween(Integer value1, Integer value2) {
            addCriterion("emflag not between", value1, value2, "emflag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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