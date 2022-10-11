package com.example.www.module.basic.controller;

import com.example.www.module.basic.model.dto.LoginParam;
import com.example.www.module.basic.model.vo.LoginResponseVO;
import com.example.www.tools.R;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author mushan
 * @date 3/10/2022
 * @apiNote
 */
@SpringBootTest
public class UserControllerTest {
    @Autowired
    UserController userController;

    @Test
    void login(){
        LoginParam param = new LoginParam("mushan", "mushan");
        R<LoginResponseVO> login = userController.login(param);
        System.out.println(login);
    }
}
