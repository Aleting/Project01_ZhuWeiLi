package cn.edu.qut.entity;

import java.util.Date;

public class Store {
    private Integer storeId;

    private Integer typeId;

    private String storeName;

    private String storeImg;

    private String storeState;

    private Date storeStartTime;

    private Date storeEndTime;

    private String storeContent;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreImg() {
        return storeImg;
    }

    public void setStoreImg(String storeImg) {
        this.storeImg = storeImg == null ? null : storeImg.trim();
    }

    public String getStoreState() {
        return storeState;
    }

    public void setStoreState(String storeState) {
        this.storeState = storeState == null ? null : storeState.trim();
    }

    public Date getStoreStartTime() {
        return storeStartTime;
    }

    public void setStoreStartTime(Date storeStartTime) {
        this.storeStartTime = storeStartTime;
    }

    public Date getStoreEndTime() {
        return storeEndTime;
    }

    public void setStoreEndTime(Date storeEndTime) {
        this.storeEndTime = storeEndTime;
    }

    public String getStoreContent() {
        return storeContent;
    }

    public void setStoreContent(String storeContent) {
        this.storeContent = storeContent == null ? null : storeContent.trim();
    }
}