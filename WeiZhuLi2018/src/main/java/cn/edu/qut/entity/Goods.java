package cn.edu.qut.entity;

import java.util.Date;

public class Goods {
    private Integer goodsId;

    private Integer virtualId;

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getVirtualId() {
        return virtualId;
    }

    public void setVirtualId(Integer virtualId) {
        this.virtualId = virtualId;
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