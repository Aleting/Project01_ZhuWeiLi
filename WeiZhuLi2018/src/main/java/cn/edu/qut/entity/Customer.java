package cn.edu.qut.entity;

import java.util.Date;

public class Customer {
    private Integer customerId;

    private String customerLoginName;

    private String customerPassword;

    private String customerSex;

    private String customerImg;

    private Integer roleId;

    private String customerGrade;

    private Date customerRegDate;

    private String customerRealName;

    private String customerPhone;

    private String customerEpay;

    private Integer sellerId;

    private String clMemo;

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerLoginName='" + customerLoginName + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerSex='" + customerSex + '\'' +
                ", customerImg='" + customerImg + '\'' +
                ", roleId=" + roleId +
                ", customerGrade='" + customerGrade + '\'' +
                ", customerRegDate=" + customerRegDate +
                ", customerRealName='" + customerRealName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerEpay='" + customerEpay + '\'' +
                ", sellerId=" + sellerId +
                ", clMemo='" + clMemo + '\'' +
                '}';
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerLoginName() {
        return customerLoginName;
    }

    public void setCustomerLoginName(String customerLoginName) {
        this.customerLoginName = customerLoginName == null ? null : customerLoginName.trim();
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword == null ? null : customerPassword.trim();
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex == null ? null : customerSex.trim();
    }

    public String getCustomerImg() {
        return customerImg;
    }

    public void setCustomerImg(String customerImg) {
        this.customerImg = customerImg == null ? null : customerImg.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade == null ? null : customerGrade.trim();
    }

    public Date getCustomerRegDate() {
        return customerRegDate;
    }

    public void setCustomerRegDate(Date customerRegDate) {
        this.customerRegDate = customerRegDate;
    }

    public String getCustomerRealName() {
        return customerRealName;
    }

    public void setCustomerRealName(String customerRealName) {
        this.customerRealName = customerRealName == null ? null : customerRealName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerEpay() {
        return customerEpay;
    }

    public void setCustomerEpay(String customerEpay) {
        this.customerEpay = customerEpay == null ? null : customerEpay.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getClMemo() {
        return clMemo;
    }

    public void setClMemo(String clMemo) {
        this.clMemo = clMemo == null ? null : clMemo.trim();
    }
}