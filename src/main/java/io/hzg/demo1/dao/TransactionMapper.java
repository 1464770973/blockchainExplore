package io.hzg.demo1.dao;

import io.hzg.demo1.po.Transaction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransactionMapper {
    int deleteByPrimaryKey(String txid);

    int insert(Transaction record);

    int insertSelective(Transaction record);

    Transaction selectByPrimaryKey(String txid);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);
    int truncate();
    List<Transaction> selectTransaction();
    List<Transaction> selectTransactionByTxhash(@Param("txhash") String txhash);
}