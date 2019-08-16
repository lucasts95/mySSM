package com.qf.pojo;

import java.util.List;
import java.util.Set;

/**
 * Created by DELL on 2019/7/17.
 */
public class UserInfo {
    int userid;
    String username;
    String password;

    String account;
    String email;
    String mobile;
    String areaCode;
    int status;
    String icon;

    List<RoleInfo> roleInfoList;
    Set<MenuInfo> menuInfoList;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<RoleInfo> getRoleInfoList() {
        return roleInfoList;
    }

    public void setRoleInfoList(List<RoleInfo> roleInfoList) {
        this.roleInfoList = roleInfoList;
    }

    public Set<MenuInfo> getMenuInfoList() {
        return menuInfoList;
    }

    public void setMenuInfoList(Set<MenuInfo> menuInfoList) {
        this.menuInfoList = menuInfoList;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", status=" + status +
                ", icon='" + icon + '\'' +
                ", roleInfoList=" + roleInfoList +
                ", menuInfoList=" + menuInfoList +
                '}';
    }
}
