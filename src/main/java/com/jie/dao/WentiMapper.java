package com.jie.dao;

import com.jie.entity.Wenti;
import com.jie.entity.WentiExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface WentiMapper {
    long countByExample(WentiExample example);

    int deleteByExample(WentiExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Wenti record);

    int insertSelective(Wenti record);

    List<Wenti> selectByExample(WentiExample example);

    Wenti selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") Wenti record, @Param("example") WentiExample example);

    int updateByExample(@Param("record") Wenti record, @Param("example") WentiExample example);

    int updateByPrimaryKeySelective(Wenti record);

    int updateByPrimaryKey(Wenti record);
}