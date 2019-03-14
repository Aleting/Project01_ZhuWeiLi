package cn.edu.qut.entity;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(Integer value) {
            addCriterion("permission_id =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(Integer value) {
            addCriterion("permission_id <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(Integer value) {
            addCriterion("permission_id >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_id >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(Integer value) {
            addCriterion("permission_id <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("permission_id <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<Integer> values) {
            addCriterion("permission_id in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<Integer> values) {
            addCriterion("permission_id not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(Integer value1, Integer value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIsNull() {
            addCriterion("permission_parent is null");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIsNotNull() {
            addCriterion("permission_parent is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionParentEqualTo(Integer value) {
            addCriterion("permission_parent =", value, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionParentNotEqualTo(Integer value) {
            addCriterion("permission_parent <>", value, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionParentGreaterThan(Integer value) {
            addCriterion("permission_parent >", value, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_parent >=", value, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionParentLessThan(Integer value) {
            addCriterion("permission_parent <", value, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionParentLessThanOrEqualTo(Integer value) {
            addCriterion("permission_parent <=", value, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIn(List<Integer> values) {
            addCriterion("permission_parent in", values, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionParentNotIn(List<Integer> values) {
            addCriterion("permission_parent not in", values, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionParentBetween(Integer value1, Integer value2) {
            addCriterion("permission_parent between", value1, value2, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionParentNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_parent not between", value1, value2, "permissionParent");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("permission_name is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("permission_name is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("permission_name =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("permission_name <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("permission_name >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("permission_name >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("permission_name <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("permission_name <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("permission_name like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("permission_name not like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<String> values) {
            addCriterion("permission_name in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<String> values) {
            addCriterion("permission_name not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("permission_name between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("permission_name not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIsNull() {
            addCriterion("permission_code is null");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIsNotNull() {
            addCriterion("permission_code is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeEqualTo(String value) {
            addCriterion("permission_code =", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotEqualTo(String value) {
            addCriterion("permission_code <>", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeGreaterThan(String value) {
            addCriterion("permission_code >", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("permission_code >=", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLessThan(String value) {
            addCriterion("permission_code <", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLessThanOrEqualTo(String value) {
            addCriterion("permission_code <=", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLike(String value) {
            addCriterion("permission_code like", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotLike(String value) {
            addCriterion("permission_code not like", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIn(List<String> values) {
            addCriterion("permission_code in", values, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotIn(List<String> values) {
            addCriterion("permission_code not in", values, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeBetween(String value1, String value2) {
            addCriterion("permission_code between", value1, value2, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotBetween(String value1, String value2) {
            addCriterion("permission_code not between", value1, value2, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlIsNull() {
            addCriterion("permission_url is null");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlIsNotNull() {
            addCriterion("permission_url is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlEqualTo(String value) {
            addCriterion("permission_url =", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlNotEqualTo(String value) {
            addCriterion("permission_url <>", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlGreaterThan(String value) {
            addCriterion("permission_url >", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("permission_url >=", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlLessThan(String value) {
            addCriterion("permission_url <", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlLessThanOrEqualTo(String value) {
            addCriterion("permission_url <=", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlLike(String value) {
            addCriterion("permission_url like", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlNotLike(String value) {
            addCriterion("permission_url not like", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlIn(List<String> values) {
            addCriterion("permission_url in", values, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlNotIn(List<String> values) {
            addCriterion("permission_url not in", values, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlBetween(String value1, String value2) {
            addCriterion("permission_url between", value1, value2, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlNotBetween(String value1, String value2) {
            addCriterion("permission_url not between", value1, value2, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionStateIsNull() {
            addCriterion("permission_state is null");
            return (Criteria) this;
        }

        public Criteria andPermissionStateIsNotNull() {
            addCriterion("permission_state is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionStateEqualTo(String value) {
            addCriterion("permission_state =", value, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateNotEqualTo(String value) {
            addCriterion("permission_state <>", value, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateGreaterThan(String value) {
            addCriterion("permission_state >", value, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateGreaterThanOrEqualTo(String value) {
            addCriterion("permission_state >=", value, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateLessThan(String value) {
            addCriterion("permission_state <", value, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateLessThanOrEqualTo(String value) {
            addCriterion("permission_state <=", value, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateLike(String value) {
            addCriterion("permission_state like", value, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateNotLike(String value) {
            addCriterion("permission_state not like", value, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateIn(List<String> values) {
            addCriterion("permission_state in", values, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateNotIn(List<String> values) {
            addCriterion("permission_state not in", values, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateBetween(String value1, String value2) {
            addCriterion("permission_state between", value1, value2, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionStateNotBetween(String value1, String value2) {
            addCriterion("permission_state not between", value1, value2, "permissionState");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviIsNull() {
            addCriterion("permission_isNavi is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviIsNotNull() {
            addCriterion("permission_isNavi is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviEqualTo(Integer value) {
            addCriterion("permission_isNavi =", value, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviNotEqualTo(Integer value) {
            addCriterion("permission_isNavi <>", value, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviGreaterThan(Integer value) {
            addCriterion("permission_isNavi >", value, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_isNavi >=", value, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviLessThan(Integer value) {
            addCriterion("permission_isNavi <", value, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviLessThanOrEqualTo(Integer value) {
            addCriterion("permission_isNavi <=", value, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviIn(List<Integer> values) {
            addCriterion("permission_isNavi in", values, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviNotIn(List<Integer> values) {
            addCriterion("permission_isNavi not in", values, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviBetween(Integer value1, Integer value2) {
            addCriterion("permission_isNavi between", value1, value2, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIsnaviNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_isNavi not between", value1, value2, "permissionIsnavi");
            return (Criteria) this;
        }

        public Criteria andPermissionIconIsNull() {
            addCriterion("permission_icon is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIconIsNotNull() {
            addCriterion("permission_icon is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIconEqualTo(String value) {
            addCriterion("permission_icon =", value, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconNotEqualTo(String value) {
            addCriterion("permission_icon <>", value, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconGreaterThan(String value) {
            addCriterion("permission_icon >", value, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconGreaterThanOrEqualTo(String value) {
            addCriterion("permission_icon >=", value, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconLessThan(String value) {
            addCriterion("permission_icon <", value, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconLessThanOrEqualTo(String value) {
            addCriterion("permission_icon <=", value, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconLike(String value) {
            addCriterion("permission_icon like", value, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconNotLike(String value) {
            addCriterion("permission_icon not like", value, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconIn(List<String> values) {
            addCriterion("permission_icon in", values, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconNotIn(List<String> values) {
            addCriterion("permission_icon not in", values, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconBetween(String value1, String value2) {
            addCriterion("permission_icon between", value1, value2, "permissionIcon");
            return (Criteria) this;
        }

        public Criteria andPermissionIconNotBetween(String value1, String value2) {
            addCriterion("permission_icon not between", value1, value2, "permissionIcon");
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