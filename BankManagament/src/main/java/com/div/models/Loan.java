package com.div.models;

import com.div.properties.LoanPayment;
import com.div.properties.LoanTypes;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "loans", schema = "bank_management")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "loan_amount")
    private double loanAmount;
    @Column(name = "loan_percent")
    private int loanPercent;
    @Column(name = "payment_per_month")
    private double paymentPerMonth;
    @OneToOne
    private User user;
    @ManyToOne
    private LoanTypes loanTypes;
    @OneToOne
    private LoanPayment loanPayment;
}
