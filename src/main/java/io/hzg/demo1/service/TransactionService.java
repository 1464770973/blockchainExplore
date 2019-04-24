package io.hzg.demo1.service;

import io.hzg.demo1.po.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> selectTransaction();
}
