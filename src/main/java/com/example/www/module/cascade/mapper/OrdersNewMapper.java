package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.OrdersNew;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author mushan
 * @date 9/10/2022
 * @apiNote
 */
@Mapper
public interface OrdersNewMapper {
    List<OrdersNew> selectAllOrdersAndProduct();
}
