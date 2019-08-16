package com.qf.controller;

import com.qf.dto.UserRoleDTO;
import com.qf.service.MenuInfoService;
import com.qf.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 2019/8/1.
 */
@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService roleInfoService;
    MenuInfoService menuInfoService;

    @RequestMapping("listRoleInfoByUserId")
    public Object listRoleInfoByUserId(@RequestParam int userId){
        return roleInfoService.listRoleByUserId(userId);
    }


    @RequestMapping("insertUserRole")
    public Object insertUserRole(@RequestBody UserRoleDTO userRoleDTO){
        System.out.println(userRoleDTO);
        return roleInfoService.addUserRole(userRoleDTO);
    }

    @RequestMapping("removeUserRole")
    public Object removeUserRole(@RequestBody UserRoleDTO userRoleDTO){
        System.out.println(userRoleDTO);
        return roleInfoService.removeUserRole(userRoleDTO);
    }

    //根据roleid做获取一个集合，其中包含所有的菜单及被选择的菜单
    @RequestMapping("listMenuByRoleId")
    public Object listMenuByRoleId(@RequestParam int roleId){
        return this.menuInfoService.listMenuByRoleId(roleId);
    }
}
