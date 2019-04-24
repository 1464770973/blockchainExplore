package io.hzg.demo1.dao;

import io.hzg.demo1.po.TransactionDetail;
import io.hzg.demo1.po.TransactionDetailKey;

public interface TransactionDetailMapper {
    int deleteByPrimaryKey(TransactionDetailKey key);

    int insert(TransactionDetail record);

    int insertSelective(TransactionDetail record);

    TransactionDetail selectByPrimaryKey(TransactionDetailKey key);

    int updateByPrimaryKeySelective(TransactionDetail record);

    int updateByPrimaryKey(TransactionDetail record);
    int truncate();
}