package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.Idcard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author mushan
 * @date 3/10/2022
 * @apiNote
 */
@SpringBootTest
public class IdcardMapperTest {
    @Autowired
    IdcardMapper idcardMapper;
    @Test
    void selectCodeById(){
        Idcard idcard = idcardMapper.selectCodeById(1L);
        System.out.println(idcard);
    }
}
