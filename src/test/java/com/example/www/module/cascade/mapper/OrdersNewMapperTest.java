package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.OrdersNew;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author mushan
 * @date 9/10/2022
 * @apiNote
 */
@SpringBootTest
public class OrdersNewMapperTest {
    @Autowired
    OrdersNewMapper ordersNewMapper;

    @Test
    void selectAllOrdersAndProduct(){
        List<OrdersNew> ordersNews = ordersNewMapper.selectAllOrdersAndProduct();
        for (OrdersNew ordersNew : ordersNews){
            System.out.println(ordersNew);
        }
    }
}
