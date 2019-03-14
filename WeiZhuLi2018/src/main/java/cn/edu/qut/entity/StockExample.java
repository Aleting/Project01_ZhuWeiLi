package cn.edu.qut.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andBuyPriceIsNull() {
            addCriterion("buy_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyPriceIsNotNull() {
            addCriterion("buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPriceEqualTo(BigDecimal value) {
            addCriterion("buy_price =", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotEqualTo(BigDecimal value) {
            addCriterion("buy_price <>", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceGreaterThan(BigDecimal value) {
            addCriterion("buy_price >", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_price >=", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceLessThan(BigDecimal value) {
            addCriterion("buy_price <", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_price <=", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceIn(List<BigDecimal> values) {
            addCriterion("buy_price in", values, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotIn(List<BigDecimal> values) {
            addCriterion("buy_price not in", values, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_price between", value1, value2, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_price not between", value1, value2, "buyPrice");
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