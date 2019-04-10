package org.yang.main.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yang.main.pojo.Menu;
@Mapper
public interface MenuMapper extends BaseMenuMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}