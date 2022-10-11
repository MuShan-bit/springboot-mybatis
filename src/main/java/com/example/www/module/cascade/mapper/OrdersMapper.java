package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.security.PrivateKey;
import java.util.List;

/**
 * @author mushan
 * @date 4/10/2022
 * @apiNote
 */
@Mapper
public interface OrdersMapper {
    List<Orders> selectOrdersByUserId(Long userId);
}
