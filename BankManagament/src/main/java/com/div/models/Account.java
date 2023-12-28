package com.div.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Account")
@Table(name = "accounts" , schema ="bank")
@Getter
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "account_name",nullable = false)
    private String accountName;
    @Column(name = "iban_id",nullable = false)
    private String ibanId;
    private String swift;
    private double balance;
    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.MERGE})
    private User user;






}

