package com.example.www.module.cascade.mapper;

import com.example.www.module.cascade.model.po.Idcard;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author mushan
 * @date 3/10/2022
 * @apiNote
 */
@Mapper
public interface IdcardMapper {
    /**
     * 通过id获取Idcard
     * @param id
     * @return
     */
    public Idcard selectCodeById(Long id);
}
