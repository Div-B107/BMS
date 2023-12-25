package com.div.properties;

import com.div.models.Loan;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "loan_types", schema = "bank_management")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoanTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "type_name", length = 100)
    private String typeName;
    @Column(name = "description")
    private String description;
    @OneToMany
    private List<Loan> loans;
}
