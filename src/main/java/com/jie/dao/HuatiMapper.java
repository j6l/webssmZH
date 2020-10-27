package com.jie.dao;

import com.jie.entity.Huati;
import com.jie.entity.HuatiExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface HuatiMapper {
    long countByExample(HuatiExample example);

    int deleteByExample(HuatiExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Huati record);

    int insertSelective(Huati record);

    List<Huati> selectByExample(HuatiExample example);

    Huati selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") Huati record, @Param("example") HuatiExample example);

    int updateByExample(@Param("record") Huati record, @Param("example") HuatiExample example);

    int updateByPrimaryKeySelective(Huati record);

    int updateByPrimaryKey(Huati record);
}