package cn.edu.qut.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreImgIsNull() {
            addCriterion("store_img is null");
            return (Criteria) this;
        }

        public Criteria andStoreImgIsNotNull() {
            addCriterion("store_img is not null");
            return (Criteria) this;
        }

        public Criteria andStoreImgEqualTo(String value) {
            addCriterion("store_img =", value, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgNotEqualTo(String value) {
            addCriterion("store_img <>", value, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgGreaterThan(String value) {
            addCriterion("store_img >", value, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgGreaterThanOrEqualTo(String value) {
            addCriterion("store_img >=", value, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgLessThan(String value) {
            addCriterion("store_img <", value, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgLessThanOrEqualTo(String value) {
            addCriterion("store_img <=", value, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgLike(String value) {
            addCriterion("store_img like", value, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgNotLike(String value) {
            addCriterion("store_img not like", value, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgIn(List<String> values) {
            addCriterion("store_img in", values, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgNotIn(List<String> values) {
            addCriterion("store_img not in", values, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgBetween(String value1, String value2) {
            addCriterion("store_img between", value1, value2, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreImgNotBetween(String value1, String value2) {
            addCriterion("store_img not between", value1, value2, "storeImg");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNull() {
            addCriterion("store_state is null");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNotNull() {
            addCriterion("store_state is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStateEqualTo(String value) {
            addCriterion("store_state =", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotEqualTo(String value) {
            addCriterion("store_state <>", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThan(String value) {
            addCriterion("store_state >", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThanOrEqualTo(String value) {
            addCriterion("store_state >=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThan(String value) {
            addCriterion("store_state <", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThanOrEqualTo(String value) {
            addCriterion("store_state <=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLike(String value) {
            addCriterion("store_state like", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotLike(String value) {
            addCriterion("store_state not like", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateIn(List<String> values) {
            addCriterion("store_state in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotIn(List<String> values) {
            addCriterion("store_state not in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateBetween(String value1, String value2) {
            addCriterion("store_state between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotBetween(String value1, String value2) {
            addCriterion("store_state not between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeIsNull() {
            addCriterion("store_start_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeIsNotNull() {
            addCriterion("store_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeEqualTo(Date value) {
            addCriterion("store_start_time =", value, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeNotEqualTo(Date value) {
            addCriterion("store_start_time <>", value, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeGreaterThan(Date value) {
            addCriterion("store_start_time >", value, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("store_start_time >=", value, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeLessThan(Date value) {
            addCriterion("store_start_time <", value, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("store_start_time <=", value, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeIn(List<Date> values) {
            addCriterion("store_start_time in", values, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeNotIn(List<Date> values) {
            addCriterion("store_start_time not in", values, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeBetween(Date value1, Date value2) {
            addCriterion("store_start_time between", value1, value2, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("store_start_time not between", value1, value2, "storeStartTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeIsNull() {
            addCriterion("store_end_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeIsNotNull() {
            addCriterion("store_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeEqualTo(Date value) {
            addCriterion("store_end_time =", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotEqualTo(Date value) {
            addCriterion("store_end_time <>", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeGreaterThan(Date value) {
            addCriterion("store_end_time >", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("store_end_time >=", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeLessThan(Date value) {
            addCriterion("store_end_time <", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("store_end_time <=", value, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeIn(List<Date> values) {
            addCriterion("store_end_time in", values, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotIn(List<Date> values) {
            addCriterion("store_end_time not in", values, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeBetween(Date value1, Date value2) {
            addCriterion("store_end_time between", value1, value2, "storeEndTime");
            return (Criteria) this;
        }

        public Criteria andStoreEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("store_end_time not between", value1, value2, "storeEndTime");
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