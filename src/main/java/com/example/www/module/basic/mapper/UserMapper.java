package com.example.www.module.basic.mapper;

import com.example.www.module.basic.model.dto.LoginParam;
import com.example.www.module.basic.model.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author mushan
 * @date 1/10/2022
 * @apiNote
 */
@Mapper
@Repository("BasicUserMapper")
public interface UserMapper {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 根据Email和Username查询用户
     * @param param
     * @return
     */
    User getUserByEmailAndUsername(Map<String, Object> param);

    /**
     * 根据Username和Password查询用户
     * @param param
     * @return
     */
    User getUserByUsernameAndPassword(LoginParam param);

    /**
     * 根据nickname模糊查询
     * @param nickname
     * @return
     */
    List<User> getUserListByLikeNickname(String nickname);

    /**
     * 添加User 用于测试主键自增回填
     * @param user
     * @return
     */
    Integer addUser(User user);

    /**
     * 删除用户通过id
     * @param id
     * @return
     */
    Integer deleteUserById(Long id);

    /**
     * 通过id更新用户密码
     * @param user
     * @return
     */
    Integer updateUserPasswordById(User user);
}
