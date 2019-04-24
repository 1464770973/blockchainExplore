package io.hzg.demo1.service.impl;

import io.hzg.demo1.dao.TransactionMapper;
import io.hzg.demo1.po.Transaction;
import io.hzg.demo1.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionMapper transactionMapper;
    @Override
    public List<Transaction> selectTransaction() {
        List<Transaction> transactions = transactionMapper.selectTransaction();
        return transactions;
    }
}
