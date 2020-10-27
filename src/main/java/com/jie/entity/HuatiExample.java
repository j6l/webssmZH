package com.jie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HuatiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HuatiExample() {
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

        public Criteria andWidIsNull() {
            addCriterion( "wid is null" );
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion( "wid is not null" );
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(String value) {
            addCriterion( "wid =", value, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(String value) {
            addCriterion( "wid <>", value, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(String value) {
            addCriterion( "wid >", value, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(String value) {
            addCriterion( "wid >=", value, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidLessThan(String value) {
            addCriterion( "wid <", value, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(String value) {
            addCriterion( "wid <=", value, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidLike(String value) {
            addCriterion( "wid like", value, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidNotLike(String value) {
            addCriterion( "wid not like", value, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidIn(List<String> values) {
            addCriterion( "wid in", values, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<String> values) {
            addCriterion( "wid not in", values, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidBetween(String value1, String value2) {
            addCriterion( "wid between", value1, value2, "wid" );
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(String value1, String value2) {
            addCriterion( "wid not between", value1, value2, "wid" );
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