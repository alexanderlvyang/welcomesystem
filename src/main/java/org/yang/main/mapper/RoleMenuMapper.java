package org.yang.main.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yang.main.pojo.RoleMenu;
@Mapper
public interface RoleMenuMapper extends BaseRoleMenuMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    RoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);
}