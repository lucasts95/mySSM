package com.qf.dao;

import com.qf.dto.UserRoleDTO;
import com.qf.pojo.RoleInfo;
import com.qf.vo.RoleInfoVO;

import java.util.List;

/**
 * Created by DELL on 2019/7/24.
 */
public interface RoleInfoMapper {
    public RoleInfo selectRoleInfoById(int id);

    public List<RoleInfoVO> listRoleByUserId(int userId);

    public int addUserRole(UserRoleDTO userRoleDTO);

    public int removeUserRole(UserRoleDTO userRoleDTO);
}
