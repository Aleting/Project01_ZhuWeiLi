package cn.edu.qut.entity;

public class Permission {
    private Integer permissionId;

    private Integer permissionParent;

    private String permissionName;

    private String permissionCode;

    private String permissionUrl;

    private String permissionState;

    private Integer permissionIsnavi;

    private String permissionIcon;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getPermissionParent() {
        return permissionParent;
    }

    public void setPermissionParent(Integer permissionParent) {
        this.permissionParent = permissionParent;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl == null ? null : permissionUrl.trim();
    }

    public String getPermissionState() {
        return permissionState;
    }

    public void setPermissionState(String permissionState) {
        this.permissionState = permissionState == null ? null : permissionState.trim();
    }

    public Integer getPermissionIsnavi() {
        return permissionIsnavi;
    }

    public void setPermissionIsnavi(Integer permissionIsnavi) {
        this.permissionIsnavi = permissionIsnavi;
    }

    public String getPermissionIcon() {
        return permissionIcon;
    }

    public void setPermissionIcon(String permissionIcon) {
        this.permissionIcon = permissionIcon == null ? null : permissionIcon.trim();
    }
}