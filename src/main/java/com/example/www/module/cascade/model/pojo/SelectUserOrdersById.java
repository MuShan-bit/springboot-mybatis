package com.example.www.module.cascade.model.pojo;

import com.example.www.module.cascade.model.po.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author mushan
 * @date 6/10/2022
 * @apiNote
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelectUserOrdersById {
    private Long userId;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private LocalDateTime gmtCreate;
    private Long ordersId;
    private String ordersn;
}
