package cn.edu.qut.entity;

import java.math.BigDecimal;
import java.util.Date;

public class T_bought extends T_boughtKey {
    private Integer sellerId;

    private Integer goodsId;

    private String goSpec;

    private Integer goExNumber;

    private String suppId;

    private Date bouDate;

    private BigDecimal sumPrice;

    private String availableFlag;

    private String bouMemo;

    private String goodsName;

    private Integer goodsNum;

    private String attributeSize;

    private BigDecimal attributePrice;

    private String supplierName;

    private Integer supplierId;

    private Integer storeId;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getAttributeSize() {
        return attributeSize;
    }

    public void setAttributeSize(String attributeSize) {
        this.attributeSize = attributeSize == null ? null : attributeSize.trim();
    }

    public BigDecimal getAttributePrice() {
        return attributePrice;
    }

    public void setAttributePrice(BigDecimal attributePrice) {
        this.attributePrice = attributePrice;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoSpec() {
        return goSpec;
    }

    public void setGoSpec(String goSpec) {
        this.goSpec = goSpec == null ? null : goSpec.trim();
    }

    public Integer getGoExNumber() {
        return goExNumber;
    }

    public void setGoExNumber(Integer goExNumber) {
        this.goExNumber = goExNumber;
    }

    public String getSuppId() {
        return suppId;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId == null ? null : suppId.trim();
    }

    public Date getBouDate() {
        return bouDate;
    }

    public void setBouDate(Date bouDate) {
        this.bouDate = bouDate;
    }

    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getAvailableFlag() {
        return availableFlag;
    }

    public void setAvailableFlag(String availableFlag) {
        this.availableFlag = availableFlag == null ? null : availableFlag.trim();
    }

    public String getBouMemo() {
        return bouMemo;
    }

    public void setBouMemo(String bouMemo) {
        this.bouMemo = bouMemo == null ? null : bouMemo.trim();
    }
}