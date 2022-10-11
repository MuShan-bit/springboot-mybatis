package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.Person;
import com.example.www.module.cascade.model.pojo.SelectPersonById;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author mushan
 * @date 3/10/2022
 * @apiNote
 */
@SpringBootTest
public class PersonMapperTest {
    @Autowired
    PersonMapper personMapper;
    @Test
    void selectPersonById1(){
        Person person = personMapper.selectPersonById1(1L);
        System.out.println(person);
    }
    @Test
    void selectPersonById2(){
        Person person = personMapper.selectPersonById2(2L);
        System.out.println(person);
    }
    @Test
    void selectPersonById3(){
        SelectPersonById spi = personMapper.selectPersonById3(3L);
        System.out.println(spi);
    }
}
