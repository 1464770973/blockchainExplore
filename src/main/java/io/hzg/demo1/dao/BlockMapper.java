package io.hzg.demo1.dao;

import io.hzg.demo1.po.Block;
import org.apache.ibatis.annotations.Mapper;


public interface BlockMapper {
    int deleteByPrimaryKey(String blockhash);

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockhash);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);
    int truncate();

}