package com.example.www.module.cascade.model.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author mushan
 * @date 9/10/2022
 * @apiNote
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrdersNew {
    private Long id;
    private String ordersn;
    private List<Product> products;
}
