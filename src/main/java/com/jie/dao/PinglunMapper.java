package com.jie.dao;

import com.jie.entity.Pinglun;
import com.jie.entity.PinglunExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PinglunMapper {
    long countByExample(PinglunExample example);

    int deleteByExample(PinglunExample example);

    int deleteByPrimaryKey(Integer intl);

    int insert(Pinglun record);

    int insertSelective(Pinglun record);

    List<Pinglun> selectByExample(PinglunExample example);

    Pinglun selectByPrimaryKey(Integer intl);

    int updateByExampleSelective(@Param("record") Pinglun record, @Param("example") PinglunExample example);

    int updateByExample(@Param("record") Pinglun record, @Param("example") PinglunExample example);

    int updateByPrimaryKeySelective(Pinglun record);

    int updateByPrimaryKey(Pinglun record);
}