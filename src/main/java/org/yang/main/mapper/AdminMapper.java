package org.yang.main.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yang.main.pojo.Admin;
@Mapper
public interface AdminMapper extends BaseAdminMapper {
    int deleteByPrimaryKey(String id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}