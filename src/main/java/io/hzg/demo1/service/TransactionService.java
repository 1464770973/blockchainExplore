package io.hzg.demo1.service;

import io.hzg.demo1.po.Transaction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransactionService {
    List<Transaction> selectTransaction();
    List<Transaction> selectTransactionByTxhash( String txhash);
}
