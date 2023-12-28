package com.div.properties;

import com.div.models.Loan;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "loan_payments", schema = "bank_management")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoanPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "left_amount")
    @NotNull(message = "Left Amount can not be null!")
    @Positive(message = "Left Amount must be positive!")
    private double leftAmount;

    @Column(name = "left_months")
    @Positive(message = "Left Months must be positive!")
    @NotNull(message = "Left Months can not be null!")
    private double leftMonths;
    @OneToOne
    private Loan loan;

}
