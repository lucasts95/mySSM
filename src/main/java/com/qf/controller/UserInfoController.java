package com.qf.controller;

import com.qf.dto.SearchUserInfoDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by DELL on 2019/7/30.
 */
//声明这个类是一个控制器,同时因为包含了@Component注解，这个类也是一个组件，能被spring扫描并加载到容器中
//RestController不但是一个控制器，还是一个符合restful风格的网络接口
@RestController
public class UserInfoController {

    //自动注入
    @Autowired
    UserInfoService userInfoService;

    //请求映射
    @RequestMapping("loginCheck")
    //该方法的返回值(无论类型),都以json字符串返回.
//    @ResponseBody
    //@RequestBody:声明一个对象，凡是请求过来参数的name和这个对象属性名相同的话，框架就进行封装
    //@RequestParam:声明这是一个请求的参数
    public Object loginCheck(@RequestBody UserInfo userInfo, HttpSession session) {
        System.out.println(userInfo);
        UserInfo userInfo1 = userInfoService.loginCheck(userInfo);
        if (userInfo1 != null) {
            session.setAttribute("userInfo", userInfo1);
            List<MenuInfo> menuInfoList = this.userInfoService.userLoginInit(userInfo);
            session.setAttribute("menuInfoList", menuInfoList);
        }
        return userInfo1 != null;
    }

    @RequestMapping("registerUserInfo")
//    @ResponseBody
    public Object registerUserInfo(@RequestBody UserInfo userInfo) {
        System.out.println(userInfo);
        boolean register = userInfoService.register(userInfo);
        return register;
    }

    @RequestMapping(value = "listAllUserInfo", method = RequestMethod.POST)
    public Object listAllUserInfo(@RequestBody SearchUserInfoDTO searchUserInfoDTO) {
        return this.userInfoService.getAllUserInfo(searchUserInfoDTO);
    }

    @RequestMapping("removeUserInfoById")
    public Object removeUserInfoById(@RequestParam int userid) {
        System.out.println("id=" + userid);
        return this.userInfoService.removeUserInfoById(userid);
    }

    @RequestMapping("getUserInfoById")
    public Object getUserInfoById(@RequestParam int userid) {
        System.out.println("id=" + userid);
        return this.userInfoService.getUserInfoById(userid);
    }

    @RequestMapping("editUserInfoById")
    public boolean editUserInfoById(@RequestBody UserInfo userInfo) {
        System.out.println(userInfo);
        return this.userInfoService.editUserInfoById(userInfo);
    }

    @RequestMapping("initMenuList")
    public Object initMenuList(@RequestBody(required = false) UserInfo userInfo, HttpSession session) {
        if (session.getAttribute("menuInfoList") == null) {
            if (userInfo != null) {
                return userInfoService.userLoginInit(userInfo);
            } else {
                return null;
            }
        } else {
            return session.getAttribute("menuInfoList");
        }
    }


}
