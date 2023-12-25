package com.div.properties;

import com.div.models.Currency;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "valute_types", schema = "bank_management")
public class ValuteTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinTable( schema = "bank_management",
            name = "valute_types_currencies",
            joinColumns = @JoinColumn(
                    name = "valute_types_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "currency_id", referencedColumnName = "id"))
    private List<Currency> currencies;
}
