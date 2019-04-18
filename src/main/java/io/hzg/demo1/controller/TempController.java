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




        }
}
