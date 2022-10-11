package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.User;
import com.example.www.module.cascade.model.pojo.SelectUserOrdersById;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author mushan
 * @date 6/10/2022
 * @apiNote
 */
@SpringBootTest
public class UserMapperTest {
    @Autowired
    @Qualifier("CascadeUserMapper")
    UserMapper userMapper;

    @Test
    void selectUserOrdersById1(){
        User user = userMapper.selectUserOrdersById1(1L);
        System.out.println(user);
    }

    @Test
    void selectUserOrdersById2(){
        User user = userMapper.selectUserOrdersById2(1L);
        System.out.println(user);
    }

    @Test
    void selectUserOrderById3(){
        List<SelectUserOrdersById> selectUserOrdersByIds = userMapper.selectUserOrderById3(1L);
        System.out.println(selectUserOrdersByIds);
    }
}
