package com.example.demo.dao;

import com.example.demo.entity.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(String sysid);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(String sysid);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}