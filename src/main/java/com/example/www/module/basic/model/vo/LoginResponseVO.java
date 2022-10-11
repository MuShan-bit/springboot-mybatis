package com.example.www.module.basic.model.vo;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author mushan
 * @date 2/10/2022
 * @apiNote
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseVO implements Serializable {
    String username;
    String nickname;
    String email;
    LocalDateTime gmtCreate;
}
