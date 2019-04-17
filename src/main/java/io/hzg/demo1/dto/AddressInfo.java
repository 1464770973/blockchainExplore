package io.hzg.demo1.dto;

public class AddressInfo {
    private String address;
    private String hash160;
    private Integer txsize;
    private Double receiveAmount;
    private Double finalBalance;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHash160() {
        return hash160;
    }

    public void setHash160(String hash160) {
        this.hash160 = hash160;
    }

    public Integer getTxsize() {
        return txsize;
    }

    public void setTxsize(Integer txsize) {
        this.txsize = txsize;
    }

    public Double getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(Double receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public Double getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(Double finalBalance) {
        this.finalBalance = finalBalance;
    }
}
