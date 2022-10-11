package com.example.www.module.cascade.model.pojo;

import com.example.www.module.cascade.model.po.Idcard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author mushan
 * @date 3/10/2022
 * @apiNote
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelectPersonById {
    private Long id;
    private String name;
    private Integer age;
    private String code;
}
