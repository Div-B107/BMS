package com.div.services.impl;

import com.div.enums.CurrencyType;
import com.div.services.CurrencyService;

import java.time.LocalDate;
import java.util.Map;

public class CurrencyServiceImpl implements CurrencyService {
    @Override
    public Map<CurrencyType, Double> getCurrentCurrency() {
        return null;
    }

    @Override
    public Map<CurrencyType, Double> getCurrencyByDate(LocalDate date) {
        return null;
    }

    @Override
    public Double getCurrentExchangeByCurrencyType() {
        return null;
    }

    @Override
    public Double getExchangeByCurrencyTypeAndDate(LocalDate date) {
        return null;
    }


}
