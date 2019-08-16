package com.qf.service.impl;

import com.qf.dao.MenuInfoMapper;
import com.qf.dto.ModifyRoleMenuDTO;
import com.qf.pojo.RoleMenu;
import com.qf.service.MenuInfoService;
import com.qf.vo.MenuInfoVO;
import com.qf.vo.MenuListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by DELL on 2019/8/2.
 */
@Service
public class MenuInfoServiceImpl implements MenuInfoService {

    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<MenuInfoVO> listMenuByRoleId(int roleId) {
        return menuInfoMapper.listMenuByRoleId(roleId);
    }

    @Transactional
    public boolean updateRoleMenu(ModifyRoleMenuDTO modifyRoleMenuDTO) {
        boolean flag = false;
        //1将数据库中存在但modifyRoleMenuDTO.menuIds中不存在的数据删除(1)
        int count1 = menuInfoMapper.removeRoleMenuByMenuId(modifyRoleMenuDTO);
        //2从数据库中查询出所有经过删除以后roleid为modifyRoleMenuDTO.roleId的数据信息(2)
        List<RoleMenu> roleMenus = menuInfoMapper.listRoleMenuByRoleId(modifyRoleMenuDTO);
        System.out.println("原集合为"+modifyRoleMenuDTO.getMenuIds());
        System.out.println("数据库集合为"+roleMenus);
        if(roleMenus.size()==0){
            return true;
        }
        HashMap<Integer,Integer> params = new HashMap<Integer, Integer>();

        //3匹配menuIds中和数据库中查询出的信息，得到差集
        for(int i=0;i<modifyRoleMenuDTO.getMenuIds().size();i++){
            params.put(modifyRoleMenuDTO.getMenuIds().get(i),modifyRoleMenuDTO.getRoleId());
        }
        //删除完成以后，数据就能确定得到差集
        for(int i=0;i<roleMenus.size();i++){
            params.remove(roleMenus.get(i).getMid());
        }

        List<Integer> menuIds = new ArrayList<Integer>(params.keySet());
        if(menuIds==null||menuIds.size()==0){
            return false;
        }
        modifyRoleMenuDTO.setMenuIds(menuIds);
        System.out.println("差值集合为"+modifyRoleMenuDTO.getMenuIds());
        //4将差集中的数据保存到数据库(3)
        int count2 = menuInfoMapper.addRoleMenuByRoleId(modifyRoleMenuDTO);
        //5.统一提交
        if(count1>0||count2>0){
            flag = true;
        }
        return flag;
    }

    public List<MenuListVO> listAllMenu() {
        return this.menuInfoMapper.listAllMenu();
    }
}
