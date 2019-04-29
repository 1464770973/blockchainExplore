package io.hzg.demo1.controller;

import io.hzg.demo1.dto.BlockListDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlockControllerTest {
    @Autowired
    private BlockController blockController;
    @Test
    public void getRecentBlocks(){
        List<BlockListDTO> recentBlocks = blockController.getRecentBlocks();
        assertEquals(5,recentBlocks.size());

    }
}
