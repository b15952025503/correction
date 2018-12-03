package com.community.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class AuthorityManagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityManagementExample() {
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

        public Criteria andAmnameIsNull() {
            addCriterion("amName is null");
            return (Criteria) this;
        }

        public Criteria andAmnameIsNotNull() {
            addCriterion("amName is not null");
            return (Criteria) this;
        }

        public Criteria andAmnameEqualTo(String value) {
            addCriterion("amName =", value, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameNotEqualTo(String value) {
            addCriterion("amName <>", value, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameGreaterThan(String value) {
            addCriterion("amName >", value, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameGreaterThanOrEqualTo(String value) {
            addCriterion("amName >=", value, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameLessThan(String value) {
            addCriterion("amName <", value, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameLessThanOrEqualTo(String value) {
            addCriterion("amName <=", value, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameLike(String value) {
            addCriterion("amName like", value, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameNotLike(String value) {
            addCriterion("amName not like", value, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameIn(List<String> values) {
            addCriterion("amName in", values, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameNotIn(List<String> values) {
            addCriterion("amName not in", values, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameBetween(String value1, String value2) {
            addCriterion("amName between", value1, value2, "amname");
            return (Criteria) this;
        }

        public Criteria andAmnameNotBetween(String value1, String value2) {
            addCriterion("amName not between", value1, value2, "amname");
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

        public Criteria andBeiconIsNull() {
            addCriterion("beicon is null");
            return (Criteria) this;
        }

        public Criteria andBeiconIsNotNull() {
            addCriterion("beicon is not null");
            return (Criteria) this;
        }

        public Criteria andBeiconEqualTo(String value) {
            addCriterion("beicon =", value, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconNotEqualTo(String value) {
            addCriterion("beicon <>", value, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconGreaterThan(String value) {
            addCriterion("beicon >", value, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconGreaterThanOrEqualTo(String value) {
            addCriterion("beicon >=", value, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconLessThan(String value) {
            addCriterion("beicon <", value, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconLessThanOrEqualTo(String value) {
            addCriterion("beicon <=", value, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconLike(String value) {
            addCriterion("beicon like", value, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconNotLike(String value) {
            addCriterion("beicon not like", value, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconIn(List<String> values) {
            addCriterion("beicon in", values, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconNotIn(List<String> values) {
            addCriterion("beicon not in", values, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconBetween(String value1, String value2) {
            addCriterion("beicon between", value1, value2, "beicon");
            return (Criteria) this;
        }

        public Criteria andBeiconNotBetween(String value1, String value2) {
            addCriterion("beicon not between", value1, value2, "beicon");
            return (Criteria) this;
        }

        public Criteria andAficonIsNull() {
            addCriterion("aficon is null");
            return (Criteria) this;
        }

        public Criteria andAficonIsNotNull() {
            addCriterion("aficon is not null");
            return (Criteria) this;
        }

        public Criteria andAficonEqualTo(String value) {
            addCriterion("aficon =", value, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonNotEqualTo(String value) {
            addCriterion("aficon <>", value, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonGreaterThan(String value) {
            addCriterion("aficon >", value, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonGreaterThanOrEqualTo(String value) {
            addCriterion("aficon >=", value, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonLessThan(String value) {
            addCriterion("aficon <", value, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonLessThanOrEqualTo(String value) {
            addCriterion("aficon <=", value, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonLike(String value) {
            addCriterion("aficon like", value, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonNotLike(String value) {
            addCriterion("aficon not like", value, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonIn(List<String> values) {
            addCriterion("aficon in", values, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonNotIn(List<String> values) {
            addCriterion("aficon not in", values, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonBetween(String value1, String value2) {
            addCriterion("aficon between", value1, value2, "aficon");
            return (Criteria) this;
        }

        public Criteria andAficonNotBetween(String value1, String value2) {
            addCriterion("aficon not between", value1, value2, "aficon");
            return (Criteria) this;
        }

        public Criteria andChildiconIsNull() {
            addCriterion("childicon is null");
            return (Criteria) this;
        }

        public Criteria andChildiconIsNotNull() {
            addCriterion("childicon is not null");
            return (Criteria) this;
        }

        public Criteria andChildiconEqualTo(String value) {
            addCriterion("childicon =", value, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconNotEqualTo(String value) {
            addCriterion("childicon <>", value, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconGreaterThan(String value) {
            addCriterion("childicon >", value, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconGreaterThanOrEqualTo(String value) {
            addCriterion("childicon >=", value, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconLessThan(String value) {
            addCriterion("childicon <", value, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconLessThanOrEqualTo(String value) {
            addCriterion("childicon <=", value, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconLike(String value) {
            addCriterion("childicon like", value, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconNotLike(String value) {
            addCriterion("childicon not like", value, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconIn(List<String> values) {
            addCriterion("childicon in", values, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconNotIn(List<String> values) {
            addCriterion("childicon not in", values, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconBetween(String value1, String value2) {
            addCriterion("childicon between", value1, value2, "childicon");
            return (Criteria) this;
        }

        public Criteria andChildiconNotBetween(String value1, String value2) {
            addCriterion("childicon not between", value1, value2, "childicon");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
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