package com.example.demo.service.impl;

import com.example.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/11/13.
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    public Manager getManager(String id){
        Manager manager = managerMapper.selectByPrimaryKey(id);
        return manager;
    }
}
