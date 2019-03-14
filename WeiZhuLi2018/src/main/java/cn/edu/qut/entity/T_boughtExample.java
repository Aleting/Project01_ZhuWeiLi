package cn.edu.qut.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class T_boughtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_boughtExample() {
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

        public Criteria andBouIdIsNull() {
            addCriterion("bou_id is null");
            return (Criteria) this;
        }

        public Criteria andBouIdIsNotNull() {
            addCriterion("bou_id is not null");
            return (Criteria) this;
        }

        public Criteria andBouIdEqualTo(Integer value) {
            addCriterion("bou_id =", value, "bouId");
            return (Criteria) this;
        }

        public Criteria andBouIdNotEqualTo(Integer value) {
            addCriterion("bou_id <>", value, "bouId");
            return (Criteria) this;
        }

        public Criteria andBouIdGreaterThan(Integer value) {
            addCriterion("bou_id >", value, "bouId");
            return (Criteria) this;
        }

        public Criteria andBouIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bou_id >=", value, "bouId");
            return (Criteria) this;
        }

        public Criteria andBouIdLessThan(Integer value) {
            addCriterion("bou_id <", value, "bouId");
            return (Criteria) this;
        }

        public Criteria andBouIdLessThanOrEqualTo(Integer value) {
            addCriterion("bou_id <=", value, "bouId");
            return (Criteria) this;
        }

        public Criteria andBouIdIn(List<Integer> values) {
            addCriterion("bou_id in", values, "bouId");
            return (Criteria) this;
        }

        public Criteria andBouIdNotIn(List<Integer> values) {
            addCriterion("bou_id not in", values, "bouId");
            return (Criteria) this;
        }

        public Criteria andBouIdBetween(Integer value1, Integer value2) {
            addCriterion("bou_id between", value1, value2, "bouId");
            return (Criteria) this;
        }

        public Criteria andBouIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bou_id not between", value1, value2, "bouId");
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
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

        public Criteria andGoSpecIsNull() {
            addCriterion("go_spec is null");
            return (Criteria) this;
        }

        public Criteria andGoSpecIsNotNull() {
            addCriterion("go_spec is not null");
            return (Criteria) this;
        }

        public Criteria andGoSpecEqualTo(String value) {
            addCriterion("go_spec =", value, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecNotEqualTo(String value) {
            addCriterion("go_spec <>", value, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecGreaterThan(String value) {
            addCriterion("go_spec >", value, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecGreaterThanOrEqualTo(String value) {
            addCriterion("go_spec >=", value, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecLessThan(String value) {
            addCriterion("go_spec <", value, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecLessThanOrEqualTo(String value) {
            addCriterion("go_spec <=", value, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecLike(String value) {
            addCriterion("go_spec like", value, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecNotLike(String value) {
            addCriterion("go_spec not like", value, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecIn(List<String> values) {
            addCriterion("go_spec in", values, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecNotIn(List<String> values) {
            addCriterion("go_spec not in", values, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecBetween(String value1, String value2) {
            addCriterion("go_spec between", value1, value2, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoSpecNotBetween(String value1, String value2) {
            addCriterion("go_spec not between", value1, value2, "goSpec");
            return (Criteria) this;
        }

        public Criteria andGoExNumberIsNull() {
            addCriterion("go_ex_number is null");
            return (Criteria) this;
        }

        public Criteria andGoExNumberIsNotNull() {
            addCriterion("go_ex_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoExNumberEqualTo(Integer value) {
            addCriterion("go_ex_number =", value, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andGoExNumberNotEqualTo(Integer value) {
            addCriterion("go_ex_number <>", value, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andGoExNumberGreaterThan(Integer value) {
            addCriterion("go_ex_number >", value, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andGoExNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("go_ex_number >=", value, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andGoExNumberLessThan(Integer value) {
            addCriterion("go_ex_number <", value, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andGoExNumberLessThanOrEqualTo(Integer value) {
            addCriterion("go_ex_number <=", value, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andGoExNumberIn(List<Integer> values) {
            addCriterion("go_ex_number in", values, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andGoExNumberNotIn(List<Integer> values) {
            addCriterion("go_ex_number not in", values, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andGoExNumberBetween(Integer value1, Integer value2) {
            addCriterion("go_ex_number between", value1, value2, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andGoExNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("go_ex_number not between", value1, value2, "goExNumber");
            return (Criteria) this;
        }

        public Criteria andSuppIdIsNull() {
            addCriterion("supp_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppIdIsNotNull() {
            addCriterion("supp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppIdEqualTo(String value) {
            addCriterion("supp_id =", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotEqualTo(String value) {
            addCriterion("supp_id <>", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThan(String value) {
            addCriterion("supp_id >", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThanOrEqualTo(String value) {
            addCriterion("supp_id >=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThan(String value) {
            addCriterion("supp_id <", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThanOrEqualTo(String value) {
            addCriterion("supp_id <=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLike(String value) {
            addCriterion("supp_id like", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotLike(String value) {
            addCriterion("supp_id not like", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdIn(List<String> values) {
            addCriterion("supp_id in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotIn(List<String> values) {
            addCriterion("supp_id not in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdBetween(String value1, String value2) {
            addCriterion("supp_id between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotBetween(String value1, String value2) {
            addCriterion("supp_id not between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andBouDateIsNull() {
            addCriterion("bou_date is null");
            return (Criteria) this;
        }

        public Criteria andBouDateIsNotNull() {
            addCriterion("bou_date is not null");
            return (Criteria) this;
        }

        public Criteria andBouDateEqualTo(Date value) {
            addCriterionForJDBCDate("bou_date =", value, "bouDate");
            return (Criteria) this;
        }

        public Criteria andBouDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bou_date <>", value, "bouDate");
            return (Criteria) this;
        }

        public Criteria andBouDateGreaterThan(Date value) {
            addCriterionForJDBCDate("bou_date >", value, "bouDate");
            return (Criteria) this;
        }

        public Criteria andBouDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bou_date >=", value, "bouDate");
            return (Criteria) this;
        }

        public Criteria andBouDateLessThan(Date value) {
            addCriterionForJDBCDate("bou_date <", value, "bouDate");
            return (Criteria) this;
        }

        public Criteria andBouDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bou_date <=", value, "bouDate");
            return (Criteria) this;
        }

        public Criteria andBouDateIn(List<Date> values) {
            addCriterionForJDBCDate("bou_date in", values, "bouDate");
            return (Criteria) this;
        }

        public Criteria andBouDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bou_date not in", values, "bouDate");
            return (Criteria) this;
        }

        public Criteria andBouDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bou_date between", value1, value2, "bouDate");
            return (Criteria) this;
        }

        public Criteria andBouDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bou_date not between", value1, value2, "bouDate");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNull() {
            addCriterion("sum_price is null");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNotNull() {
            addCriterion("sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andSumPriceEqualTo(BigDecimal value) {
            addCriterion("sum_price =", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotEqualTo(BigDecimal value) {
            addCriterion("sum_price <>", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThan(BigDecimal value) {
            addCriterion("sum_price >", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_price >=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThan(BigDecimal value) {
            addCriterion("sum_price <", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_price <=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceIn(List<BigDecimal> values) {
            addCriterion("sum_price in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotIn(List<BigDecimal> values) {
            addCriterion("sum_price not in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_price between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_price not between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagIsNull() {
            addCriterion("available_flag is null");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagIsNotNull() {
            addCriterion("available_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagEqualTo(String value) {
            addCriterion("available_flag =", value, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagNotEqualTo(String value) {
            addCriterion("available_flag <>", value, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagGreaterThan(String value) {
            addCriterion("available_flag >", value, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagGreaterThanOrEqualTo(String value) {
            addCriterion("available_flag >=", value, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagLessThan(String value) {
            addCriterion("available_flag <", value, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagLessThanOrEqualTo(String value) {
            addCriterion("available_flag <=", value, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagLike(String value) {
            addCriterion("available_flag like", value, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagNotLike(String value) {
            addCriterion("available_flag not like", value, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagIn(List<String> values) {
            addCriterion("available_flag in", values, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagNotIn(List<String> values) {
            addCriterion("available_flag not in", values, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagBetween(String value1, String value2) {
            addCriterion("available_flag between", value1, value2, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andAvailableFlagNotBetween(String value1, String value2) {
            addCriterion("available_flag not between", value1, value2, "availableFlag");
            return (Criteria) this;
        }

        public Criteria andBouMemoIsNull() {
            addCriterion("bou_memo is null");
            return (Criteria) this;
        }

        public Criteria andBouMemoIsNotNull() {
            addCriterion("bou_memo is not null");
            return (Criteria) this;
        }

        public Criteria andBouMemoEqualTo(String value) {
            addCriterion("bou_memo =", value, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoNotEqualTo(String value) {
            addCriterion("bou_memo <>", value, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoGreaterThan(String value) {
            addCriterion("bou_memo >", value, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoGreaterThanOrEqualTo(String value) {
            addCriterion("bou_memo >=", value, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoLessThan(String value) {
            addCriterion("bou_memo <", value, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoLessThanOrEqualTo(String value) {
            addCriterion("bou_memo <=", value, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoLike(String value) {
            addCriterion("bou_memo like", value, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoNotLike(String value) {
            addCriterion("bou_memo not like", value, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoIn(List<String> values) {
            addCriterion("bou_memo in", values, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoNotIn(List<String> values) {
            addCriterion("bou_memo not in", values, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoBetween(String value1, String value2) {
            addCriterion("bou_memo between", value1, value2, "bouMemo");
            return (Criteria) this;
        }

        public Criteria andBouMemoNotBetween(String value1, String value2) {
            addCriterion("bou_memo not between", value1, value2, "bouMemo");
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