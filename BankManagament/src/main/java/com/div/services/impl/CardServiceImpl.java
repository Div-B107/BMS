package com.div.services.impl;

import com.div.models.Card;
import com.div.services.CardService;

import java.time.LocalDate;
import java.util.Optional;

public class CardServiceImpl implements CardService {
    @Override
    public Double getAmountByCardId(Long id) {
        return null;
    }

    @Override
    public Optional<Card> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean blockCard(Long id) {
        return false;
    }

    @Override
    public boolean openBlock(Long id) {
        return false;
    }

    @Override
    public LocalDate getExpireDate(Long id) {
        return null;
    }
}
