package com.example.www.module.basic.service.impl;

import com.example.www.module.basic.mapper.UserMapper;
import com.example.www.module.basic.model.dto.LoginParam;
import com.example.www.module.basic.model.po.User;
import com.example.www.module.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mushan
 * @date 2/10/2022
 * @apiNote
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        LoginParam param = new LoginParam(username, password);
        return userMapper.getUserByUsernameAndPassword(param);
    }
}
