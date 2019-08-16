package com.qf.dao;

import com.qf.dto.SearchUserInfoDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;

import java.util.List;

/**
 * Created by DELL on 2019/7/24.
 */
public interface UserInfoMapper {

    public List<MenuInfo> userLoginInit(UserInfo userInfo);

    public List<UserInfo> listAll(SearchUserInfoDTO searchUserInfoDTO);

    public int deleteUserById(int id);

    public UserInfo loginCheck(UserInfo userInfo);

    public int register(UserInfo userInfo);

    public List<UserInfo> getAllUserInfo();

    public int removeUserInfoById(int id);

    public UserInfo getUserInfoById(int id);

    public int editUserInfoById(UserInfo userInfo);
}
