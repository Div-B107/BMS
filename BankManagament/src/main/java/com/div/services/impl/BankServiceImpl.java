package com.div.services.impl;

import com.div.models.Bank;
import com.div.services.BankService;

import java.util.List;
import java.util.Optional;

public class BankServiceImpl implements BankService {
    @Override
    public Optional<Bank> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Bank> getAll() {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public void add(Bank bank) {

    }
}
