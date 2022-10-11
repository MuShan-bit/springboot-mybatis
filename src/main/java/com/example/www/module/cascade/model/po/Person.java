package com.example.www.module.cascade.model.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author mushan
 * @date 3/10/2022
 * @apiNote
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private Idcard idcard;
}