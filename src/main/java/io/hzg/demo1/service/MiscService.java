package io.hzg.demo1.service;

public interface MiscService {
    void importFromHeight(Integer blockHeight, Boolean isClean);

    void importFromHash(String blockHash, Boolean isClean);
}
