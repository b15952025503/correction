package com.community.demo.entity;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
@Mapper
public class JudgmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JudgmentExample() {
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

        public Criteria andJnoIsNull() {
            addCriterion("jNo is null");
            return (Criteria) this;
        }

        public Criteria andJnoIsNotNull() {
            addCriterion("jNo is not null");
            return (Criteria) this;
        }

        public Criteria andJnoEqualTo(String value) {
            addCriterion("jNo =", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotEqualTo(String value) {
            addCriterion("jNo <>", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoGreaterThan(String value) {
            addCriterion("jNo >", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoGreaterThanOrEqualTo(String value) {
            addCriterion("jNo >=", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoLessThan(String value) {
            addCriterion("jNo <", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoLessThanOrEqualTo(String value) {
            addCriterion("jNo <=", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoLike(String value) {
            addCriterion("jNo like", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotLike(String value) {
            addCriterion("jNo not like", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoIn(List<String> values) {
            addCriterion("jNo in", values, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotIn(List<String> values) {
            addCriterion("jNo not in", values, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoBetween(String value1, String value2) {
            addCriterion("jNo between", value1, value2, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotBetween(String value1, String value2) {
            addCriterion("jNo not between", value1, value2, "jno");
            return (Criteria) this;
        }

        public Criteria andCourtnameIsNull() {
            addCriterion("courtName is null");
            return (Criteria) this;
        }

        public Criteria andCourtnameIsNotNull() {
            addCriterion("courtName is not null");
            return (Criteria) this;
        }

        public Criteria andCourtnameEqualTo(String value) {
            addCriterion("courtName =", value, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameNotEqualTo(String value) {
            addCriterion("courtName <>", value, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameGreaterThan(String value) {
            addCriterion("courtName >", value, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameGreaterThanOrEqualTo(String value) {
            addCriterion("courtName >=", value, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameLessThan(String value) {
            addCriterion("courtName <", value, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameLessThanOrEqualTo(String value) {
            addCriterion("courtName <=", value, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameLike(String value) {
            addCriterion("courtName like", value, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameNotLike(String value) {
            addCriterion("courtName not like", value, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameIn(List<String> values) {
            addCriterion("courtName in", values, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameNotIn(List<String> values) {
            addCriterion("courtName not in", values, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameBetween(String value1, String value2) {
            addCriterion("courtName between", value1, value2, "courtname");
            return (Criteria) this;
        }

        public Criteria andCourtnameNotBetween(String value1, String value2) {
            addCriterion("courtName not between", value1, value2, "courtname");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateIsNull() {
            addCriterion("judgmentDate is null");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateIsNotNull() {
            addCriterion("judgmentDate is not null");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateEqualTo(Date value) {
            addCriterionForJDBCDate("judgmentDate =", value, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("judgmentDate <>", value, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateGreaterThan(Date value) {
            addCriterionForJDBCDate("judgmentDate >", value, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("judgmentDate >=", value, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateLessThan(Date value) {
            addCriterionForJDBCDate("judgmentDate <", value, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("judgmentDate <=", value, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateIn(List<Date> values) {
            addCriterionForJDBCDate("judgmentDate in", values, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("judgmentDate not in", values, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("judgmentDate between", value1, value2, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andJudgmentdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("judgmentDate not between", value1, value2, "judgmentdate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateIsNull() {
            addCriterion("originalDate is null");
            return (Criteria) this;
        }

        public Criteria andOriginaldateIsNotNull() {
            addCriterion("originalDate is not null");
            return (Criteria) this;
        }

        public Criteria andOriginaldateEqualTo(Date value) {
            addCriterionForJDBCDate("originalDate =", value, "originaldate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("originalDate <>", value, "originaldate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateGreaterThan(Date value) {
            addCriterionForJDBCDate("originalDate >", value, "originaldate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("originalDate >=", value, "originaldate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateLessThan(Date value) {
            addCriterionForJDBCDate("originalDate <", value, "originaldate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("originalDate <=", value, "originaldate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateIn(List<Date> values) {
            addCriterionForJDBCDate("originalDate in", values, "originaldate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("originalDate not in", values, "originaldate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("originalDate between", value1, value2, "originaldate");
            return (Criteria) this;
        }

        public Criteria andOriginaldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("originalDate not between", value1, value2, "originaldate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsIsNull() {
            addCriterion("Supplementary_punishments is null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsIsNotNull() {
            addCriterion("Supplementary_punishments is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsEqualTo(String value) {
            addCriterion("Supplementary_punishments =", value, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsNotEqualTo(String value) {
            addCriterion("Supplementary_punishments <>", value, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsGreaterThan(String value) {
            addCriterion("Supplementary_punishments >", value, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsGreaterThanOrEqualTo(String value) {
            addCriterion("Supplementary_punishments >=", value, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsLessThan(String value) {
            addCriterion("Supplementary_punishments <", value, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsLessThanOrEqualTo(String value) {
            addCriterion("Supplementary_punishments <=", value, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsLike(String value) {
            addCriterion("Supplementary_punishments like", value, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsNotLike(String value) {
            addCriterion("Supplementary_punishments not like", value, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsIn(List<String> values) {
            addCriterion("Supplementary_punishments in", values, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsNotIn(List<String> values) {
            addCriterion("Supplementary_punishments not in", values, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsBetween(String value1, String value2) {
            addCriterion("Supplementary_punishments between", value1, value2, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPunishmentsNotBetween(String value1, String value2) {
            addCriterion("Supplementary_punishments not between", value1, value2, "supplementaryPunishments");
            return (Criteria) this;
        }

        public Criteria andChargesIsNull() {
            addCriterion("charges is null");
            return (Criteria) this;
        }

        public Criteria andChargesIsNotNull() {
            addCriterion("charges is not null");
            return (Criteria) this;
        }

        public Criteria andChargesEqualTo(String value) {
            addCriterion("charges =", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesNotEqualTo(String value) {
            addCriterion("charges <>", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesGreaterThan(String value) {
            addCriterion("charges >", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesGreaterThanOrEqualTo(String value) {
            addCriterion("charges >=", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesLessThan(String value) {
            addCriterion("charges <", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesLessThanOrEqualTo(String value) {
            addCriterion("charges <=", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesLike(String value) {
            addCriterion("charges like", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesNotLike(String value) {
            addCriterion("charges not like", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesIn(List<String> values) {
            addCriterion("charges in", values, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesNotIn(List<String> values) {
            addCriterion("charges not in", values, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesBetween(String value1, String value2) {
            addCriterion("charges between", value1, value2, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesNotBetween(String value1, String value2) {
            addCriterion("charges not between", value1, value2, "charges");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyIsNull() {
            addCriterion("Verdict_penalty is null");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyIsNotNull() {
            addCriterion("Verdict_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyEqualTo(String value) {
            addCriterion("Verdict_penalty =", value, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyNotEqualTo(String value) {
            addCriterion("Verdict_penalty <>", value, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyGreaterThan(String value) {
            addCriterion("Verdict_penalty >", value, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyGreaterThanOrEqualTo(String value) {
            addCriterion("Verdict_penalty >=", value, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyLessThan(String value) {
            addCriterion("Verdict_penalty <", value, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyLessThanOrEqualTo(String value) {
            addCriterion("Verdict_penalty <=", value, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyLike(String value) {
            addCriterion("Verdict_penalty like", value, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyNotLike(String value) {
            addCriterion("Verdict_penalty not like", value, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyIn(List<String> values) {
            addCriterion("Verdict_penalty in", values, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyNotIn(List<String> values) {
            addCriterion("Verdict_penalty not in", values, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyBetween(String value1, String value2) {
            addCriterion("Verdict_penalty between", value1, value2, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andVerdictPenaltyNotBetween(String value1, String value2) {
            addCriterion("Verdict_penalty not between", value1, value2, "verdictPenalty");
            return (Criteria) this;
        }

        public Criteria andExecutiondateIsNull() {
            addCriterion("executionDate is null");
            return (Criteria) this;
        }

        public Criteria andExecutiondateIsNotNull() {
            addCriterion("executionDate is not null");
            return (Criteria) this;
        }

        public Criteria andExecutiondateEqualTo(Date value) {
            addCriterionForJDBCDate("executionDate =", value, "executiondate");
            return (Criteria) this;
        }

        public Criteria andExecutiondateNotEqualTo(Date value) {
            addCriterionForJDBCDate("executionDate <>", value, "executiondate");
            return (Criteria) this;
        }

        public Criteria andExecutiondateGreaterThan(Date value) {
            addCriterionForJDBCDate("executionDate >", value, "executiondate");
            return (Criteria) this;
        }

        public Criteria andExecutiondateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("executionDate >=", value, "executiondate");
            return (Criteria) this;
        }

        public Criteria andExecutiondateLessThan(Date value) {
            addCriterionForJDBCDate("executionDate <", value, "executiondate");
            return (Criteria) this;
        }

        public Criteria andExecutiondateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("executionDate <=", value, "executiondate");
            return (Criteria) this;
        }

        public Criteria andExecutiondateIn(List<Date> values) {
            addCriterionForJDBCDate("executionDate in", values, "executiondate");
            return (Criteria) this;
        }

        public Criteria andExecutiondateNotIn(List<Date> values) {
            addCriterionForJDBCDate("executionDate not in", values, "executiondate");
            return (Criteria) this;
        }

        public Criteria andExecutiondateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("executionDate between", value1, value2, "executiondate");
            return (Criteria) this;
        }

        public Criteria andExecutiondateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("executionDate not between", value1, value2, "executiondate");
            return (Criteria) this;
        }

        public Criteria andInaffairIsNull() {
            addCriterion("inAffair is null");
            return (Criteria) this;
        }

        public Criteria andInaffairIsNotNull() {
            addCriterion("inAffair is not null");
            return (Criteria) this;
        }

        public Criteria andInaffairEqualTo(Date value) {
            addCriterionForJDBCDate("inAffair =", value, "inaffair");
            return (Criteria) this;
        }

        public Criteria andInaffairNotEqualTo(Date value) {
            addCriterionForJDBCDate("inAffair <>", value, "inaffair");
            return (Criteria) this;
        }

        public Criteria andInaffairGreaterThan(Date value) {
            addCriterionForJDBCDate("inAffair >", value, "inaffair");
            return (Criteria) this;
        }

        public Criteria andInaffairGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inAffair >=", value, "inaffair");
            return (Criteria) this;
        }

        public Criteria andInaffairLessThan(Date value) {
            addCriterionForJDBCDate("inAffair <", value, "inaffair");
            return (Criteria) this;
        }

        public Criteria andInaffairLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inAffair <=", value, "inaffair");
            return (Criteria) this;
        }

        public Criteria andInaffairIn(List<Date> values) {
            addCriterionForJDBCDate("inAffair in", values, "inaffair");
            return (Criteria) this;
        }

        public Criteria andInaffairNotIn(List<Date> values) {
            addCriterionForJDBCDate("inAffair not in", values, "inaffair");
            return (Criteria) this;
        }

        public Criteria andInaffairBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inAffair between", value1, value2, "inaffair");
            return (Criteria) this;
        }

        public Criteria andInaffairNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inAffair not between", value1, value2, "inaffair");
            return (Criteria) this;
        }

        public Criteria andAffairdateIsNull() {
            addCriterion("affairDate is null");
            return (Criteria) this;
        }

        public Criteria andAffairdateIsNotNull() {
            addCriterion("affairDate is not null");
            return (Criteria) this;
        }

        public Criteria andAffairdateEqualTo(String value) {
            addCriterion("affairDate =", value, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateNotEqualTo(String value) {
            addCriterion("affairDate <>", value, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateGreaterThan(String value) {
            addCriterion("affairDate >", value, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateGreaterThanOrEqualTo(String value) {
            addCriterion("affairDate >=", value, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateLessThan(String value) {
            addCriterion("affairDate <", value, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateLessThanOrEqualTo(String value) {
            addCriterion("affairDate <=", value, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateLike(String value) {
            addCriterion("affairDate like", value, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateNotLike(String value) {
            addCriterion("affairDate not like", value, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateIn(List<String> values) {
            addCriterion("affairDate in", values, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateNotIn(List<String> values) {
            addCriterion("affairDate not in", values, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateBetween(String value1, String value2) {
            addCriterion("affairDate between", value1, value2, "affairdate");
            return (Criteria) this;
        }

        public Criteria andAffairdateNotBetween(String value1, String value2) {
            addCriterion("affairDate not between", value1, value2, "affairdate");
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