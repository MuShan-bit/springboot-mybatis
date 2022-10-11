package com.example.www.module.basic.mapper;

import com.example.www.module.basic.mapper.UserMapper;
import com.example.www.module.basic.model.po.User;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mushan
 * @date 1/10/2022
 * @apiNote
 */
@SpringBootTest
public class UserMapperTest {
    @Autowired
    @Qualifier("BasicUserMapper")
    UserMapper userMapper;

    @Test
    public void getUserById(){
        User user = userMapper.getUserById(1L);
        System.out.println(user);
    }

    @Test
    public void getUserByEmailAndUsername(){
        Map<String, Object> map = new HashMap<>();
        map.put("email", "2532379497@qq.com");
        map.put("username", "mushan");
        User user = userMapper.getUserByEmailAndUsername(map);
        System.out.println(user);
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setUsername("kdb");
        user.setPassword("kdb0927");
        user.setEmail("2532379497@qq.com");
        user.setNickname("Kong");
        user.setGmtCreate(LocalDateTime.now());
        userMapper.addUser(user);
        System.out.println("添加成功；id为：" + user.getId());
    }

    @Test
    public void deleteUserById(){
        Integer result = userMapper.deleteUserById(4L);
        System.out.println("生效数量：" + result);
    }
}
