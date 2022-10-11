package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author mushan
 * @date 6/10/2022
 * @apiNote
 */
@SpringBootTest
public class OrdersMapperTest {
    @Autowired
    OrdersMapper ordersMapper;

    @Test
    void selectOrdersByUserId(){
        List<Orders> orders = ordersMapper.selectOrdersByUserId(1L);
        System.out.println(orders);
    }
}
