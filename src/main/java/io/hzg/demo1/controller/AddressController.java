package io.hzg.demo1.controller;

import io.hzg.demo1.dto.AddressInfo;
import io.hzg.demo1.dto.TransactionInBlockDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @GetMapping("/getAddressInfo")
    public AddressInfo getAddressInfo(@RequestParam String address){
        return  null;
    }
    @GetMapping("/getAddressTransactions")
    public List<TransactionInBlockDTO> getAddressTransactions(@RequestParam String address,@RequestParam(required = false,defaultValue = "1") Integer pageNum){
        return  null;
    }
}
