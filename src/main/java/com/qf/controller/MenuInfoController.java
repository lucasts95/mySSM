package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.ModifyRoleMenuDTO;
import com.qf.service.MenuInfoService;
import com.qf.vo.MenuListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DELL on 2019/8/2.
 */
@RestController
@RequestMapping("/menuinfo")
public class MenuInfoController {

    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("/listMenuByRoleId")
    public Object listMenuByRoleId(@RequestParam int roleId){
        return menuInfoService.listMenuByRoleId(roleId);
    }

    @RequestMapping("/modifyRoleMenu")
    public Object modifyRoleMenu(@RequestBody ModifyRoleMenuDTO modifyRoleMenuDTO){
        System.out.println(modifyRoleMenuDTO);

        return menuInfoService.updateRoleMenu(modifyRoleMenuDTO);
//        return menuInfoService.listMenuByRoleId(roleId);
    }

    @RequestMapping("listAllMenu")
    public Object listAllMenu(@RequestParam(defaultValue="1",required=true,value="pageNum") Integer pageNum){
        //一页有多少条
        int defaultPageSize=4;
        //初始化pageHelper对象
        PageHelper.startPage(pageNum,defaultPageSize);
        List<MenuListVO> menuListVOS = menuInfoService.listAllMenu();
        PageInfo<MenuListVO> menuListVOPageInfo = new PageInfo<MenuListVO>(menuListVOS);
        return menuListVOPageInfo;

    }
}
