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
        public void test(){
            JSONObject chainInfo = bitcoinApi.getChainInfo();
        String txhash = "21c6f7de3fb8ad3e5e034b85b9ac80cdc51214bcbe5ebfed9267dd8a19e239ea";
        JSONObject transaction = bitcoinApi.getTransaction(txhash);
        String blockhash = "000000000000004b1aecd12119a19e38efdce8c385f89a5d3a7698427108a2ee";
        JSONObject block = bitcoinApi.getBlock(blockhash);
        JSONObject noTxBlock = bitcoinApi.getNoTxBlock(blockhash);
        String blockhash2 = "00000000000000a727d074e9d1cc0a225540eb40693d6aa15d702b0bd96d378b";
        JSONArray blockHeaders = bitcoinApi.getBlockHeaders(10, blockhash2);
        JSONObject mempoolInfo = bitcoinApi.getMempoolInfo();
        JSONObject mempoolContents = bitcoinApi.getMempoolContents();



        }
}