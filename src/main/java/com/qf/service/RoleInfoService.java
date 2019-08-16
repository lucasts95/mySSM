package com.qf.service;

import com.qf.dto.UserRoleDTO;
import com.qf.vo.RoleInfoVO;

import java.util.List;

/**
 * Created by DELL on 2019/8/1.
 */
public interface RoleInfoService {


    public List<RoleInfoVO> listRoleByUserId(int userId);

    public boolean addUserRole(UserRoleDTO userRoleDTO);

    public boolean removeUserRole(UserRoleDTO userRoleDTO);
}
