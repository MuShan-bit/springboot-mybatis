package com.example.www.module.basic.service;

import com.example.www.module.basic.model.po.User;
import org.springframework.stereotype.Service;

/**
 * @author mushan
 * @date 2/10/2022
 * @apiNote
 */

public interface UserService {
    User login(String username, String password);
}
