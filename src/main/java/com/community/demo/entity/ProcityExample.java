package com.community.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ProcityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcityExample() {
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

        public Criteria andPccodeIsNull() {
            addCriterion("pcCode is null");
            return (Criteria) this;
        }

        public Criteria andPccodeIsNotNull() {
            addCriterion("pcCode is not null");
            return (Criteria) this;
        }

        public Criteria andPccodeEqualTo(String value) {
            addCriterion("pcCode =", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeNotEqualTo(String value) {
            addCriterion("pcCode <>", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeGreaterThan(String value) {
            addCriterion("pcCode >", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeGreaterThanOrEqualTo(String value) {
            addCriterion("pcCode >=", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeLessThan(String value) {
            addCriterion("pcCode <", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeLessThanOrEqualTo(String value) {
            addCriterion("pcCode <=", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeLike(String value) {
            addCriterion("pcCode like", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeNotLike(String value) {
            addCriterion("pcCode not like", value, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeIn(List<String> values) {
            addCriterion("pcCode in", values, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeNotIn(List<String> values) {
            addCriterion("pcCode not in", values, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeBetween(String value1, String value2) {
            addCriterion("pcCode between", value1, value2, "pccode");
            return (Criteria) this;
        }

        public Criteria andPccodeNotBetween(String value1, String value2) {
            addCriterion("pcCode not between", value1, value2, "pccode");
            return (Criteria) this;
        }

        public Criteria andPcnameIsNull() {
            addCriterion("pcName is null");
            return (Criteria) this;
        }

        public Criteria andPcnameIsNotNull() {
            addCriterion("pcName is not null");
            return (Criteria) this;
        }

        public Criteria andPcnameEqualTo(String value) {
            addCriterion("pcName =", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameNotEqualTo(String value) {
            addCriterion("pcName <>", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameGreaterThan(String value) {
            addCriterion("pcName >", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameGreaterThanOrEqualTo(String value) {
            addCriterion("pcName >=", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameLessThan(String value) {
            addCriterion("pcName <", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameLessThanOrEqualTo(String value) {
            addCriterion("pcName <=", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameLike(String value) {
            addCriterion("pcName like", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameNotLike(String value) {
            addCriterion("pcName not like", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameIn(List<String> values) {
            addCriterion("pcName in", values, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameNotIn(List<String> values) {
            addCriterion("pcName not in", values, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameBetween(String value1, String value2) {
            addCriterion("pcName between", value1, value2, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameNotBetween(String value1, String value2) {
            addCriterion("pcName not between", value1, value2, "pcname");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNull() {
            addCriterion("parentCode is null");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNotNull() {
            addCriterion("parentCode is not null");
            return (Criteria) this;
        }

        public Criteria andParentcodeEqualTo(String value) {
            addCriterion("parentCode =", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotEqualTo(String value) {
            addCriterion("parentCode <>", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThan(String value) {
            addCriterion("parentCode >", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("parentCode >=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThan(String value) {
            addCriterion("parentCode <", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThanOrEqualTo(String value) {
            addCriterion("parentCode <=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLike(String value) {
            addCriterion("parentCode like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotLike(String value) {
            addCriterion("parentCode not like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeIn(List<String> values) {
            addCriterion("parentCode in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotIn(List<String> values) {
            addCriterion("parentCode not in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeBetween(String value1, String value2) {
            addCriterion("parentCode between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotBetween(String value1, String value2) {
            addCriterion("parentCode not between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andPctypeIsNull() {
            addCriterion("pcType is null");
            return (Criteria) this;
        }

        public Criteria andPctypeIsNotNull() {
            addCriterion("pcType is not null");
            return (Criteria) this;
        }

        public Criteria andPctypeEqualTo(String value) {
            addCriterion("pcType =", value, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeNotEqualTo(String value) {
            addCriterion("pcType <>", value, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeGreaterThan(String value) {
            addCriterion("pcType >", value, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeGreaterThanOrEqualTo(String value) {
            addCriterion("pcType >=", value, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeLessThan(String value) {
            addCriterion("pcType <", value, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeLessThanOrEqualTo(String value) {
            addCriterion("pcType <=", value, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeLike(String value) {
            addCriterion("pcType like", value, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeNotLike(String value) {
            addCriterion("pcType not like", value, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeIn(List<String> values) {
            addCriterion("pcType in", values, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeNotIn(List<String> values) {
            addCriterion("pcType not in", values, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeBetween(String value1, String value2) {
            addCriterion("pcType between", value1, value2, "pctype");
            return (Criteria) this;
        }

        public Criteria andPctypeNotBetween(String value1, String value2) {
            addCriterion("pcType not between", value1, value2, "pctype");
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