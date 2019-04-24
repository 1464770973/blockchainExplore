package io.hzg.demo1.controller;

import io.hzg.demo1.dto.BlockDetailDTO;
import io.hzg.demo1.dto.BlockListDTO;
import io.hzg.demo1.po.Block;
import io.hzg.demo1.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/block")
@CrossOrigin
public class BlockController {
@Autowired
private BlockService blockService;

    @GetMapping("/getRecentBlocks")
    public List<BlockListDTO> getRecentBlocks(){
        List<Block> blocks = blockService.selectRecent();
        List<BlockListDTO> blockListDTOS = blocks.stream().map(block -> {
            BlockListDTO blockListDTO = new BlockListDTO();
            blockListDTO.setHeight(block.getHeight());
            blockListDTO.setTime(block.getTime().getTime());
            blockListDTO.setTxSize(block.getTxSize());
            blockListDTO.setSizeOnDisk(block.getSizeOnDisk());
            return blockListDTO;

        }).collect(Collectors.toList());
        return blockListDTOS;


    }
    @GetMapping("/getRecentBlocksById")
    public List<BlockListDTO> getRecentBlocksById(@RequestParam Integer blockchainId){
        return  null;
    }
    @GetMapping("/getRecentBlocksByNameType")
    public List<BlockListDTO> getRecentBlocksByNameType(@RequestParam String name,@RequestParam String type){
        return  null;
    }
    @GetMapping("/getBlockDetailByHash")
    public BlockDetailDTO getBlockDetailByHash(@RequestParam String blockhash){
        return  null;
    }
    @GetMapping("/getBlockDetailByHeight")
    public List<BlockDetailDTO> getBlockDetailByHeight(@RequestParam Integer blockheight){
        List<Block> blocks = blockService.selectBlockByHeight(blockheight);
        List<BlockDetailDTO> blockDetailDTOS = blocks.stream().map(block -> {
            BlockDetailDTO blockDetailDTO = new BlockDetailDTO();
            blockDetailDTO.setBlockhash(block.getBlockhash());
            blockDetailDTO.setDifficulty(block.getDifficulty());
            blockDetailDTO.setHeight(block.getHeight());
            blockDetailDTO.setMerkleRoot(block.getMerkleRoot());
            blockDetailDTO.setNextBlockhash(block.getNextBlockhash());
            blockDetailDTO.setOutputTotal(block.getOutputTotal());
            blockDetailDTO.setPrevBlockhash(block.getPrevBlockhash());
            blockDetailDTO.setSizeOnDisk(block.getSizeOnDisk());
            blockDetailDTO.setTime(block.getTime());
            blockDetailDTO.setTransactionFees(block.getTransactionFees());

            return blockDetailDTO;
        }).collect(Collectors.toList());


        return  blockDetailDTOS;
    }

}
