package com.jie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserExample() {
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

        public Criteria andNameIsNull() {
            addCriterion( "name is null" );
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion( "name is not null" );
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion( "name =", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion( "name <>", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion( "name >", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion( "name >=", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion( "name <", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion( "name <=", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion( "name like", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion( "name not like", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion( "name in", values, "name" );
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion( "name not in", values, "name" );
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion( "name between", value1, value2, "name" );
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion( "name not between", value1, value2, "name" );
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion( "password is null" );
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion( "password is not null" );
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion( "password =", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion( "password <>", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion( "password >", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion( "password >=", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion( "password <", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion( "password <=", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion( "password like", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion( "password not like", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion( "password in", values, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion( "password not in", values, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion( "password between", value1, value2, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion( "password not between", value1, value2, "password" );
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion( "mail is null" );
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion( "mail is not null" );
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion( "mail =", value, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion( "mail <>", value, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion( "mail >", value, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion( "mail >=", value, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion( "mail <", value, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion( "mail <=", value, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion( "mail like", value, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion( "mail not like", value, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion( "mail in", values, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion( "mail not in", values, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion( "mail between", value1, value2, "mail" );
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion( "mail not between", value1, value2, "mail" );
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion( "role is null" );
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion( "role is not null" );
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion( "role =", value, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion( "role <>", value, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion( "role >", value, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion( "role >=", value, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion( "role <", value, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion( "role <=", value, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion( "role like", value, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion( "role not like", value, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion( "role in", values, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion( "role not in", values, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion( "role between", value1, value2, "role" );
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion( "role not between", value1, value2, "role" );
            return (Criteria) this;
        }

        public Criteria andIsoutIsNull() {
            addCriterion( "isout is null" );
            return (Criteria) this;
        }

        public Criteria andIsoutIsNotNull() {
            addCriterion( "isout is not null" );
            return (Criteria) this;
        }

        public Criteria andIsoutEqualTo(String value) {
            addCriterion( "isout =", value, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutNotEqualTo(String value) {
            addCriterion( "isout <>", value, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutGreaterThan(String value) {
            addCriterion( "isout >", value, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutGreaterThanOrEqualTo(String value) {
            addCriterion( "isout >=", value, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutLessThan(String value) {
            addCriterion( "isout <", value, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutLessThanOrEqualTo(String value) {
            addCriterion( "isout <=", value, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutLike(String value) {
            addCriterion( "isout like", value, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutNotLike(String value) {
            addCriterion( "isout not like", value, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutIn(List<String> values) {
            addCriterion( "isout in", values, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutNotIn(List<String> values) {
            addCriterion( "isout not in", values, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutBetween(String value1, String value2) {
            addCriterion( "isout between", value1, value2, "isout" );
            return (Criteria) this;
        }

        public Criteria andIsoutNotBetween(String value1, String value2) {
            addCriterion( "isout not between", value1, value2, "isout" );
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

        public Criteria andUtimeIsNull() {
            addCriterion( "utime is null" );
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion( "utime is not null" );
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion( "utime =", value, "utime" );
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion( "utime <>", value, "utime" );
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion( "utime >", value, "utime" );
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion( "utime >=", value, "utime" );
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion( "utime <", value, "utime" );
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion( "utime <=", value, "utime" );
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion( "utime in", values, "utime" );
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion( "utime not in", values, "utime" );
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion( "utime between", value1, value2, "utime" );
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion( "utime not between", value1, value2, "utime" );
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