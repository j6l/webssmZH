package com.jie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PinglunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PinglunExample() {
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
        oredCriteria.add( criteria );
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add( criteria );
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add( criteria );
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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
                throw new RuntimeException( "Value for condition cannot be null" );
            }
            criteria.add( new Criterion( condition ) );
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException( "Value for " + property + " cannot be null" );
            }
            criteria.add( new Criterion( condition, value ) );
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException( "Between values for " + property + " cannot be null" );
            }
            criteria.add( new Criterion( condition, value1, value2 ) );
        }

        public Criteria andIntlIsNull() {
            addCriterion( "intl is null" );
            return (Criteria) this;
        }

        public Criteria andIntlIsNotNull() {
            addCriterion( "intl is not null" );
            return (Criteria) this;
        }

        public Criteria andIntlEqualTo(Integer value) {
            addCriterion( "intl =", value, "intl" );
            return (Criteria) this;
        }

        public Criteria andIntlNotEqualTo(Integer value) {
            addCriterion( "intl <>", value, "intl" );
            return (Criteria) this;
        }

        public Criteria andIntlGreaterThan(Integer value) {
            addCriterion( "intl >", value, "intl" );
            return (Criteria) this;
        }

        public Criteria andIntlGreaterThanOrEqualTo(Integer value) {
            addCriterion( "intl >=", value, "intl" );
            return (Criteria) this;
        }

        public Criteria andIntlLessThan(Integer value) {
            addCriterion( "intl <", value, "intl" );
            return (Criteria) this;
        }

        public Criteria andIntlLessThanOrEqualTo(Integer value) {
            addCriterion( "intl <=", value, "intl" );
            return (Criteria) this;
        }

        public Criteria andIntlIn(List<Integer> values) {
            addCriterion( "intl in", values, "intl" );
            return (Criteria) this;
        }

        public Criteria andIntlNotIn(List<Integer> values) {
            addCriterion( "intl not in", values, "intl" );
            return (Criteria) this;
        }

        public Criteria andIntlBetween(Integer value1, Integer value2) {
            addCriterion( "intl between", value1, value2, "intl" );
            return (Criteria) this;
        }

        public Criteria andIntlNotBetween(Integer value1, Integer value2) {
            addCriterion( "intl not between", value1, value2, "intl" );
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion( "uuid is null" );
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion( "uuid is not null" );
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion( "uuid =", value, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion( "uuid <>", value, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion( "uuid >", value, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion( "uuid >=", value, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion( "uuid <", value, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion( "uuid <=", value, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion( "uuid like", value, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion( "uuid not like", value, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion( "uuid in", values, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion( "uuid not in", values, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion( "uuid between", value1, value2, "uuid" );
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion( "uuid not between", value1, value2, "uuid" );
            return (Criteria) this;
        }

        public Criteria andWentiIsNull() {
            addCriterion( "wenti is null" );
            return (Criteria) this;
        }

        public Criteria andWentiIsNotNull() {
            addCriterion( "wenti is not null" );
            return (Criteria) this;
        }

        public Criteria andWentiEqualTo(String value) {
            addCriterion( "wenti =", value, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiNotEqualTo(String value) {
            addCriterion( "wenti <>", value, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiGreaterThan(String value) {
            addCriterion( "wenti >", value, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiGreaterThanOrEqualTo(String value) {
            addCriterion( "wenti >=", value, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiLessThan(String value) {
            addCriterion( "wenti <", value, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiLessThanOrEqualTo(String value) {
            addCriterion( "wenti <=", value, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiLike(String value) {
            addCriterion( "wenti like", value, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiNotLike(String value) {
            addCriterion( "wenti not like", value, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiIn(List<String> values) {
            addCriterion( "wenti in", values, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiNotIn(List<String> values) {
            addCriterion( "wenti not in", values, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiBetween(String value1, String value2) {
            addCriterion( "wenti between", value1, value2, "wenti" );
            return (Criteria) this;
        }

        public Criteria andWentiNotBetween(String value1, String value2) {
            addCriterion( "wenti not between", value1, value2, "wenti" );
            return (Criteria) this;
        }

        public Criteria andNeirongIsNull() {
            addCriterion( "neirong is null" );
            return (Criteria) this;
        }

        public Criteria andNeirongIsNotNull() {
            addCriterion( "neirong is not null" );
            return (Criteria) this;
        }

        public Criteria andNeirongEqualTo(String value) {
            addCriterion( "neirong =", value, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongNotEqualTo(String value) {
            addCriterion( "neirong <>", value, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThan(String value) {
            addCriterion( "neirong >", value, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThanOrEqualTo(String value) {
            addCriterion( "neirong >=", value, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongLessThan(String value) {
            addCriterion( "neirong <", value, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongLessThanOrEqualTo(String value) {
            addCriterion( "neirong <=", value, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongLike(String value) {
            addCriterion( "neirong like", value, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongNotLike(String value) {
            addCriterion( "neirong not like", value, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongIn(List<String> values) {
            addCriterion( "neirong in", values, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongNotIn(List<String> values) {
            addCriterion( "neirong not in", values, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongBetween(String value1, String value2) {
            addCriterion( "neirong between", value1, value2, "neirong" );
            return (Criteria) this;
        }

        public Criteria andNeirongNotBetween(String value1, String value2) {
            addCriterion( "neirong not between", value1, value2, "neirong" );
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion( "user is null" );
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion( "user is not null" );
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion( "user =", value, "user" );
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion( "user <>", value, "user" );
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion( "user >", value, "user" );
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion( "user >=", value, "user" );
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion( "user <", value, "user" );
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion( "user <=", value, "user" );
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion( "user like", value, "user" );
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion( "user not like", value, "user" );
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion( "user in", values, "user" );
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion( "user not in", values, "user" );
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion( "user between", value1, value2, "user" );
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion( "user not between", value1, value2, "user" );
            return (Criteria) this;
        }

        public Criteria andBiaojiIsNull() {
            addCriterion( "biaoji is null" );
            return (Criteria) this;
        }

        public Criteria andBiaojiIsNotNull() {
            addCriterion( "biaoji is not null" );
            return (Criteria) this;
        }

        public Criteria andBiaojiEqualTo(Integer value) {
            addCriterion( "biaoji =", value, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andBiaojiNotEqualTo(Integer value) {
            addCriterion( "biaoji <>", value, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andBiaojiGreaterThan(Integer value) {
            addCriterion( "biaoji >", value, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andBiaojiGreaterThanOrEqualTo(Integer value) {
            addCriterion( "biaoji >=", value, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andBiaojiLessThan(Integer value) {
            addCriterion( "biaoji <", value, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andBiaojiLessThanOrEqualTo(Integer value) {
            addCriterion( "biaoji <=", value, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andBiaojiIn(List<Integer> values) {
            addCriterion( "biaoji in", values, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andBiaojiNotIn(List<Integer> values) {
            addCriterion( "biaoji not in", values, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andBiaojiBetween(Integer value1, Integer value2) {
            addCriterion( "biaoji between", value1, value2, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andBiaojiNotBetween(Integer value1, Integer value2) {
            addCriterion( "biaoji not between", value1, value2, "biaoji" );
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion( "ctime is null" );
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion( "ctime is not null" );
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion( "ctime =", value, "ctime" );
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion( "ctime <>", value, "ctime" );
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion( "ctime >", value, "ctime" );
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion( "ctime >=", value, "ctime" );
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion( "ctime <", value, "ctime" );
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion( "ctime <=", value, "ctime" );
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion( "ctime in", values, "ctime" );
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion( "ctime not in", values, "ctime" );
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion( "ctime between", value1, value2, "ctime" );
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion( "ctime not between", value1, value2, "ctime" );
            return (Criteria) this;
        }
    }

    /**
     *
     */
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
            this( condition, value, null );
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
            this( condition, value, secondValue, null );
        }
    }
}