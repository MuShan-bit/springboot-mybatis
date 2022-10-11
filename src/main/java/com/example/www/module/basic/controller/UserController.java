package com.example.www.module.basic.controller;

import com.example.www.module.basic.model.dto.LoginParam;
import com.example.www.module.basic.model.po.User;
import com.example.www.module.basic.model.vo.LoginResponseVO;
import com.example.www.module.basic.service.UserService;
import com.example.www.tools.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author mushan
 * @date 2/10/2022
 * @apiNote
 */
@RestController
@RequestMapping("/api/basic/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    R<LoginResponseVO> login(@RequestBody LoginParam param){
        try{
            User user = userService.login(param.getUsername(), param.getPassword());
            if(user == null){
                return R.success(null, "登录失败！用户名或密码错误", 200);
            }else{
                LoginResponseVO vo = new LoginResponseVO();
                vo.setEmail(user.getEmail());
                vo.setUsername(user.getUsername());
                vo.setNickname(user.getNickname());
                vo.setGmtCreate(user.getGmtCreate());
                return R.success(vo, "登录成功!", 200);
            }
        }catch (Exception e){
            return R.error();
        }
    }
}
