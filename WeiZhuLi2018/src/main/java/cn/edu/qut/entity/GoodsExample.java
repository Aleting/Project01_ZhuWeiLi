package cn.edu.qut.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdIsNull() {
            addCriterion("virtual_id is null");
            return (Criteria) this;
        }

        public Criteria andVirtualIdIsNotNull() {
            addCriterion("virtual_id is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualIdEqualTo(Integer value) {
            addCriterion("virtual_id =", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdNotEqualTo(Integer value) {
            addCriterion("virtual_id <>", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdGreaterThan(Integer value) {
            addCriterion("virtual_id >", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("virtual_id >=", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdLessThan(Integer value) {
            addCriterion("virtual_id <", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdLessThanOrEqualTo(Integer value) {
            addCriterion("virtual_id <=", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdIn(List<Integer> values) {
            addCriterion("virtual_id in", values, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdNotIn(List<Integer> values) {
            addCriterion("virtual_id not in", values, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdBetween(Integer value1, Integer value2) {
            addCriterion("virtual_id between", value1, value2, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdNotBetween(Integer value1, Integer value2) {
            addCriterion("virtual_id not between", value1, value2, "virtualId");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNull() {
            addCriterion("sort_id is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Integer value) {
            addCriterion("sort_id =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Integer value) {
            addCriterion("sort_id <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Integer value) {
            addCriterion("sort_id >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_id >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Integer value) {
            addCriterion("sort_id <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_id <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Integer> values) {
            addCriterion("sort_id in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Integer> values) {
            addCriterion("sort_id not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_id between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_id not between", value1, value2, "sortId");
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1IsNull() {
            addCriterion("goods_img1 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1IsNotNull() {
            addCriterion("goods_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1EqualTo(String value) {
            addCriterion("goods_img1 =", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1NotEqualTo(String value) {
            addCriterion("goods_img1 <>", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1GreaterThan(String value) {
            addCriterion("goods_img1 >", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1GreaterThanOrEqualTo(String value) {
            addCriterion("goods_img1 >=", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1LessThan(String value) {
            addCriterion("goods_img1 <", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1LessThanOrEqualTo(String value) {
            addCriterion("goods_img1 <=", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1Like(String value) {
            addCriterion("goods_img1 like", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1NotLike(String value) {
            addCriterion("goods_img1 not like", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1In(List<String> values) {
            addCriterion("goods_img1 in", values, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1NotIn(List<String> values) {
            addCriterion("goods_img1 not in", values, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1Between(String value1, String value2) {
            addCriterion("goods_img1 between", value1, value2, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1NotBetween(String value1, String value2) {
            addCriterion("goods_img1 not between", value1, value2, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2IsNull() {
            addCriterion("goods_img2 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2IsNotNull() {
            addCriterion("goods_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2EqualTo(String value) {
            addCriterion("goods_img2 =", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2NotEqualTo(String value) {
            addCriterion("goods_img2 <>", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2GreaterThan(String value) {
            addCriterion("goods_img2 >", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2GreaterThanOrEqualTo(String value) {
            addCriterion("goods_img2 >=", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2LessThan(String value) {
            addCriterion("goods_img2 <", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2LessThanOrEqualTo(String value) {
            addCriterion("goods_img2 <=", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2Like(String value) {
            addCriterion("goods_img2 like", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2NotLike(String value) {
            addCriterion("goods_img2 not like", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2In(List<String> values) {
            addCriterion("goods_img2 in", values, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2NotIn(List<String> values) {
            addCriterion("goods_img2 not in", values, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2Between(String value1, String value2) {
            addCriterion("goods_img2 between", value1, value2, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2NotBetween(String value1, String value2) {
            addCriterion("goods_img2 not between", value1, value2, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3IsNull() {
            addCriterion("goods_img3 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3IsNotNull() {
            addCriterion("goods_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3EqualTo(String value) {
            addCriterion("goods_img3 =", value, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3NotEqualTo(String value) {
            addCriterion("goods_img3 <>", value, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3GreaterThan(String value) {
            addCriterion("goods_img3 >", value, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3GreaterThanOrEqualTo(String value) {
            addCriterion("goods_img3 >=", value, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3LessThan(String value) {
            addCriterion("goods_img3 <", value, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3LessThanOrEqualTo(String value) {
            addCriterion("goods_img3 <=", value, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3Like(String value) {
            addCriterion("goods_img3 like", value, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3NotLike(String value) {
            addCriterion("goods_img3 not like", value, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3In(List<String> values) {
            addCriterion("goods_img3 in", values, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3NotIn(List<String> values) {
            addCriterion("goods_img3 not in", values, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3Between(String value1, String value2) {
            addCriterion("goods_img3 between", value1, value2, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsImg3NotBetween(String value1, String value2) {
            addCriterion("goods_img3 not between", value1, value2, "goodsImg3");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNull() {
            addCriterion("goods_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNotNull() {
            addCriterion("goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateEqualTo(String value) {
            addCriterion("goods_state =", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotEqualTo(String value) {
            addCriterion("goods_state <>", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThan(String value) {
            addCriterion("goods_state >", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThanOrEqualTo(String value) {
            addCriterion("goods_state >=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThan(String value) {
            addCriterion("goods_state <", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThanOrEqualTo(String value) {
            addCriterion("goods_state <=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLike(String value) {
            addCriterion("goods_state like", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotLike(String value) {
            addCriterion("goods_state not like", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIn(List<String> values) {
            addCriterion("goods_state in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotIn(List<String> values) {
            addCriterion("goods_state not in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateBetween(String value1, String value2) {
            addCriterion("goods_state between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotBetween(String value1, String value2) {
            addCriterion("goods_state not between", value1, value2, "goodsState");
            return (Criteria) this;
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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