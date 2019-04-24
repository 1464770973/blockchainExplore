package io.hzg.demo1.service;

import io.hzg.demo1.po.Block;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlockService {
    List<Block> selectRecent();
    List<Block> selectBlockByHeight(@Param("blockheight") Integer blockheight);
}
