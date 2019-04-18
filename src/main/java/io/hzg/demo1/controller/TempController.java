package io.hzg.demo1.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.hzg.demo1.api.BitcoinApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@EnableAutoConfiguration
public class TempController {
    @Autowired
    private BitcoinApi bitcoinApi;

    @GetMapping("/test")
    public void test() {
        JSONObject chainInfo = bitcoinApi.getChainInfo();
        String txhash = "61eb4df1752a10705d5ec6c4657b16e770810117bc56e9d991c31d7e088057ec";
        JSONObject transaction = bitcoinApi.getTransaction(txhash);
        String blockhash="00000000002ea370298e41313a72e801ca9af98590072e6f70f4c799256818ba";
        JSONObject block = bitcoinApi.getBlock(blockhash);



    }
}
