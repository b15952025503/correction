package com.community.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CorrectivemeasureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CorrectivemeasureExample() {
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

        public Criteria andCorrectividIsNull() {
            addCriterion("correctivid is null");
            return (Criteria) this;
        }

        public Criteria andCorrectividIsNotNull() {
            addCriterion("correctivid is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectividEqualTo(String value) {
            addCriterion("correctivid =", value, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividNotEqualTo(String value) {
            addCriterion("correctivid <>", value, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividGreaterThan(String value) {
            addCriterion("correctivid >", value, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividGreaterThanOrEqualTo(String value) {
            addCriterion("correctivid >=", value, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividLessThan(String value) {
            addCriterion("correctivid <", value, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividLessThanOrEqualTo(String value) {
            addCriterion("correctivid <=", value, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividLike(String value) {
            addCriterion("correctivid like", value, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividNotLike(String value) {
            addCriterion("correctivid not like", value, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividIn(List<String> values) {
            addCriterion("correctivid in", values, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividNotIn(List<String> values) {
            addCriterion("correctivid not in", values, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividBetween(String value1, String value2) {
            addCriterion("correctivid between", value1, value2, "correctivid");
            return (Criteria) this;
        }

        public Criteria andCorrectividNotBetween(String value1, String value2) {
            addCriterion("correctivid not between", value1, value2, "correctivid");
            return (Criteria) this;
        }

        public Criteria andRnoIsNull() {
            addCriterion("rNO is null");
            return (Criteria) this;
        }

        public Criteria andRnoIsNotNull() {
            addCriterion("rNO is not null");
            return (Criteria) this;
        }

        public Criteria andRnoEqualTo(String value) {
            addCriterion("rNO =", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotEqualTo(String value) {
            addCriterion("rNO <>", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThan(String value) {
            addCriterion("rNO >", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThanOrEqualTo(String value) {
            addCriterion("rNO >=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThan(String value) {
            addCriterion("rNO <", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThanOrEqualTo(String value) {
            addCriterion("rNO <=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLike(String value) {
            addCriterion("rNO like", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotLike(String value) {
            addCriterion("rNO not like", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoIn(List<String> values) {
            addCriterion("rNO in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotIn(List<String> values) {
            addCriterion("rNO not in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoBetween(String value1, String value2) {
            addCriterion("rNO between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotBetween(String value1, String value2) {
            addCriterion("rNO not between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateIsNull() {
            addCriterion("correctivdate is null");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateIsNotNull() {
            addCriterion("correctivdate is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateEqualTo(Date value) {
            addCriterionForJDBCDate("correctivdate =", value, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("correctivdate <>", value, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateGreaterThan(Date value) {
            addCriterionForJDBCDate("correctivdate >", value, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("correctivdate >=", value, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateLessThan(Date value) {
            addCriterionForJDBCDate("correctivdate <", value, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("correctivdate <=", value, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateIn(List<Date> values) {
            addCriterionForJDBCDate("correctivdate in", values, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("correctivdate not in", values, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("correctivdate between", value1, value2, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("correctivdate not between", value1, value2, "correctivdate");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoIsNull() {
            addCriterion("correctivdatetwo is null");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoIsNotNull() {
            addCriterion("correctivdatetwo is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoEqualTo(Date value) {
            addCriterionForJDBCDate("correctivdatetwo =", value, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoNotEqualTo(Date value) {
            addCriterionForJDBCDate("correctivdatetwo <>", value, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoGreaterThan(Date value) {
            addCriterionForJDBCDate("correctivdatetwo >", value, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("correctivdatetwo >=", value, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoLessThan(Date value) {
            addCriterionForJDBCDate("correctivdatetwo <", value, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("correctivdatetwo <=", value, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoIn(List<Date> values) {
            addCriterionForJDBCDate("correctivdatetwo in", values, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoNotIn(List<Date> values) {
            addCriterionForJDBCDate("correctivdatetwo not in", values, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("correctivdatetwo between", value1, value2, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivdatetwoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("correctivdatetwo not between", value1, value2, "correctivdatetwo");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameIsNull() {
            addCriterion("correctivname is null");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameIsNotNull() {
            addCriterion("correctivname is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameEqualTo(String value) {
            addCriterion("correctivname =", value, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameNotEqualTo(String value) {
            addCriterion("correctivname <>", value, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameGreaterThan(String value) {
            addCriterion("correctivname >", value, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameGreaterThanOrEqualTo(String value) {
            addCriterion("correctivname >=", value, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameLessThan(String value) {
            addCriterion("correctivname <", value, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameLessThanOrEqualTo(String value) {
            addCriterion("correctivname <=", value, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameLike(String value) {
            addCriterion("correctivname like", value, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameNotLike(String value) {
            addCriterion("correctivname not like", value, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameIn(List<String> values) {
            addCriterion("correctivname in", values, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameNotIn(List<String> values) {
            addCriterion("correctivname not in", values, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameBetween(String value1, String value2) {
            addCriterion("correctivname between", value1, value2, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivnameNotBetween(String value1, String value2) {
            addCriterion("correctivname not between", value1, value2, "correctivname");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultIsNull() {
            addCriterion("correctivresult is null");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultIsNotNull() {
            addCriterion("correctivresult is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultEqualTo(String value) {
            addCriterion("correctivresult =", value, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultNotEqualTo(String value) {
            addCriterion("correctivresult <>", value, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultGreaterThan(String value) {
            addCriterion("correctivresult >", value, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultGreaterThanOrEqualTo(String value) {
            addCriterion("correctivresult >=", value, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultLessThan(String value) {
            addCriterion("correctivresult <", value, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultLessThanOrEqualTo(String value) {
            addCriterion("correctivresult <=", value, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultLike(String value) {
            addCriterion("correctivresult like", value, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultNotLike(String value) {
            addCriterion("correctivresult not like", value, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultIn(List<String> values) {
            addCriterion("correctivresult in", values, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultNotIn(List<String> values) {
            addCriterion("correctivresult not in", values, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultBetween(String value1, String value2) {
            addCriterion("correctivresult between", value1, value2, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andCorrectivresultNotBetween(String value1, String value2) {
            addCriterion("correctivresult not between", value1, value2, "correctivresult");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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