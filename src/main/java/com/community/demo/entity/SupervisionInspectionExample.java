package com.community.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SupervisionInspectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupervisionInspectionExample() {
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

        public Criteria andSuidIsNull() {
            addCriterion("suid is null");
            return (Criteria) this;
        }

        public Criteria andSuidIsNotNull() {
            addCriterion("suid is not null");
            return (Criteria) this;
        }

        public Criteria andSuidEqualTo(Integer value) {
            addCriterion("suid =", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidNotEqualTo(Integer value) {
            addCriterion("suid <>", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidGreaterThan(Integer value) {
            addCriterion("suid >", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("suid >=", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidLessThan(Integer value) {
            addCriterion("suid <", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidLessThanOrEqualTo(Integer value) {
            addCriterion("suid <=", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidIn(List<Integer> values) {
            addCriterion("suid in", values, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidNotIn(List<Integer> values) {
            addCriterion("suid not in", values, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidBetween(Integer value1, Integer value2) {
            addCriterion("suid between", value1, value2, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidNotBetween(Integer value1, Integer value2) {
            addCriterion("suid not between", value1, value2, "suid");
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

        public Criteria andEnoIsNull() {
            addCriterion("eNo is null");
            return (Criteria) this;
        }

        public Criteria andEnoIsNotNull() {
            addCriterion("eNo is not null");
            return (Criteria) this;
        }

        public Criteria andEnoEqualTo(Integer value) {
            addCriterion("eNo =", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoNotEqualTo(Integer value) {
            addCriterion("eNo <>", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoGreaterThan(Integer value) {
            addCriterion("eNo >", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("eNo >=", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoLessThan(Integer value) {
            addCriterion("eNo <", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoLessThanOrEqualTo(Integer value) {
            addCriterion("eNo <=", value, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoIn(List<Integer> values) {
            addCriterion("eNo in", values, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoNotIn(List<Integer> values) {
            addCriterion("eNo not in", values, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoBetween(Integer value1, Integer value2) {
            addCriterion("eNo between", value1, value2, "eno");
            return (Criteria) this;
        }

        public Criteria andEnoNotBetween(Integer value1, Integer value2) {
            addCriterion("eNo not between", value1, value2, "eno");
            return (Criteria) this;
        }

        public Criteria andSudateIsNull() {
            addCriterion("sudate is null");
            return (Criteria) this;
        }

        public Criteria andSudateIsNotNull() {
            addCriterion("sudate is not null");
            return (Criteria) this;
        }

        public Criteria andSudateEqualTo(Date value) {
            addCriterionForJDBCDate("sudate =", value, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sudate <>", value, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudateGreaterThan(Date value) {
            addCriterionForJDBCDate("sudate >", value, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sudate >=", value, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudateLessThan(Date value) {
            addCriterionForJDBCDate("sudate <", value, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sudate <=", value, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudateIn(List<Date> values) {
            addCriterionForJDBCDate("sudate in", values, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sudate not in", values, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sudate between", value1, value2, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sudate not between", value1, value2, "sudate");
            return (Criteria) this;
        }

        public Criteria andSudatetwoIsNull() {
            addCriterion("sudatetwo is null");
            return (Criteria) this;
        }

        public Criteria andSudatetwoIsNotNull() {
            addCriterion("sudatetwo is not null");
            return (Criteria) this;
        }

        public Criteria andSudatetwoEqualTo(Date value) {
            addCriterionForJDBCDate("sudatetwo =", value, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSudatetwoNotEqualTo(Date value) {
            addCriterionForJDBCDate("sudatetwo <>", value, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSudatetwoGreaterThan(Date value) {
            addCriterionForJDBCDate("sudatetwo >", value, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSudatetwoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sudatetwo >=", value, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSudatetwoLessThan(Date value) {
            addCriterionForJDBCDate("sudatetwo <", value, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSudatetwoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sudatetwo <=", value, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSudatetwoIn(List<Date> values) {
            addCriterionForJDBCDate("sudatetwo in", values, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSudatetwoNotIn(List<Date> values) {
            addCriterionForJDBCDate("sudatetwo not in", values, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSudatetwoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sudatetwo between", value1, value2, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSudatetwoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sudatetwo not between", value1, value2, "sudatetwo");
            return (Criteria) this;
        }

        public Criteria andSueventIsNull() {
            addCriterion("suEvent is null");
            return (Criteria) this;
        }

        public Criteria andSueventIsNotNull() {
            addCriterion("suEvent is not null");
            return (Criteria) this;
        }

        public Criteria andSueventEqualTo(String value) {
            addCriterion("suEvent =", value, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventNotEqualTo(String value) {
            addCriterion("suEvent <>", value, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventGreaterThan(String value) {
            addCriterion("suEvent >", value, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventGreaterThanOrEqualTo(String value) {
            addCriterion("suEvent >=", value, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventLessThan(String value) {
            addCriterion("suEvent <", value, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventLessThanOrEqualTo(String value) {
            addCriterion("suEvent <=", value, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventLike(String value) {
            addCriterion("suEvent like", value, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventNotLike(String value) {
            addCriterion("suEvent not like", value, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventIn(List<String> values) {
            addCriterion("suEvent in", values, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventNotIn(List<String> values) {
            addCriterion("suEvent not in", values, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventBetween(String value1, String value2) {
            addCriterion("suEvent between", value1, value2, "suevent");
            return (Criteria) this;
        }

        public Criteria andSueventNotBetween(String value1, String value2) {
            addCriterion("suEvent not between", value1, value2, "suevent");
            return (Criteria) this;
        }

        public Criteria andSuresultIsNull() {
            addCriterion("suResult is null");
            return (Criteria) this;
        }

        public Criteria andSuresultIsNotNull() {
            addCriterion("suResult is not null");
            return (Criteria) this;
        }

        public Criteria andSuresultEqualTo(String value) {
            addCriterion("suResult =", value, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultNotEqualTo(String value) {
            addCriterion("suResult <>", value, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultGreaterThan(String value) {
            addCriterion("suResult >", value, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultGreaterThanOrEqualTo(String value) {
            addCriterion("suResult >=", value, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultLessThan(String value) {
            addCriterion("suResult <", value, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultLessThanOrEqualTo(String value) {
            addCriterion("suResult <=", value, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultLike(String value) {
            addCriterion("suResult like", value, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultNotLike(String value) {
            addCriterion("suResult not like", value, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultIn(List<String> values) {
            addCriterion("suResult in", values, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultNotIn(List<String> values) {
            addCriterion("suResult not in", values, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultBetween(String value1, String value2) {
            addCriterion("suResult between", value1, value2, "suresult");
            return (Criteria) this;
        }

        public Criteria andSuresultNotBetween(String value1, String value2) {
            addCriterion("suResult not between", value1, value2, "suresult");
            return (Criteria) this;
        }

        public Criteria andSustaticIsNull() {
            addCriterion("suStatic is null");
            return (Criteria) this;
        }

        public Criteria andSustaticIsNotNull() {
            addCriterion("suStatic is not null");
            return (Criteria) this;
        }

        public Criteria andSustaticEqualTo(Integer value) {
            addCriterion("suStatic =", value, "sustatic");
            return (Criteria) this;
        }

        public Criteria andSustaticNotEqualTo(Integer value) {
            addCriterion("suStatic <>", value, "sustatic");
            return (Criteria) this;
        }

        public Criteria andSustaticGreaterThan(Integer value) {
            addCriterion("suStatic >", value, "sustatic");
            return (Criteria) this;
        }

        public Criteria andSustaticGreaterThanOrEqualTo(Integer value) {
            addCriterion("suStatic >=", value, "sustatic");
            return (Criteria) this;
        }

        public Criteria andSustaticLessThan(Integer value) {
            addCriterion("suStatic <", value, "sustatic");
            return (Criteria) this;
        }

        public Criteria andSustaticLessThanOrEqualTo(Integer value) {
            addCriterion("suStatic <=", value, "sustatic");
            return (Criteria) this;
        }

        public Criteria andSustaticIn(List<Integer> values) {
            addCriterion("suStatic in", values, "sustatic");
            return (Criteria) this;
        }

        public Criteria andSustaticNotIn(List<Integer> values) {
            addCriterion("suStatic not in", values, "sustatic");
            return (Criteria) this;
        }

        public Criteria andSustaticBetween(Integer value1, Integer value2) {
            addCriterion("suStatic between", value1, value2, "sustatic");
            return (Criteria) this;
        }

        public Criteria andSustaticNotBetween(Integer value1, Integer value2) {
            addCriterion("suStatic not between", value1, value2, "sustatic");
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