package com.qf.service;

import com.qf.dto.ModifyRoleMenuDTO;
import com.qf.vo.MenuInfoVO;
import com.qf.vo.MenuListVO;

import java.util.List;

/**
 * Created by DELL on 2019/8/2.
 */
public interface MenuInfoService {

    public List<MenuInfoVO> listMenuByRoleId(int roleId);

    public boolean updateRoleMenu(ModifyRoleMenuDTO modifyRoleMenuDTO);
    public List<MenuListVO>listAllMenu();
}
