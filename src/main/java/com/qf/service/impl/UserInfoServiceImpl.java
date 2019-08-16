package com.qf.service.impl;

import com.qf.dao.UserInfoMapper;
import com.qf.dto.SearchUserInfoDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DELL on 2019/7/29.
 */
//声明这是一个服务，同时是一个组件
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    UserInfoMapper userInfoMapper;


    public List<UserInfo> listAll() {
        return null;
    }

    //对该方法执行事务处理，传播级别为REQUIRED
    @Transactional(propagation=Propagation.REQUIRED)
    public boolean deleteUserById(int id) {
        return userInfoMapper.deleteUserById(id)>0;
    }

    public UserInfo loginCheck(UserInfo userInfo) {
        UserInfo userInfo1 = userInfoMapper.loginCheck(userInfo);
        return userInfo1;
    }

    public boolean register(UserInfo userInfo) {
        int register = userInfoMapper.register(userInfo);
        return register>0;
    }

    public List<UserInfo> getAllUserInfo(SearchUserInfoDTO searchUserInfoDTO) {

        return userInfoMapper.listAll(searchUserInfoDTO);
    }


    /**
     * 获取所有用户信息
     * @return 所有用户信息
     */
    public List<UserInfo> getAllUserInfo() {
        return this.userInfoMapper.getAllUserInfo();
    }

    public boolean removeUserInfoById(int id) {
        return this.userInfoMapper.removeUserInfoById(id)>0;
    }

    public UserInfo getUserInfoById(int id) {
        return this.userInfoMapper.getUserInfoById(id);
    }

    public boolean editUserInfoById(UserInfo userInfo) {

        return this.userInfoMapper.editUserInfoById(userInfo)>0;
    }

    public List<MenuInfo> userLoginInit(UserInfo userInfo) {
        return this.userInfoMapper.userLoginInit(userInfo);
    }
}