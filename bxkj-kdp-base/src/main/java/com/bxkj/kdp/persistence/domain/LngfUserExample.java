package com.bxkj.kdp.persistence.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LngfUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LngfUserExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRybsIsNull() {
            addCriterion("RYBS is null");
            return (Criteria) this;
        }

        public Criteria andRybsIsNotNull() {
            addCriterion("RYBS is not null");
            return (Criteria) this;
        }

        public Criteria andRybsEqualTo(String value) {
            addCriterion("RYBS =", value, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsNotEqualTo(String value) {
            addCriterion("RYBS <>", value, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsGreaterThan(String value) {
            addCriterion("RYBS >", value, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsGreaterThanOrEqualTo(String value) {
            addCriterion("RYBS >=", value, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsLessThan(String value) {
            addCriterion("RYBS <", value, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsLessThanOrEqualTo(String value) {
            addCriterion("RYBS <=", value, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsLike(String value) {
            addCriterion("RYBS like", value, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsNotLike(String value) {
            addCriterion("RYBS not like", value, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsIn(List<String> values) {
            addCriterion("RYBS in", values, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsNotIn(List<String> values) {
            addCriterion("RYBS not in", values, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsBetween(String value1, String value2) {
            addCriterion("RYBS between", value1, value2, "rybs");
            return (Criteria) this;
        }

        public Criteria andRybsNotBetween(String value1, String value2) {
            addCriterion("RYBS not between", value1, value2, "rybs");
            return (Criteria) this;
        }

        public Criteria andRymcIsNull() {
            addCriterion("RYMC is null");
            return (Criteria) this;
        }

        public Criteria andRymcIsNotNull() {
            addCriterion("RYMC is not null");
            return (Criteria) this;
        }

        public Criteria andRymcEqualTo(String value) {
            addCriterion("RYMC =", value, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcNotEqualTo(String value) {
            addCriterion("RYMC <>", value, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcGreaterThan(String value) {
            addCriterion("RYMC >", value, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcGreaterThanOrEqualTo(String value) {
            addCriterion("RYMC >=", value, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcLessThan(String value) {
            addCriterion("RYMC <", value, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcLessThanOrEqualTo(String value) {
            addCriterion("RYMC <=", value, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcLike(String value) {
            addCriterion("RYMC like", value, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcNotLike(String value) {
            addCriterion("RYMC not like", value, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcIn(List<String> values) {
            addCriterion("RYMC in", values, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcNotIn(List<String> values) {
            addCriterion("RYMC not in", values, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcBetween(String value1, String value2) {
            addCriterion("RYMC between", value1, value2, "rymc");
            return (Criteria) this;
        }

        public Criteria andRymcNotBetween(String value1, String value2) {
            addCriterion("RYMC not between", value1, value2, "rymc");
            return (Criteria) this;
        }

        public Criteria andBmbsIsNull() {
            addCriterion("BMBS is null");
            return (Criteria) this;
        }

        public Criteria andBmbsIsNotNull() {
            addCriterion("BMBS is not null");
            return (Criteria) this;
        }

        public Criteria andBmbsEqualTo(String value) {
            addCriterion("BMBS =", value, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsNotEqualTo(String value) {
            addCriterion("BMBS <>", value, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsGreaterThan(String value) {
            addCriterion("BMBS >", value, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsGreaterThanOrEqualTo(String value) {
            addCriterion("BMBS >=", value, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsLessThan(String value) {
            addCriterion("BMBS <", value, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsLessThanOrEqualTo(String value) {
            addCriterion("BMBS <=", value, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsLike(String value) {
            addCriterion("BMBS like", value, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsNotLike(String value) {
            addCriterion("BMBS not like", value, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsIn(List<String> values) {
            addCriterion("BMBS in", values, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsNotIn(List<String> values) {
            addCriterion("BMBS not in", values, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsBetween(String value1, String value2) {
            addCriterion("BMBS between", value1, value2, "bmbs");
            return (Criteria) this;
        }

        public Criteria andBmbsNotBetween(String value1, String value2) {
            addCriterion("BMBS not between", value1, value2, "bmbs");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNull() {
            addCriterion("SJHM is null");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNotNull() {
            addCriterion("SJHM is not null");
            return (Criteria) this;
        }

        public Criteria andSjhmEqualTo(String value) {
            addCriterion("SJHM =", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotEqualTo(String value) {
            addCriterion("SJHM <>", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThan(String value) {
            addCriterion("SJHM >", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThanOrEqualTo(String value) {
            addCriterion("SJHM >=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThan(String value) {
            addCriterion("SJHM <", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThanOrEqualTo(String value) {
            addCriterion("SJHM <=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLike(String value) {
            addCriterion("SJHM like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotLike(String value) {
            addCriterion("SJHM not like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmIn(List<String> values) {
            addCriterion("SJHM in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotIn(List<String> values) {
            addCriterion("SJHM not in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmBetween(String value1, String value2) {
            addCriterion("SJHM between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotBetween(String value1, String value2) {
            addCriterion("SJHM not between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNull() {
            addCriterion("DZYX is null");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNotNull() {
            addCriterion("DZYX is not null");
            return (Criteria) this;
        }

        public Criteria andDzyxEqualTo(String value) {
            addCriterion("DZYX =", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotEqualTo(String value) {
            addCriterion("DZYX <>", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThan(String value) {
            addCriterion("DZYX >", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThanOrEqualTo(String value) {
            addCriterion("DZYX >=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThan(String value) {
            addCriterion("DZYX <", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThanOrEqualTo(String value) {
            addCriterion("DZYX <=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLike(String value) {
            addCriterion("DZYX like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotLike(String value) {
            addCriterion("DZYX not like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxIn(List<String> values) {
            addCriterion("DZYX in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotIn(List<String> values) {
            addCriterion("DZYX not in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxBetween(String value1, String value2) {
            addCriterion("DZYX between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotBetween(String value1, String value2) {
            addCriterion("DZYX not between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andImzhIsNull() {
            addCriterion("IMZH is null");
            return (Criteria) this;
        }

        public Criteria andImzhIsNotNull() {
            addCriterion("IMZH is not null");
            return (Criteria) this;
        }

        public Criteria andImzhEqualTo(String value) {
            addCriterion("IMZH =", value, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhNotEqualTo(String value) {
            addCriterion("IMZH <>", value, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhGreaterThan(String value) {
            addCriterion("IMZH >", value, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhGreaterThanOrEqualTo(String value) {
            addCriterion("IMZH >=", value, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhLessThan(String value) {
            addCriterion("IMZH <", value, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhLessThanOrEqualTo(String value) {
            addCriterion("IMZH <=", value, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhLike(String value) {
            addCriterion("IMZH like", value, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhNotLike(String value) {
            addCriterion("IMZH not like", value, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhIn(List<String> values) {
            addCriterion("IMZH in", values, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhNotIn(List<String> values) {
            addCriterion("IMZH not in", values, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhBetween(String value1, String value2) {
            addCriterion("IMZH between", value1, value2, "imzh");
            return (Criteria) this;
        }

        public Criteria andImzhNotBetween(String value1, String value2) {
            addCriterion("IMZH not between", value1, value2, "imzh");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("XB is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("XB is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("XB =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("XB <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("XB >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("XB >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("XB <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("XB <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("XB like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("XB not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("XB in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("XB not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("XB between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("XB not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andSfyxIsNull() {
            addCriterion("SFYX is null");
            return (Criteria) this;
        }

        public Criteria andSfyxIsNotNull() {
            addCriterion("SFYX is not null");
            return (Criteria) this;
        }

        public Criteria andSfyxEqualTo(String value) {
            addCriterion("SFYX =", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotEqualTo(String value) {
            addCriterion("SFYX <>", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThan(String value) {
            addCriterion("SFYX >", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThanOrEqualTo(String value) {
            addCriterion("SFYX >=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThan(String value) {
            addCriterion("SFYX <", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThanOrEqualTo(String value) {
            addCriterion("SFYX <=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLike(String value) {
            addCriterion("SFYX like", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotLike(String value) {
            addCriterion("SFYX not like", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxIn(List<String> values) {
            addCriterion("SFYX in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotIn(List<String> values) {
            addCriterion("SFYX not in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxBetween(String value1, String value2) {
            addCriterion("SFYX between", value1, value2, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotBetween(String value1, String value2) {
            addCriterion("SFYX not between", value1, value2, "sfyx");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNull() {
            addCriterion("LAST_UPDATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNotNull() {
            addCriterion("LAST_UPDATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP =", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <>", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP >", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP >=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP <", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP not in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP not between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNotNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP =", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <>", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP not in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP not between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNull() {
            addCriterion("CREATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNotNull() {
            addCriterion("CREATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampEqualTo(Date value) {
            addCriterion("CREATED_STAMP =", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotEqualTo(Date value) {
            addCriterion("CREATED_STAMP <>", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThan(Date value) {
            addCriterion("CREATED_STAMP >", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP >=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThan(Date value) {
            addCriterion("CREATED_STAMP <", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP <=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIn(List<Date> values) {
            addCriterion("CREATED_STAMP in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotIn(List<Date> values) {
            addCriterion("CREATED_STAMP not in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP not between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNull() {
            addCriterion("CREATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNotNull() {
            addCriterion("CREATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP =", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <>", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThan(Date value) {
            addCriterion("CREATED_TX_STAMP >", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP >=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThan(Date value) {
            addCriterion("CREATED_TX_STAMP <", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP not in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP not between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andValidateFlagIsNull() {
            addCriterion("VALIDATE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andValidateFlagIsNotNull() {
            addCriterion("VALIDATE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValidateFlagEqualTo(String value) {
            addCriterion("VALIDATE_FLAG =", value, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagNotEqualTo(String value) {
            addCriterion("VALIDATE_FLAG <>", value, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagGreaterThan(String value) {
            addCriterion("VALIDATE_FLAG >", value, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDATE_FLAG >=", value, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagLessThan(String value) {
            addCriterion("VALIDATE_FLAG <", value, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagLessThanOrEqualTo(String value) {
            addCriterion("VALIDATE_FLAG <=", value, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagLike(String value) {
            addCriterion("VALIDATE_FLAG like", value, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagNotLike(String value) {
            addCriterion("VALIDATE_FLAG not like", value, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagIn(List<String> values) {
            addCriterion("VALIDATE_FLAG in", values, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagNotIn(List<String> values) {
            addCriterion("VALIDATE_FLAG not in", values, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagBetween(String value1, String value2) {
            addCriterion("VALIDATE_FLAG between", value1, value2, "validateFlag");
            return (Criteria) this;
        }

        public Criteria andValidateFlagNotBetween(String value1, String value2) {
            addCriterion("VALIDATE_FLAG not between", value1, value2, "validateFlag");
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