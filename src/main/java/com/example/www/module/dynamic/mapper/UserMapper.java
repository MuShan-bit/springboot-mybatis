package com.example.www.module.dynamic.mapper;

import com.example.www.module.dynamic.model.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mushan
 * @date 9/10/2022
 * @apiNote
 */
@Mapper
@Repository("DynamicUserMapper")
public interface UserMapper {
    List<User>selectUserByIf(User user);
    List<User>selectUserByChoose(User user);
    List<User>selectUserByTrim(User user);
    List<User>selectUserByWhere(User user);
    int updateUserBySet(User user);
    List<User>selectUserByForEach(List<Long>listId);
    List<User>selectUserByBind(User user);
}
