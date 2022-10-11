package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.Orders;
import com.example.www.module.cascade.model.po.User;
import com.example.www.module.cascade.model.pojo.SelectUserOrdersById;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mushan
 * @date 4/10/2022
 * @apiNote
 */
@Mapper
@Repository("CascadeUserMapper")
public interface UserMapper {
    public User selectUserOrdersById1(Long id);
    public User selectUserOrdersById2(Long id);
    public List<SelectUserOrdersById> selectUserOrderById3(Long id);
}