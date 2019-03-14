package cn.edu.qut.entity;

import java.math.BigDecimal;

public class Attribute {
    private Integer attributeId;

    private Integer goodsId;

    private String attributeName;

    private BigDecimal attributePrice0;

    private BigDecimal attributePrice;

    private BigDecimal attributePriceAgent;

    private BigDecimal attributePriceVip;

    private Integer attributeRepertory;

    private String attributeSize;

    private String attributeMemo;

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }

    public BigDecimal getAttributePrice0() {
        return attributePrice0;
    }

    public void setAttributePrice0(BigDecimal attributePrice0) {
        this.attributePrice0 = attributePrice0;
    }

    public BigDecimal getAttributePrice() {
        return attributePrice;
    }

    public void setAttributePrice(BigDecimal attributePrice) {
        this.attributePrice = attributePrice;
    }

    public BigDecimal getAttributePriceAgent() {
        return attributePriceAgent;
    }

    public void setAttributePriceAgent(BigDecimal attributePriceAgent) {
        this.attributePriceAgent = attributePriceAgent;
    }

    public BigDecimal getAttributePriceVip() {
        return attributePriceVip;
    }

    public void setAttributePriceVip(BigDecimal attributePriceVip) {
        this.attributePriceVip = attributePriceVip;
    }

    public Integer getAttributeRepertory() {
        return attributeRepertory;
    }

    public void setAttributeRepertory(Integer attributeRepertory) {
        this.attributeRepertory = attributeRepertory;
    }

    public String getAttributeSize() {
        return attributeSize;
    }

    public void setAttributeSize(String attributeSize) {
        this.attributeSize = attributeSize == null ? null : attributeSize.trim();
    }

    public String getAttributeMemo() {
        return attributeMemo;
    }

    public void setAttributeMemo(String attributeMemo) {
        this.attributeMemo = attributeMemo == null ? null : attributeMemo.trim();
    }
}