package cn.edu.qut.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AddGoods {
    private Integer goodsId;

    private Integer sortId;

    private Integer storeId;

    private String goodsName;

    private String goodsImg1;

    private String goodsImg2;

    private String goodsImg3;

    private String goodsState;

    private Integer supplierId;

    private Date startTime;

    private String goodsContent;

    private Integer attributeId;

    private String attributeName;

    private BigDecimal attributePrice0;

    private BigDecimal attributePrice;

    private BigDecimal attributePriceAgent;

    private BigDecimal attributePriceVip;

    private Integer attributeRepertory;

    private String attributeSize;

    private String attributeColor;

    private String attributeMemo;

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
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

    public String getAttributeColor() {
        return attributeColor;
    }

    public void setAttributeColor(String attributeColor) {
        this.attributeColor = attributeColor == null ? null : attributeColor.trim();
    }

    public String getAttributeMemo() {
        return attributeMemo;
    }

    public void setAttributeMemo(String attributeMemo) {
        this.attributeMemo = attributeMemo == null ? null : attributeMemo.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsImg1() {
        return goodsImg1;
    }

    public void setGoodsImg1(String goodsImg1) {
        this.goodsImg1 = goodsImg1 == null ? null : goodsImg1.trim();
    }

    public String getGoodsImg2() {
        return goodsImg2;
    }

    public void setGoodsImg2(String goodsImg2) {
        this.goodsImg2 = goodsImg2 == null ? null : goodsImg2.trim();
    }

    public String getGoodsImg3() {
        return goodsImg3;
    }

    public void setGoodsImg3(String goodsImg3) {
        this.goodsImg3 = goodsImg3 == null ? null : goodsImg3.trim();
    }

    public String getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(String goodsState) {
        this.goodsState = goodsState == null ? null : goodsState.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent == null ? null : goodsContent.trim();
    }
}
