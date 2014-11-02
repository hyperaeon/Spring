package com.smart.domain;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public ManagerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
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

        public Criteria andManaIdIsNull() {
            addCriterion("mana_id is null");
            return (Criteria) this;
        }

        public Criteria andManaIdIsNotNull() {
            addCriterion("mana_id is not null");
            return (Criteria) this;
        }

        public Criteria andManaIdEqualTo(Integer value) {
            addCriterion("mana_id =", value, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaIdNotEqualTo(Integer value) {
            addCriterion("mana_id <>", value, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaIdGreaterThan(Integer value) {
            addCriterion("mana_id >", value, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mana_id >=", value, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaIdLessThan(Integer value) {
            addCriterion("mana_id <", value, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaIdLessThanOrEqualTo(Integer value) {
            addCriterion("mana_id <=", value, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaIdIn(List<Integer> values) {
            addCriterion("mana_id in", values, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaIdNotIn(List<Integer> values) {
            addCriterion("mana_id not in", values, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaIdBetween(Integer value1, Integer value2) {
            addCriterion("mana_id between", value1, value2, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mana_id not between", value1, value2, "manaId");
            return (Criteria) this;
        }

        public Criteria andManaNameIsNull() {
            addCriterion("mana_name is null");
            return (Criteria) this;
        }

        public Criteria andManaNameIsNotNull() {
            addCriterion("mana_name is not null");
            return (Criteria) this;
        }

        public Criteria andManaNameEqualTo(String value) {
            addCriterion("mana_name =", value, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameNotEqualTo(String value) {
            addCriterion("mana_name <>", value, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameGreaterThan(String value) {
            addCriterion("mana_name >", value, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameGreaterThanOrEqualTo(String value) {
            addCriterion("mana_name >=", value, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameLessThan(String value) {
            addCriterion("mana_name <", value, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameLessThanOrEqualTo(String value) {
            addCriterion("mana_name <=", value, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameLike(String value) {
            addCriterion("mana_name like", value, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameNotLike(String value) {
            addCriterion("mana_name not like", value, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameIn(List<String> values) {
            addCriterion("mana_name in", values, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameNotIn(List<String> values) {
            addCriterion("mana_name not in", values, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameBetween(String value1, String value2) {
            addCriterion("mana_name between", value1, value2, "manaName");
            return (Criteria) this;
        }

        public Criteria andManaNameNotBetween(String value1, String value2) {
            addCriterion("mana_name not between", value1, value2, "manaName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_manager
     *
     * @mbggenerated do_not_delete_during_merge Sun Jul 20 13:41:04 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
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