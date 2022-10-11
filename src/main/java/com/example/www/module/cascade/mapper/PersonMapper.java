package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.Person;
import com.example.www.module.cascade.model.pojo.SelectPersonById;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author mushan
 * @date 3/10/2022
 * @apiNote
 */
@Mapper
public interface PersonMapper {
    /**
     * 通过id查询Person
     * @param id
     * @return
     */
    public Person selectPersonById1(Long id);

    /**
     * 通过id查询Person
     * @param id
     * @return
     */
    public Person selectPersonById2(Long id);

    /**
     * 通过id查询Person
     * @param id
     * @return
     */
    public SelectPersonById selectPersonById3(Long id);
}
