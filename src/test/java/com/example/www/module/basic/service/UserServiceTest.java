package com.example.www.module.basic.service;

import com.example.www.module.basic.model.po.User;
import com.example.www.module.basic.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author mushan
 * @date 2/10/2022
 * @apiNote
 */
@SpringBootTest
@Slf4j
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void login(){
        User user = userService.login("mushan", "mushan");
        if(user == null){
            log.info("登录失败！用户名或密码错误");
        }else {
            log.info("登录成功，昵称为：" + user.getNickname());
        }
    }
}
