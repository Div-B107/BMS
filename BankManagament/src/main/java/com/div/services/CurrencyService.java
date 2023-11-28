package com.div.services;

import com.div.enums.CurrencyType;

import java.time.LocalDate;
import java.util.Map;


public interface CurrencyService {

    Map<CurrencyType, Double> getCurrentCurrency();


    Map<CurrencyType, Double> getCurrencyByDate(LocalDate date);


    Double getCurrentExchangeByCurrencyType();

    Double getExchangeByCurrencyTypeAndDate(LocalDate date);


}
