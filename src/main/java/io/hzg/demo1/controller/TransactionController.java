package io.hzg.demo1.controller;

import io.hzg.demo1.dto.TransactionInfoDTO;
import io.hzg.demo1.dto.TransactionListDTO;
import io.hzg.demo1.po.Transaction;
import io.hzg.demo1.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @GetMapping("/getRecentTransactionsById")
    public List<TransactionListDTO> getRecentTransactionsById(@RequestParam Integer blockchainId){
        return null;
    }
    @GetMapping("/getRecentTransactionsByNameType")
    public List<TransactionListDTO> getRecentTransactionsByNameType(@RequestParam String name,@RequestParam String type){
        return  null;
    }
    @GetMapping("/getTransactionInfoByTxid")
    public TransactionInfoDTO getTransactionInfoByTxid(@RequestParam String txid){
        return null;

    }
    @GetMapping("/getTransactionInfoByTxhash")
    public TransactionInfoDTO getTransactionInfoByTxhash(@RequestParam String txhash){
        return  null;
    }
    @GetMapping("/getTransaction")
    public List<TransactionListDTO> getTransaction(){
        List<Transaction> transactions = transactionService.selectTransaction();
        List<TransactionListDTO> transactionListDTOS = transactions.stream().map(transaction -> {
            TransactionListDTO transactionListDTO = new TransactionListDTO();
            transactionListDTO.setTxhash(transaction.getTxhash());
            transactionListDTO.setTxid(transaction.getTxid());
            transactionListDTO.setTime(transaction.getTime());
            transactionListDTO.setAmount(0.2);
            transactionListDTO.setSnum(0.3);
            return  transactionListDTO;


        }).collect(Collectors.toList());
        return transactionListDTOS;
    }
    @GetMapping("/getTransctionByTxhash")
    public List<TransactionInfoDTO> getTransctionByTxhash(String txhash){
        List<Transaction> transactions = transactionService.selectTransactionByTxhash(txhash);
        List<TransactionInfoDTO> transactionInfoDTOS = transactions.stream().map(transaction -> {
            TransactionInfoDTO transactionInfoDTO = new TransactionInfoDTO();
            transactionInfoDTO.setTxid(transaction.getTxid());
            transactionInfoDTO.setTxhash(transaction.getTxhash());
            transactionInfoDTO.setFees(transaction.getFees());
            transactionInfoDTO.setSize(transaction.getSize());
            transactionInfoDTO.setTotalInput(transaction.getTotalInput());
            transactionInfoDTO.setTime(transaction.getTime());
            transactionInfoDTO.setTotalOutput(transaction.getTotalOutput());
            transactionInfoDTO.setWeight(transaction.getWeight());
            return  transactionInfoDTO;


        }).collect(Collectors.toList());
        return  transactionInfoDTOS;
    }


}
