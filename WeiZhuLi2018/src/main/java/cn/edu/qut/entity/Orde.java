package cn.edu.qut.entity;

import java.util.Date;

public class Orde {
    private Integer orderId;

    private Integer orderNumber;

    private Date orderTime;

    private String orderTime2;

    private Float orderMoney;

    private String orderState;

    private Integer customerId;

    private String address;

    private Integer storeId;

    private String orderEpayType;

    private Integer sellerId;

    private Date orderEpayTime;

    private String customerLoginName;

    private String goodsName;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getOrderTime2() {
        return orderTime2;
    }

    public void setOrderTime2(String orderTime2) {
        this.orderTime2 = orderTime2;
    }

    public String getCustomerLoginName() {
        return customerLoginName;
    }

    public void setCustomerLoginName(String customerLoginName) {
        this.customerLoginName = customerLoginName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Float getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Float orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String  getOrderEpayType() {
        return orderEpayType;
    }

    public void setOrderEpayType(String orderEpayType) {
        this.orderEpayType = orderEpayType == null ? null : orderEpayType.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Date getOrderEpayTime() {
        return orderEpayTime;
    }

    public void setOrderEpayTime(Date orderEpayTime) {
        this.orderEpayTime = orderEpayTime;
    }
}