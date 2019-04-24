package io.hzg.demo1.dao;

import io.hzg.demo1.po.Block;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BlockMapper {
    int deleteByPrimaryKey(String blockhash);

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockhash);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);
    int truncate();
    List<Block> selectRecent();
    List<Block> selectBlockByHeight(@Param("blockheight") Integer blockheight);


}