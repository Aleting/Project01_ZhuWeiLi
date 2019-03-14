package cn.edu.qut.entity;

import java.util.Date;

public class Seller {
    private Integer sellerId;

    private String sellerLoginName;

    private String sellerPassword;

    private String sellerState;

    private String sellerRealName;

    private String sellerImg;

    private String sellerPhone;

    private String sellerMailbox;

    private String sellerEpay;

    private Integer roleId;

    private Date sellerRegDate;

    private Integer storeId;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerLoginName() {
        return sellerLoginName;
    }

    public void setSellerLoginName(String sellerLoginName) {
        this.sellerLoginName = sellerLoginName == null ? null : sellerLoginName.trim();
    }

    public String getSellerPassword() {
        return sellerPassword;
    }

    public void setSellerPassword(String sellerPassword) {
        this.sellerPassword = sellerPassword == null ? null : sellerPassword.trim();
    }

    public String getSellerState() {
        return sellerState;
    }

    public void setSellerState(String sellerState) {
        this.sellerState = sellerState == null ? null : sellerState.trim();
    }

    public String getSellerRealName() {
        return sellerRealName;
    }

    public void setSellerRealName(String sellerRealName) {
        this.sellerRealName = sellerRealName == null ? null : sellerRealName.trim();
    }

    public String getSellerImg() {
        return sellerImg;
    }

    public void setSellerImg(String sellerImg) {
        this.sellerImg = sellerImg == null ? null : sellerImg.trim();
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
    }

    public String getSellerMailbox() {
        return sellerMailbox;
    }

    public void setSellerMailbox(String sellerMailbox) {
        this.sellerMailbox = sellerMailbox == null ? null : sellerMailbox.trim();
    }

    public String getSellerEpay() {
        return sellerEpay;
    }

    public void setSellerEpay(String sellerEpay) {
        this.sellerEpay = sellerEpay == null ? null : sellerEpay.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getSellerRegDate() {
        return sellerRegDate;
    }

    public void setSellerRegDate(Date sellerRegDate) {
        this.sellerRegDate = sellerRegDate;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}