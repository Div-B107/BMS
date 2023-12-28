package com.div.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bank_name", nullable = false, unique = true)
    private String bankName;

    @Column(name = "bank_address", nullable = false)
    private String bankAddress;

    @Column(name = "active_balance")
    private double activeBalance;

    @Column(name = "total_profit")
    private double totalProfit;

    public Bank(String bankName, String bankAddress, double activeBalance, double totalProfit) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.activeBalance = activeBalance;
        this.totalProfit = totalProfit;
    }

    public Bank() {

    }
}
