package cn.edu.qut.entity;

public class Sort {
    private Integer sortId;

    private String sortName;

    private String sortGrade;

    private String sortParent;

    private String sortShow;

    private Integer storeId;

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName == null ? null : sortName.trim();
    }

    public String getSortGrade() {
        return sortGrade;
    }

    public void setSortGrade(String sortGrade) {
        this.sortGrade = sortGrade == null ? null : sortGrade.trim();
    }

    public String getSortParent() {
        return sortParent;
    }

    public void setSortParent(String sortParent) {
        this.sortParent = sortParent == null ? null : sortParent.trim();
    }

    public String getSortShow() {
        return sortShow;
    }

    public void setSortShow(String sortShow) {
        this.sortShow = sortShow == null ? null : sortShow.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}