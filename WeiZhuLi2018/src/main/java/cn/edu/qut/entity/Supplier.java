package cn.edu.qut.entity;

public class Supplier {
    private Integer supplierId;

    private String supplierName;

    private String supplierContacts;

    private String supplierWx;

    private String supplierEpay;

    private String supplierPhone;

    private Integer storeId;

    private String supplierMemo;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierContacts() {
        return supplierContacts;
    }

    public void setSupplierContacts(String supplierContacts) {
        this.supplierContacts = supplierContacts == null ? null : supplierContacts.trim();
    }

    public String getSupplierWx() {
        return supplierWx;
    }

    public void setSupplierWx(String supplierWx) {
        this.supplierWx = supplierWx == null ? null : supplierWx.trim();
    }

    public String getSupplierEpay() {
        return supplierEpay;
    }

    public void setSupplierEpay(String supplierEpay) {
        this.supplierEpay = supplierEpay == null ? null : supplierEpay.trim();
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone == null ? null : supplierPhone.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getSupplierMemo() {
        return supplierMemo;
    }

    public void setSupplierMemo(String supplierMemo) {
        this.supplierMemo = supplierMemo == null ? null : supplierMemo.trim();
    }
}