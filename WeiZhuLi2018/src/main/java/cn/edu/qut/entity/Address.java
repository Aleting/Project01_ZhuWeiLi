package cn.edu.qut.entity;

public class Address {
    private Integer addressId;

    private String addressContent;

    private String addressContact;

    private String addressType;

    private String addressPhone;

    private Integer customerId;

    private String addressMeno;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressContent() {
        return addressContent;
    }

    public void setAddressContent(String addressContent) {
        this.addressContent = addressContent == null ? null : addressContent.trim();
    }

    public String getAddressContact() {
        return addressContact;
    }

    public void setAddressContact(String addressContact) {
        this.addressContact = addressContact == null ? null : addressContact.trim();
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType == null ? null : addressType.trim();
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone == null ? null : addressPhone.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getAddressMeno() {
        return addressMeno;
    }

    public void setAddressMeno(String addressMeno) {
        this.addressMeno = addressMeno == null ? null : addressMeno.trim();
    }
}