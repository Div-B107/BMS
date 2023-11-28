package com.div.services;

import com.div.models.Bank;

import java.util.List;
import java.util.Optional;

public interface BankService {

    Optional<Bank> findById(Long id);

    List<Bank> getAll();

    boolean deleteById(Long id);

    void add(Bank bank);

}
