package cn.edu.qut.entity;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsIsNull() {
            addCriterion("supplier_contacts is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsIsNotNull() {
            addCriterion("supplier_contacts is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsEqualTo(String value) {
            addCriterion("supplier_contacts =", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNotEqualTo(String value) {
            addCriterion("supplier_contacts <>", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsGreaterThan(String value) {
            addCriterion("supplier_contacts >", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_contacts >=", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsLessThan(String value) {
            addCriterion("supplier_contacts <", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsLessThanOrEqualTo(String value) {
            addCriterion("supplier_contacts <=", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsLike(String value) {
            addCriterion("supplier_contacts like", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNotLike(String value) {
            addCriterion("supplier_contacts not like", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsIn(List<String> values) {
            addCriterion("supplier_contacts in", values, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNotIn(List<String> values) {
            addCriterion("supplier_contacts not in", values, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsBetween(String value1, String value2) {
            addCriterion("supplier_contacts between", value1, value2, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNotBetween(String value1, String value2) {
            addCriterion("supplier_contacts not between", value1, value2, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierWxIsNull() {
            addCriterion("supplier_wx is null");
            return (Criteria) this;
        }

        public Criteria andSupplierWxIsNotNull() {
            addCriterion("supplier_wx is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierWxEqualTo(String value) {
            addCriterion("supplier_wx =", value, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxNotEqualTo(String value) {
            addCriterion("supplier_wx <>", value, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxGreaterThan(String value) {
            addCriterion("supplier_wx >", value, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_wx >=", value, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxLessThan(String value) {
            addCriterion("supplier_wx <", value, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxLessThanOrEqualTo(String value) {
            addCriterion("supplier_wx <=", value, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxLike(String value) {
            addCriterion("supplier_wx like", value, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxNotLike(String value) {
            addCriterion("supplier_wx not like", value, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxIn(List<String> values) {
            addCriterion("supplier_wx in", values, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxNotIn(List<String> values) {
            addCriterion("supplier_wx not in", values, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxBetween(String value1, String value2) {
            addCriterion("supplier_wx between", value1, value2, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierWxNotBetween(String value1, String value2) {
            addCriterion("supplier_wx not between", value1, value2, "supplierWx");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayIsNull() {
            addCriterion("supplier_epay is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayIsNotNull() {
            addCriterion("supplier_epay is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayEqualTo(String value) {
            addCriterion("supplier_epay =", value, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayNotEqualTo(String value) {
            addCriterion("supplier_epay <>", value, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayGreaterThan(String value) {
            addCriterion("supplier_epay >", value, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_epay >=", value, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayLessThan(String value) {
            addCriterion("supplier_epay <", value, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayLessThanOrEqualTo(String value) {
            addCriterion("supplier_epay <=", value, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayLike(String value) {
            addCriterion("supplier_epay like", value, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayNotLike(String value) {
            addCriterion("supplier_epay not like", value, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayIn(List<String> values) {
            addCriterion("supplier_epay in", values, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayNotIn(List<String> values) {
            addCriterion("supplier_epay not in", values, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayBetween(String value1, String value2) {
            addCriterion("supplier_epay between", value1, value2, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierEpayNotBetween(String value1, String value2) {
            addCriterion("supplier_epay not between", value1, value2, "supplierEpay");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNull() {
            addCriterion("supplier_phone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNotNull() {
            addCriterion("supplier_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneEqualTo(String value) {
            addCriterion("supplier_phone =", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotEqualTo(String value) {
            addCriterion("supplier_phone <>", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThan(String value) {
            addCriterion("supplier_phone >", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_phone >=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThan(String value) {
            addCriterion("supplier_phone <", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThanOrEqualTo(String value) {
            addCriterion("supplier_phone <=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLike(String value) {
            addCriterion("supplier_phone like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotLike(String value) {
            addCriterion("supplier_phone not like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIn(List<String> values) {
            addCriterion("supplier_phone in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotIn(List<String> values) {
            addCriterion("supplier_phone not in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneBetween(String value1, String value2) {
            addCriterion("supplier_phone between", value1, value2, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotBetween(String value1, String value2) {
            addCriterion("supplier_phone not between", value1, value2, "supplierPhone");
            return (Criteria) this;
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