package com.qf.service;

import com.qf.dto.SearchUserInfoDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;

import java.util.List;

/**
 * Created by DELL on 2019/7/29.
 */
public interface UserInfoService {
    /**
     * 获取所有用户信息
     */
    public List<UserInfo> listAll();

    /**
     * 执行UserInfo表的删除操作并根据返回值判定结果
     * @param id 要删除的用户id
     * @return 是否删除成功
     */
    public boolean deleteUserById(int id);

    public UserInfo loginCheck(UserInfo userInfo);

    /**
     * 用户注册
     * @param userInfo
     * @return
     */
    public boolean register(UserInfo userInfo);

    /**
     * 获取所有用户信息
     * @return 所有用户信息
     */
    public List<UserInfo> getAllUserInfo(SearchUserInfoDTO searchUserInfoDTO);

    public boolean removeUserInfoById(int id);

    public UserInfo getUserInfoById(int id);


    public boolean editUserInfoById(UserInfo userInfo);
    public List<MenuInfo> userLoginInit(UserInfo userInfo);
}
