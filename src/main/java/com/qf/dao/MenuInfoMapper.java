package com.qf.dao;

import com.qf.dto.ModifyRoleMenuDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.RoleMenu;
import com.qf.vo.MenuInfoVO;
import com.qf.vo.MenuListVO;

import java.util.List;

/**
 * Created by DELL on 2019/7/24.
 */
public interface MenuInfoMapper {

    public List<MenuInfo> listParentMenu();

    public List<MenuInfoVO> listMenuByRoleId(int roleId);

    public int removeRoleMenuByMenuId(ModifyRoleMenuDTO modifyRoleMenuDTO);

    public List<RoleMenu> listRoleMenuByRoleId(ModifyRoleMenuDTO modifyRoleMenuDTO);

    public int addRoleMenuByRoleId(ModifyRoleMenuDTO modifyRoleMenuDTO);

    public List<MenuListVO>listAllMenu();
}
