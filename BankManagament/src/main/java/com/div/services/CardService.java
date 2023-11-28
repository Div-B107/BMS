package com.div.services;

import com.div.models.Card;

import java.time.LocalDate;
import java.util.Optional;

public interface CardService {

    Double getAmountByCardId(Long id);

    Optional<Card> findById(Long id);


    boolean blockCard(Long id);

    boolean openBlock(Long id);


    LocalDate getExpireDate(Long id);

}
