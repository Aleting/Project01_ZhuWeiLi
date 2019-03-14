package cn.edu.qut.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerExample() {
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

        public Criteria andSellerLoginNameIsNull() {
            addCriterion("seller_login_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameIsNotNull() {
            addCriterion("seller_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameEqualTo(String value) {
            addCriterion("seller_login_name =", value, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameNotEqualTo(String value) {
            addCriterion("seller_login_name <>", value, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameGreaterThan(String value) {
            addCriterion("seller_login_name >", value, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_login_name >=", value, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameLessThan(String value) {
            addCriterion("seller_login_name <", value, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameLessThanOrEqualTo(String value) {
            addCriterion("seller_login_name <=", value, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameLike(String value) {
            addCriterion("seller_login_name like", value, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameNotLike(String value) {
            addCriterion("seller_login_name not like", value, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameIn(List<String> values) {
            addCriterion("seller_login_name in", values, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameNotIn(List<String> values) {
            addCriterion("seller_login_name not in", values, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameBetween(String value1, String value2) {
            addCriterion("seller_login_name between", value1, value2, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNameNotBetween(String value1, String value2) {
            addCriterion("seller_login_name not between", value1, value2, "sellerLoginName");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIsNull() {
            addCriterion("seller_password is null");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIsNotNull() {
            addCriterion("seller_password is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordEqualTo(String value) {
            addCriterion("seller_password =", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotEqualTo(String value) {
            addCriterion("seller_password <>", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordGreaterThan(String value) {
            addCriterion("seller_password >", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("seller_password >=", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLessThan(String value) {
            addCriterion("seller_password <", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLessThanOrEqualTo(String value) {
            addCriterion("seller_password <=", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLike(String value) {
            addCriterion("seller_password like", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotLike(String value) {
            addCriterion("seller_password not like", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIn(List<String> values) {
            addCriterion("seller_password in", values, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotIn(List<String> values) {
            addCriterion("seller_password not in", values, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordBetween(String value1, String value2) {
            addCriterion("seller_password between", value1, value2, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotBetween(String value1, String value2) {
            addCriterion("seller_password not between", value1, value2, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerStateIsNull() {
            addCriterion("seller_state is null");
            return (Criteria) this;
        }

        public Criteria andSellerStateIsNotNull() {
            addCriterion("seller_state is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStateEqualTo(String value) {
            addCriterion("seller_state =", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotEqualTo(String value) {
            addCriterion("seller_state <>", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateGreaterThan(String value) {
            addCriterion("seller_state >", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateGreaterThanOrEqualTo(String value) {
            addCriterion("seller_state >=", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateLessThan(String value) {
            addCriterion("seller_state <", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateLessThanOrEqualTo(String value) {
            addCriterion("seller_state <=", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateLike(String value) {
            addCriterion("seller_state like", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotLike(String value) {
            addCriterion("seller_state not like", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateIn(List<String> values) {
            addCriterion("seller_state in", values, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotIn(List<String> values) {
            addCriterion("seller_state not in", values, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateBetween(String value1, String value2) {
            addCriterion("seller_state between", value1, value2, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotBetween(String value1, String value2) {
            addCriterion("seller_state not between", value1, value2, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameIsNull() {
            addCriterion("seller_real_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameIsNotNull() {
            addCriterion("seller_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameEqualTo(String value) {
            addCriterion("seller_real_name =", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameNotEqualTo(String value) {
            addCriterion("seller_real_name <>", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameGreaterThan(String value) {
            addCriterion("seller_real_name >", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_real_name >=", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameLessThan(String value) {
            addCriterion("seller_real_name <", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameLessThanOrEqualTo(String value) {
            addCriterion("seller_real_name <=", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameLike(String value) {
            addCriterion("seller_real_name like", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameNotLike(String value) {
            addCriterion("seller_real_name not like", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameIn(List<String> values) {
            addCriterion("seller_real_name in", values, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameNotIn(List<String> values) {
            addCriterion("seller_real_name not in", values, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameBetween(String value1, String value2) {
            addCriterion("seller_real_name between", value1, value2, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameNotBetween(String value1, String value2) {
            addCriterion("seller_real_name not between", value1, value2, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerImgIsNull() {
            addCriterion("seller_img is null");
            return (Criteria) this;
        }

        public Criteria andSellerImgIsNotNull() {
            addCriterion("seller_img is not null");
            return (Criteria) this;
        }

        public Criteria andSellerImgEqualTo(String value) {
            addCriterion("seller_img =", value, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgNotEqualTo(String value) {
            addCriterion("seller_img <>", value, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgGreaterThan(String value) {
            addCriterion("seller_img >", value, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgGreaterThanOrEqualTo(String value) {
            addCriterion("seller_img >=", value, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgLessThan(String value) {
            addCriterion("seller_img <", value, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgLessThanOrEqualTo(String value) {
            addCriterion("seller_img <=", value, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgLike(String value) {
            addCriterion("seller_img like", value, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgNotLike(String value) {
            addCriterion("seller_img not like", value, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgIn(List<String> values) {
            addCriterion("seller_img in", values, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgNotIn(List<String> values) {
            addCriterion("seller_img not in", values, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgBetween(String value1, String value2) {
            addCriterion("seller_img between", value1, value2, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerImgNotBetween(String value1, String value2) {
            addCriterion("seller_img not between", value1, value2, "sellerImg");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIsNull() {
            addCriterion("seller_phone is null");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIsNotNull() {
            addCriterion("seller_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneEqualTo(String value) {
            addCriterion("seller_phone =", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotEqualTo(String value) {
            addCriterion("seller_phone <>", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneGreaterThan(String value) {
            addCriterion("seller_phone >", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("seller_phone >=", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLessThan(String value) {
            addCriterion("seller_phone <", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLessThanOrEqualTo(String value) {
            addCriterion("seller_phone <=", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLike(String value) {
            addCriterion("seller_phone like", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotLike(String value) {
            addCriterion("seller_phone not like", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIn(List<String> values) {
            addCriterion("seller_phone in", values, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotIn(List<String> values) {
            addCriterion("seller_phone not in", values, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneBetween(String value1, String value2) {
            addCriterion("seller_phone between", value1, value2, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotBetween(String value1, String value2) {
            addCriterion("seller_phone not between", value1, value2, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxIsNull() {
            addCriterion("seller_mailbox is null");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxIsNotNull() {
            addCriterion("seller_mailbox is not null");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxEqualTo(String value) {
            addCriterion("seller_mailbox =", value, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxNotEqualTo(String value) {
            addCriterion("seller_mailbox <>", value, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxGreaterThan(String value) {
            addCriterion("seller_mailbox >", value, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxGreaterThanOrEqualTo(String value) {
            addCriterion("seller_mailbox >=", value, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxLessThan(String value) {
            addCriterion("seller_mailbox <", value, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxLessThanOrEqualTo(String value) {
            addCriterion("seller_mailbox <=", value, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxLike(String value) {
            addCriterion("seller_mailbox like", value, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxNotLike(String value) {
            addCriterion("seller_mailbox not like", value, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxIn(List<String> values) {
            addCriterion("seller_mailbox in", values, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxNotIn(List<String> values) {
            addCriterion("seller_mailbox not in", values, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxBetween(String value1, String value2) {
            addCriterion("seller_mailbox between", value1, value2, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerMailboxNotBetween(String value1, String value2) {
            addCriterion("seller_mailbox not between", value1, value2, "sellerMailbox");
            return (Criteria) this;
        }

        public Criteria andSellerEpayIsNull() {
            addCriterion("seller_epay is null");
            return (Criteria) this;
        }

        public Criteria andSellerEpayIsNotNull() {
            addCriterion("seller_epay is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEpayEqualTo(String value) {
            addCriterion("seller_epay =", value, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayNotEqualTo(String value) {
            addCriterion("seller_epay <>", value, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayGreaterThan(String value) {
            addCriterion("seller_epay >", value, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayGreaterThanOrEqualTo(String value) {
            addCriterion("seller_epay >=", value, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayLessThan(String value) {
            addCriterion("seller_epay <", value, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayLessThanOrEqualTo(String value) {
            addCriterion("seller_epay <=", value, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayLike(String value) {
            addCriterion("seller_epay like", value, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayNotLike(String value) {
            addCriterion("seller_epay not like", value, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayIn(List<String> values) {
            addCriterion("seller_epay in", values, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayNotIn(List<String> values) {
            addCriterion("seller_epay not in", values, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayBetween(String value1, String value2) {
            addCriterion("seller_epay between", value1, value2, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andSellerEpayNotBetween(String value1, String value2) {
            addCriterion("seller_epay not between", value1, value2, "sellerEpay");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateIsNull() {
            addCriterion("seller_reg_date is null");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateIsNotNull() {
            addCriterion("seller_reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateEqualTo(Date value) {
            addCriterionForJDBCDate("seller_reg_date =", value, "sellerRegDate");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("seller_reg_date <>", value, "sellerRegDate");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateGreaterThan(Date value) {
            addCriterionForJDBCDate("seller_reg_date >", value, "sellerRegDate");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("seller_reg_date >=", value, "sellerRegDate");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateLessThan(Date value) {
            addCriterionForJDBCDate("seller_reg_date <", value, "sellerRegDate");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("seller_reg_date <=", value, "sellerRegDate");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateIn(List<Date> values) {
            addCriterionForJDBCDate("seller_reg_date in", values, "sellerRegDate");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("seller_reg_date not in", values, "sellerRegDate");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("seller_reg_date between", value1, value2, "sellerRegDate");
            return (Criteria) this;
        }

        public Criteria andSellerRegDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("seller_reg_date not between", value1, value2, "sellerRegDate");
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