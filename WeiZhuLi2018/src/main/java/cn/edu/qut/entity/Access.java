package cn.edu.qut.entity;

import java.util.Date;

public class Access {
    private String customerName;

    private Integer storeId;

    private Date accessData;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getAccessData() {
        return accessData;
    }

    public void setAccessData(Date accessData) {
        this.accessData = accessData;
    }
}