package com.qf.vo;

import lombok.Data;

@Data
public class MenuListVO {
    int mid;
    String menuname;
    String menuicon;
    String menu_url;
    int parentid;
    boolean ParentMenu;

    public String getMenu_url(){
        return menu_url==null?"":menu_url;
    }
}
