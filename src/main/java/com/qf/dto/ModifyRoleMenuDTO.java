package com.qf.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by DELL on 2019/8/2.
 */
@Data
public class ModifyRoleMenuDTO {
    int roleId;
    List<Integer> menuIds;


}
