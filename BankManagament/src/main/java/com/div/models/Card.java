package com.div.models;

import com.div.enums.CardType;
import com.div.enums.ProcessingType;
import com.div.enums.ValuteType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Setter
@Getter
@ToString
@Builder
@Entity(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "card_number", nullable = false, unique = true, length = 16, updatable = false)
    private String cardNumber;

    @Column(name = "expire_date", nullable = false, updatable = false)
    private LocalDate expireDate;

    @Column(name = "ccv_number", nullable = false, updatable = false)
    private int ccv;

    @Column(name = "card_amount", nullable = false)
    private double amount;

    @Column(name = "card_type", nullable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    private CardType cardType;

    @Column(name = "processing_type", nullable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    private ProcessingType processingType;

    @Column(name = "valute_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private ValuteType valuteType;

    @Embedded
    RowTimeInfo rowTimeInfo;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "account_id", nullable = false)
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Account account;


    public Card(String cardNumber, LocalDate expireDate, int ccv, double amount,
                CardType cardType, ProcessingType processingType, ValuteType valuteType,
                RowTimeInfo rowTimeInfo, boolean isActive, Account account) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.ccv = ccv;
        this.amount = amount;
        this.cardType = cardType;
        this.processingType = processingType;
        this.valuteType = valuteType;
        this.rowTimeInfo = rowTimeInfo;
        this.isActive = isActive;
        this.account = account;
    }

    public Card() {

    }
}
