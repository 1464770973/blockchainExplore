package io.hzg.demo1.service;

import io.hzg.demo1.po.Block;

import java.util.List;

public interface BlockService {
    List<Block> selectRecent();
}
