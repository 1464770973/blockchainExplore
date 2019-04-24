package io.hzg.demo1.service.impl;

import io.hzg.demo1.dao.BlockMapper;
import io.hzg.demo1.po.Block;
import io.hzg.demo1.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlockServiceImpl implements BlockService {
    @Autowired
    private BlockMapper blockMapper;
    @Override
    public List<Block> selectRecent() {
        List<Block> blocks = blockMapper.selectRecent();
        return  blocks;


    }

    @Override
    public List<Block> selectBlockByHeight(Integer blockheight) {
        List<Block> blocks = blockMapper.selectBlockByHeight(blockheight);
        return blocks;
    }
}
