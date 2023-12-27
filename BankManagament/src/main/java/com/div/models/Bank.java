package com.div.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "bank_name", nullable = false, unique = true)
    String bankName;

    @Column(name = "bank_address", nullable = false)
    String bankAddress;

    @Column(name = "active_balance")
    double activeBalance;

    @Column(name = "total_profit")
    double totalProfit;

    public Bank(String bankName, String bankAddress, double activeBalance, double totalProfit) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.activeBalance = activeBalance;
        this.totalProfit = totalProfit;
    }

    public Bank() {

    }
}
