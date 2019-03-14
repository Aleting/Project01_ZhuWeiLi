package cn.edu.qut.entity;

import java.math.BigDecimal;

public class CommodityManagement {
    private Integer goodsId;

    private Integer virtualId;

    private Integer sortId;

    private String goodsName;

    private String goodsImg1;

    private String goodsImg2;

    private String goodsImg3;

    private String goodsState;

    private Integer supplierId;

    private String goodsContent;

    private Integer attributeId;

    private BigDecimal attributePrice0;

    private BigDecimal attributePrice;

    private BigDecimal attributePriceVip;

    private String supplierName;

    private String sortName;

    private Integer attributeRepertory;

    private String startTime;

    private String attributeSize;

    private String attributeMemo;

    private Integer goodsNum;

    public Integer getVirtualId() {
        return virtualId;
    }

    public void setVirtualId(Integer virtualId) {
        this.virtualId = virtualId;
    }

    public String getAttributeMemo() {
        return attributeMemo;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public void setAttributeMemo(String attributeMemo) {
        this.attributeMemo = attributeMemo;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeSize() {
        return attributeSize;
    }

    public void setAttributeSize(String attributeSize) {
        this.attributeSize = attributeSize;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getAttributeRepertory() {
        return attributeRepertory;
    }

    public void setAttributeRepertory(Integer attributeRepertory) {
        this.attributeRepertory = attributeRepertory;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImg1() {
        return goodsImg1;
    }

    public void setGoodsImg1(String goodsImg1) {
        this.goodsImg1 = goodsImg1;
    }

    public String getGoodsImg2() {
        return goodsImg2;
    }

    public void setGoodsImg2(String goodsImg2) {
        this.goodsImg2 = goodsImg2;
    }

    public String getGoodsImg3() {
        return goodsImg3;
    }

    public void setGoodsImg3(String goodsImg3) {
        this.goodsImg3 = goodsImg3;
    }

    public String getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(String goodsState) {
        this.goodsState = goodsState;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
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

    public BigDecimal getAttributePriceVip() {
        return attributePriceVip;
    }

    public void setAttributePriceVip(BigDecimal attributePriceVip) {
        this.attributePriceVip = attributePriceVip;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public CommodityManagement(Integer goodsId, Integer sortId, String goodsName, String goodsImg1, String goodsImg2, String goodsImg3, String goodsState, Integer supplierId, String goodsContent, BigDecimal attributePrice0, BigDecimal attributePrice, BigDecimal attributePriceVip, String supplierName, String sortName) {
        this.goodsId = goodsId;
        this.sortId = sortId;
        this.goodsName = goodsName;
        this.goodsImg1 = goodsImg1;
        this.goodsImg2 = goodsImg2;
        this.goodsImg3 = goodsImg3;
        this.goodsState = goodsState;
        this.supplierId = supplierId;
        this.goodsContent = goodsContent;
        this.attributePrice0 = attributePrice0;
        this.attributePrice = attributePrice;
        this.attributePriceVip = attributePriceVip;
        this.supplierName = supplierName;
        this.sortName=sortName;
    }

    public CommodityManagement() {
    }
}
