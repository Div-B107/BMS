package com.div.models;

import com.div.properties.ValuteTypes;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "currency", schema = "bank_management")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "exchange_rate")
    private double exchangeRate;
    @Column(name = "instance_date")
    private LocalDate instanceDate;
    @ManyToMany(mappedBy = "currencies")
    private List<ValuteTypes> valuteTypes;

}
