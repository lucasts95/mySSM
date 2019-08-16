package com.qf.vo;

/**
 * Created by DELL on 2019/8/1.
 */
public class RoleInfoVO {
    int roleid;
    String rolename;
    String shortname;

    boolean selected;

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

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "RoleInfoVO{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", shortname='" + shortname + '\'' +
                ", selected=" + selected +
                '}';
    }
}
