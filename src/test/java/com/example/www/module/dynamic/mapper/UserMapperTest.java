package com.example.www.module.dynamic.mapper;

import com.example.www.module.dynamic.model.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mushan
 * @date 9/10/2022
 * @apiNote
 */
@SpringBootTest
public class UserMapperTest {
    @Autowired
    @Qualifier("DynamicUserMapper")
    UserMapper userMapper;

    @Test
    void selectUserByIf(){
        User user = new User();
        user.setUsername("sh");
        user.setNickname("杉");
        userMapper.selectUserByIf(user);
    }
    @Test
    void selectUserByChoose(){
        User user = new User();
        user.setUsername("sh");
        user.setNickname("杉");
        userMapper.selectUserByChoose(user);
    }

    @Test
    void selectUserByTrim(){
        User user = new User();
        user.setUsername("sh");
        user.setNickname("杉");
        userMapper.selectUserByTrim(user);
    }
    @Test
    void selectUserByWhere(){
        User user = new User();
        user.setUsername("sh");
        user.setNickname("杉");
        userMapper.selectUserByWhere(user);
    }

    @Test
    void updateUserBySet(){
        User user = new User();
        user.setId(3L);
        user.setEmail("hao666@qq.com");
        userMapper.updateUserBySet(user);
    }

    @Test
    void selectUserByForEach(){
        List<Long> list = new ArrayList<>();
        for(long i = 1L; i <= 3L; i++){
            list.add(i);
        }
        List<User> users = userMapper.selectUserByForEach(list);
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    void selectUserByBind(){
        User user = new User();
        user.setUsername("sh");
        userMapper.selectUserByBind(user);
    }
}
