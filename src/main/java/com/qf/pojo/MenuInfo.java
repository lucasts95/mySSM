package com.qf.pojo;

import java.util.List;

/**
 * Created by DELL on 2019/7/23.
 */
public class MenuInfo {

    int mid;
    String menuName;
    String menuIcon;
    String menuUrl;
    int parentId;
    List<MenuInfo> childMenus;
    List<RoleInfo> roleInfoList;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public List<MenuInfo> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<MenuInfo> childMenus) {
        this.childMenus = childMenus;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }


    public List<RoleInfo> getRoleInfoList() {
        return roleInfoList;
    }

    public void setRoleInfoList(List<RoleInfo> roleInfoList) {
        this.roleInfoList = roleInfoList;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "mid=" + mid +
                ", menuName='" + menuName + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", parentId=" + parentId +
                ", childMenus=" + childMenus +
                ", roleInfoList=" + roleInfoList +
                '}';
    }
}
