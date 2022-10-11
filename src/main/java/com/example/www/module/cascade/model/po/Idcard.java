package com.example.www.module.cascade.model.po;

import lombok.*;

import java.io.Serializable;

/**
 * @author mushan
 * @date 3/10/2022
 * @apiNote
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Idcard implements Serializable {
    private Long id;
    private String code;
}
