package com.qf.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2019/8/2.
 */
public class MenuInfoVO {
//    	"id": 1,
//                "pid": 0,
//                "seqno": 0,
//                "name": "系统权限菜单",
//                "url": null,
//                "icon": "fa fa-sitemap",
//                "open": true,
//                "checked": false,
//                "children"

    int id;
    int pid;
    int seqno;
    String name;
    String url;
    String icon;
    boolean open = true;
    boolean checked = true;
    List<MenuInfoVO> children = new ArrayList<MenuInfoVO>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void appendChild(MenuInfoVO menuInfoVO){
        this.children.add(menuInfoVO);
    }

    public List<MenuInfoVO> getChildren() {
        return children;
    }

    public void setChildren(List<MenuInfoVO> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "MenuInfoVO{" +
                "id=" + id +
                ", pid=" + pid +
                ", seqno=" + seqno +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                ", open=" + open +
                ", checked=" + checked +
                ", children=" + children +
                '}';
    }
}
