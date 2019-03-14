package cn.edu.qut.entity;

public class Clerk_permission {
    private Integer clerkPermissionId;

    private Integer sellerId;

    private Integer permissionId;

    public Integer getClerkPermissionId() {
        return clerkPermissionId;
    }

    public void setClerkPermissionId(Integer clerkPermissionId) {
        this.clerkPermissionId = clerkPermissionId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}