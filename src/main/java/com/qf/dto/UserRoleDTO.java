package com.qf.dto;

/**
 * Created by DELL on 2019/8/2.
 */
public class UserRoleDTO {
    int roleId;
    int userId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserRoleDTO{" +
                "roleId=" + roleId +
                ", userId=" + userId +
                '}';
    }
}
