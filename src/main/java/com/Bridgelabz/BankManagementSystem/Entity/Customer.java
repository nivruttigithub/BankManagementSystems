package com.Bridgelabz.BankManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
    @Id
    private int cusId;
    private String cusName;
    private String cusAddress;
    private String cusEmail;
    private long cusMobNo;

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public long getCusMobNo() {
        return cusMobNo;
    }

    public void setCusMobNo(long cusMobNo) {
        this.cusMobNo = cusMobNo;
    }
}
