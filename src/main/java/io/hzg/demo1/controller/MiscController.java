package io.hzg.demo1.controller;

import io.hzg.demo1.dto.ImportStateDTO;
import io.hzg.demo1.service.MiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/misc")
public class MiscController {
    @Autowired
    private MiscService miscService;
    @GetMapping("/search")
    public Object search(@RequestParam String keyword){
        return null;
    }

    @GetMapping("/importFromHeight")
    public void importFromHeight(@RequestParam Integer blockHeight, Boolean isClean){
        miscService.importFromHeight(blockHeight, isClean);
    }

    @GetMapping("/importFromHash")
    public void importFromHash(@RequestParam String blockhash, Boolean isClean){
        miscService.importFromHash(blockhash, isClean);
    }

    @GetMapping("/getImportState")
    public ImportStateDTO getImportState(){
        return null;
    }
}
