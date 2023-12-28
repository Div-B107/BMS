package com.div.models;

import com.div.properties.ValuteTypes;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "currency", schema = "bank_management")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "exchange_rate")
    @NotNull(message = "Exchange Rate can not be null!")
    @Positive(message = "Exchange Rate must be positive!")
    private double exchangeRate;
    @Column(name = "instance_date")
    @NotNull(message = "Date can not be null!")
    private LocalDate instanceDate;
    @ManyToMany(mappedBy = "currencies")
    private List<ValuteTypes> valuteTypes;

}
