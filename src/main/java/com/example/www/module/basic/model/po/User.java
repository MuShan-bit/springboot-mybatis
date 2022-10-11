package com.example.www.module.basic.model.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author mushan
 * @date 1/10/2022
 * @apiNote
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    Long id;
    String username;
    String password;
    String nickname;
    String email;
    LocalDateTime gmtCreate;
}
