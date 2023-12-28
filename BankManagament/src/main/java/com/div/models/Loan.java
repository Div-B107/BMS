package com.div.models;

import com.div.properties.LoanPayment;
import com.div.properties.LoanTypes;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @Positive(message = "Loan Amount should be positive!")
    @NotNull(message = "Loan Amount can not be null!")
    @Min(value = 1000, message = "Loan Amount must be greater than 1000")
    @Max(value = 30000, message = "Loan Amount shouldn't be greater than 30000")
    private double loanAmount;

    @Column(name = "loan_percent")
    @Positive(message = "Loan Percent should be positive!")
    @NotNull(message = "Loan Percent can not be null!")
    @Min(value = 10, message = "Loan Percent must be greater than 10%")
    @Max(value = 25, message = "Loan Percent shouldn't be greater than 25%")
    private double loanPercent;

    @Column(name = "payment_per_month")
    @Positive(message = "Payment Per Month should be positive!")
    @NotNull(message = "Payment Per Month can not be null!")
    private double paymentPerMonth;

    @ManyToOne
    private User user;
    @ManyToOne
    private LoanTypes loanTypes;
    @OneToOne
    private LoanPayment loanPayment;
}
