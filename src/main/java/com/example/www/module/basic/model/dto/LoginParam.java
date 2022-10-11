package com.example.www.module.basic.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author mushan
 * @date 2/10/2022
 * @apiNote
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginParam implements Serializable {
    String username;
    String password;
}
