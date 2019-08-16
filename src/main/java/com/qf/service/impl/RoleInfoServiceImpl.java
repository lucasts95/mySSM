package com.qf.service.impl;

import com.qf.dao.RoleInfoMapper;
import com.qf.dto.UserRoleDTO;
import com.qf.service.RoleInfoService;
import com.qf.vo.RoleInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DELL on 2019/8/1.
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService{

    @Autowired
    RoleInfoMapper roleInfoMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<RoleInfoVO> listRoleByUserId(int userId) {
        return roleInfoMapper.listRoleByUserId(userId);
    }

    @Transactional
    public boolean addUserRole(UserRoleDTO userRoleDTO) {
        return roleInfoMapper.addUserRole(userRoleDTO)>0;
    }
    @Transactional
    public boolean removeUserRole(UserRoleDTO userRoleDTO) {
        return roleInfoMapper.removeUserRole(userRoleDTO)>0;
    }
}
