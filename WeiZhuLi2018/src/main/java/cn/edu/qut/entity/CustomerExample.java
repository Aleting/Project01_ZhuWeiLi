package cn.edu.qut.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameIsNull() {
            addCriterion("customer_login_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameIsNotNull() {
            addCriterion("customer_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameEqualTo(String value) {
            addCriterion("customer_login_name =", value, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameNotEqualTo(String value) {
            addCriterion("customer_login_name <>", value, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameGreaterThan(String value) {
            addCriterion("customer_login_name >", value, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_login_name >=", value, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameLessThan(String value) {
            addCriterion("customer_login_name <", value, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameLessThanOrEqualTo(String value) {
            addCriterion("customer_login_name <=", value, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameLike(String value) {
            addCriterion("customer_login_name like", value, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameNotLike(String value) {
            addCriterion("customer_login_name not like", value, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameIn(List<String> values) {
            addCriterion("customer_login_name in", values, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameNotIn(List<String> values) {
            addCriterion("customer_login_name not in", values, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameBetween(String value1, String value2) {
            addCriterion("customer_login_name between", value1, value2, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginNameNotBetween(String value1, String value2) {
            addCriterion("customer_login_name not between", value1, value2, "customerLoginName");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNull() {
            addCriterion("customer_password is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNotNull() {
            addCriterion("customer_password is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordEqualTo(String value) {
            addCriterion("customer_password =", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotEqualTo(String value) {
            addCriterion("customer_password <>", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThan(String value) {
            addCriterion("customer_password >", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("customer_password >=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThan(String value) {
            addCriterion("customer_password <", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThanOrEqualTo(String value) {
            addCriterion("customer_password <=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLike(String value) {
            addCriterion("customer_password like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotLike(String value) {
            addCriterion("customer_password not like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIn(List<String> values) {
            addCriterion("customer_password in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotIn(List<String> values) {
            addCriterion("customer_password not in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordBetween(String value1, String value2) {
            addCriterion("customer_password between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotBetween(String value1, String value2) {
            addCriterion("customer_password not between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("customer_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("customer_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(String value) {
            addCriterion("customer_sex =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(String value) {
            addCriterion("customer_sex <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(String value) {
            addCriterion("customer_sex >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(String value) {
            addCriterion("customer_sex >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(String value) {
            addCriterion("customer_sex <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(String value) {
            addCriterion("customer_sex <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLike(String value) {
            addCriterion("customer_sex like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotLike(String value) {
            addCriterion("customer_sex not like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<String> values) {
            addCriterion("customer_sex in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<String> values) {
            addCriterion("customer_sex not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(String value1, String value2) {
            addCriterion("customer_sex between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(String value1, String value2) {
            addCriterion("customer_sex not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerImgIsNull() {
            addCriterion("customer_img is null");
            return (Criteria) this;
        }

        public Criteria andCustomerImgIsNotNull() {
            addCriterion("customer_img is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerImgEqualTo(String value) {
            addCriterion("customer_img =", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgNotEqualTo(String value) {
            addCriterion("customer_img <>", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgGreaterThan(String value) {
            addCriterion("customer_img >", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgGreaterThanOrEqualTo(String value) {
            addCriterion("customer_img >=", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgLessThan(String value) {
            addCriterion("customer_img <", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgLessThanOrEqualTo(String value) {
            addCriterion("customer_img <=", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgLike(String value) {
            addCriterion("customer_img like", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgNotLike(String value) {
            addCriterion("customer_img not like", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgIn(List<String> values) {
            addCriterion("customer_img in", values, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgNotIn(List<String> values) {
            addCriterion("customer_img not in", values, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgBetween(String value1, String value2) {
            addCriterion("customer_img between", value1, value2, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgNotBetween(String value1, String value2) {
            addCriterion("customer_img not between", value1, value2, "customerImg");
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

        public Criteria andCustomerGradeIsNull() {
            addCriterion("customer_grade is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIsNotNull() {
            addCriterion("customer_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeEqualTo(String value) {
            addCriterion("customer_grade =", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeNotEqualTo(String value) {
            addCriterion("customer_grade <>", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeGreaterThan(String value) {
            addCriterion("customer_grade >", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_grade >=", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeLessThan(String value) {
            addCriterion("customer_grade <", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeLessThanOrEqualTo(String value) {
            addCriterion("customer_grade <=", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeLike(String value) {
            addCriterion("customer_grade like", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeNotLike(String value) {
            addCriterion("customer_grade not like", value, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeIn(List<String> values) {
            addCriterion("customer_grade in", values, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeNotIn(List<String> values) {
            addCriterion("customer_grade not in", values, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeBetween(String value1, String value2) {
            addCriterion("customer_grade between", value1, value2, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerGradeNotBetween(String value1, String value2) {
            addCriterion("customer_grade not between", value1, value2, "customerGrade");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateIsNull() {
            addCriterion("customer_reg_date is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateIsNotNull() {
            addCriterion("customer_reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateEqualTo(Date value) {
            addCriterionForJDBCDate("customer_reg_date =", value, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_reg_date <>", value, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_reg_date >", value, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_reg_date >=", value, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateLessThan(Date value) {
            addCriterionForJDBCDate("customer_reg_date <", value, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_reg_date <=", value, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateIn(List<Date> values) {
            addCriterionForJDBCDate("customer_reg_date in", values, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_reg_date not in", values, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_reg_date between", value1, value2, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_reg_date not between", value1, value2, "customerRegDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameIsNull() {
            addCriterion("customer_real_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameIsNotNull() {
            addCriterion("customer_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameEqualTo(String value) {
            addCriterion("customer_real_name =", value, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameNotEqualTo(String value) {
            addCriterion("customer_real_name <>", value, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameGreaterThan(String value) {
            addCriterion("customer_real_name >", value, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_real_name >=", value, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameLessThan(String value) {
            addCriterion("customer_real_name <", value, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameLessThanOrEqualTo(String value) {
            addCriterion("customer_real_name <=", value, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameLike(String value) {
            addCriterion("customer_real_name like", value, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameNotLike(String value) {
            addCriterion("customer_real_name not like", value, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameIn(List<String> values) {
            addCriterion("customer_real_name in", values, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameNotIn(List<String> values) {
            addCriterion("customer_real_name not in", values, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameBetween(String value1, String value2) {
            addCriterion("customer_real_name between", value1, value2, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerRealNameNotBetween(String value1, String value2) {
            addCriterion("customer_real_name not between", value1, value2, "customerRealName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayIsNull() {
            addCriterion("customer_epay is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayIsNotNull() {
            addCriterion("customer_epay is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayEqualTo(String value) {
            addCriterion("customer_epay =", value, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayNotEqualTo(String value) {
            addCriterion("customer_epay <>", value, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayGreaterThan(String value) {
            addCriterion("customer_epay >", value, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayGreaterThanOrEqualTo(String value) {
            addCriterion("customer_epay >=", value, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayLessThan(String value) {
            addCriterion("customer_epay <", value, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayLessThanOrEqualTo(String value) {
            addCriterion("customer_epay <=", value, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayLike(String value) {
            addCriterion("customer_epay like", value, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayNotLike(String value) {
            addCriterion("customer_epay not like", value, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayIn(List<String> values) {
            addCriterion("customer_epay in", values, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayNotIn(List<String> values) {
            addCriterion("customer_epay not in", values, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayBetween(String value1, String value2) {
            addCriterion("customer_epay between", value1, value2, "customerEpay");
            return (Criteria) this;
        }

        public Criteria andCustomerEpayNotBetween(String value1, String value2) {
            addCriterion("customer_epay not between", value1, value2, "customerEpay");
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

        public Criteria andClMemoIsNull() {
            addCriterion("cl_memo is null");
            return (Criteria) this;
        }

        public Criteria andClMemoIsNotNull() {
            addCriterion("cl_memo is not null");
            return (Criteria) this;
        }

        public Criteria andClMemoEqualTo(String value) {
            addCriterion("cl_memo =", value, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoNotEqualTo(String value) {
            addCriterion("cl_memo <>", value, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoGreaterThan(String value) {
            addCriterion("cl_memo >", value, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoGreaterThanOrEqualTo(String value) {
            addCriterion("cl_memo >=", value, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoLessThan(String value) {
            addCriterion("cl_memo <", value, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoLessThanOrEqualTo(String value) {
            addCriterion("cl_memo <=", value, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoLike(String value) {
            addCriterion("cl_memo like", value, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoNotLike(String value) {
            addCriterion("cl_memo not like", value, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoIn(List<String> values) {
            addCriterion("cl_memo in", values, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoNotIn(List<String> values) {
            addCriterion("cl_memo not in", values, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoBetween(String value1, String value2) {
            addCriterion("cl_memo between", value1, value2, "clMemo");
            return (Criteria) this;
        }

        public Criteria andClMemoNotBetween(String value1, String value2) {
            addCriterion("cl_memo not between", value1, value2, "clMemo");
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