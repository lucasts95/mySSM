package com.qf.pojo;

import java.util.List;

/**
 * Created by DELL on 2019/7/23.
 */
public class RoleInfo {

    int roleid;
    String rolename;
    String shortname;

    List<MenuInfo> menuInfoList;
    List<UserInfo> userInfoList;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public List<MenuInfo> getMenuInfoList() {
        return menuInfoList;
    }

    public void setMenuInfoList(List<MenuInfo> menuInfoList) {
        this.menuInfoList = menuInfoList;
    }

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", shortname='" + shortname + '\'' +
                ", menuInfoList=" + menuInfoList +
                ", userInfoList=" + userInfoList +
                '}';
    }
}
