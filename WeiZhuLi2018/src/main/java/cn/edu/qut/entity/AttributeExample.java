package cn.edu.qut.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttributeExample() {
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

        public Criteria andAttributeIdIsNull() {
            addCriterion("attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIsNotNull() {
            addCriterion("attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdEqualTo(Integer value) {
            addCriterion("attribute_id =", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotEqualTo(Integer value) {
            addCriterion("attribute_id <>", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThan(Integer value) {
            addCriterion("attribute_id >", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_id >=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThan(Integer value) {
            addCriterion("attribute_id <", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_id <=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIn(List<Integer> values) {
            addCriterion("attribute_id in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotIn(List<Integer> values) {
            addCriterion("attribute_id not in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id between", value1, value2, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id not between", value1, value2, "attributeId");
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

        public Criteria andAttributeNameIsNull() {
            addCriterion("attribute_name is null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIsNotNull() {
            addCriterion("attribute_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameEqualTo(String value) {
            addCriterion("attribute_name =", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotEqualTo(String value) {
            addCriterion("attribute_name <>", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThan(String value) {
            addCriterion("attribute_name >", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_name >=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThan(String value) {
            addCriterion("attribute_name <", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThanOrEqualTo(String value) {
            addCriterion("attribute_name <=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLike(String value) {
            addCriterion("attribute_name like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotLike(String value) {
            addCriterion("attribute_name not like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIn(List<String> values) {
            addCriterion("attribute_name in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotIn(List<String> values) {
            addCriterion("attribute_name not in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameBetween(String value1, String value2) {
            addCriterion("attribute_name between", value1, value2, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotBetween(String value1, String value2) {
            addCriterion("attribute_name not between", value1, value2, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0IsNull() {
            addCriterion("attribute_price0 is null");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0IsNotNull() {
            addCriterion("attribute_price0 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0EqualTo(BigDecimal value) {
            addCriterion("attribute_price0 =", value, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0NotEqualTo(BigDecimal value) {
            addCriterion("attribute_price0 <>", value, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0GreaterThan(BigDecimal value) {
            addCriterion("attribute_price0 >", value, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_price0 >=", value, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0LessThan(BigDecimal value) {
            addCriterion("attribute_price0 <", value, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_price0 <=", value, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0In(List<BigDecimal> values) {
            addCriterion("attribute_price0 in", values, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0NotIn(List<BigDecimal> values) {
            addCriterion("attribute_price0 not in", values, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_price0 between", value1, value2, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePrice0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_price0 not between", value1, value2, "attributePrice0");
            return (Criteria) this;
        }

        public Criteria andAttributePriceIsNull() {
            addCriterion("attribute_price is null");
            return (Criteria) this;
        }

        public Criteria andAttributePriceIsNotNull() {
            addCriterion("attribute_price is not null");
            return (Criteria) this;
        }

        public Criteria andAttributePriceEqualTo(BigDecimal value) {
            addCriterion("attribute_price =", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceNotEqualTo(BigDecimal value) {
            addCriterion("attribute_price <>", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceGreaterThan(BigDecimal value) {
            addCriterion("attribute_price >", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_price >=", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceLessThan(BigDecimal value) {
            addCriterion("attribute_price <", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_price <=", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceIn(List<BigDecimal> values) {
            addCriterion("attribute_price in", values, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceNotIn(List<BigDecimal> values) {
            addCriterion("attribute_price not in", values, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_price between", value1, value2, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_price not between", value1, value2, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentIsNull() {
            addCriterion("attribute_price_agent is null");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentIsNotNull() {
            addCriterion("attribute_price_agent is not null");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentEqualTo(BigDecimal value) {
            addCriterion("attribute_price_agent =", value, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentNotEqualTo(BigDecimal value) {
            addCriterion("attribute_price_agent <>", value, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentGreaterThan(BigDecimal value) {
            addCriterion("attribute_price_agent >", value, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_price_agent >=", value, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentLessThan(BigDecimal value) {
            addCriterion("attribute_price_agent <", value, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_price_agent <=", value, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentIn(List<BigDecimal> values) {
            addCriterion("attribute_price_agent in", values, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentNotIn(List<BigDecimal> values) {
            addCriterion("attribute_price_agent not in", values, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_price_agent between", value1, value2, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceAgentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_price_agent not between", value1, value2, "attributePriceAgent");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipIsNull() {
            addCriterion("attribute_price_vip is null");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipIsNotNull() {
            addCriterion("attribute_price_vip is not null");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipEqualTo(BigDecimal value) {
            addCriterion("attribute_price_vip =", value, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipNotEqualTo(BigDecimal value) {
            addCriterion("attribute_price_vip <>", value, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipGreaterThan(BigDecimal value) {
            addCriterion("attribute_price_vip >", value, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_price_vip >=", value, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipLessThan(BigDecimal value) {
            addCriterion("attribute_price_vip <", value, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipLessThanOrEqualTo(BigDecimal value) {
            addCriterion("attribute_price_vip <=", value, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipIn(List<BigDecimal> values) {
            addCriterion("attribute_price_vip in", values, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipNotIn(List<BigDecimal> values) {
            addCriterion("attribute_price_vip not in", values, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_price_vip between", value1, value2, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributePriceVipNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attribute_price_vip not between", value1, value2, "attributePriceVip");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryIsNull() {
            addCriterion("attribute_repertory is null");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryIsNotNull() {
            addCriterion("attribute_repertory is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryEqualTo(Integer value) {
            addCriterion("attribute_repertory =", value, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryNotEqualTo(Integer value) {
            addCriterion("attribute_repertory <>", value, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryGreaterThan(Integer value) {
            addCriterion("attribute_repertory >", value, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_repertory >=", value, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryLessThan(Integer value) {
            addCriterion("attribute_repertory <", value, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_repertory <=", value, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryIn(List<Integer> values) {
            addCriterion("attribute_repertory in", values, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryNotIn(List<Integer> values) {
            addCriterion("attribute_repertory not in", values, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryBetween(Integer value1, Integer value2) {
            addCriterion("attribute_repertory between", value1, value2, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeRepertoryNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_repertory not between", value1, value2, "attributeRepertory");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeIsNull() {
            addCriterion("attribute_size is null");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeIsNotNull() {
            addCriterion("attribute_size is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeEqualTo(String value) {
            addCriterion("attribute_size =", value, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeNotEqualTo(String value) {
            addCriterion("attribute_size <>", value, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeGreaterThan(String value) {
            addCriterion("attribute_size >", value, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_size >=", value, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeLessThan(String value) {
            addCriterion("attribute_size <", value, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeLessThanOrEqualTo(String value) {
            addCriterion("attribute_size <=", value, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeLike(String value) {
            addCriterion("attribute_size like", value, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeNotLike(String value) {
            addCriterion("attribute_size not like", value, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeIn(List<String> values) {
            addCriterion("attribute_size in", values, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeNotIn(List<String> values) {
            addCriterion("attribute_size not in", values, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeBetween(String value1, String value2) {
            addCriterion("attribute_size between", value1, value2, "attributeSize");
            return (Criteria) this;
        }

        public Criteria andAttributeSizeNotBetween(String value1, String value2) {
            addCriterion("attribute_size not between", value1, value2, "attributeSize");
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