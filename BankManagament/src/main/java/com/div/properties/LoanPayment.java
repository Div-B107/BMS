package com.div.properties;

import com.div.models.Loan;
import jakarta.persistence.*;
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
    private double leftAmount;
    @Column(name = "left_months")
    private double leftMonths;
    @OneToOne
    private Loan loan;

}
