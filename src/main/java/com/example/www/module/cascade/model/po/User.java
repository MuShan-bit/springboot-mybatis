package com.example.www.module.cascade.model.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author mushan
 * @date 1/10/2022
 * @apiNote
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private LocalDateTime gmtCreate;
    private List<Orders> ordersList;
}
