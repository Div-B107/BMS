package com.div.services.impl;

import com.div.models.Account;
import com.div.models.Card;
import com.div.services.AccountService;

import java.util.List;
import java.util.Optional;

public class AccountServiceImpl implements AccountService {


    @Override
    public Optional<Account> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Account> getAll() {
        return null;
    }

    @Override
    public boolean blockAccount(Long id) {
        return false;
    }

    @Override
    public boolean openBlock(Long id) {
        return false;
    }

    @Override
    public List<Card> getAllCardsById(Long id) {
        return null;
    }
}