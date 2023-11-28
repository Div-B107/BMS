package com.div.services;

import com.div.models.Account;
import com.div.models.Card;

import java.util.List;
import java.util.Optional;

public interface AccountService {


    Optional<Account> findById(Long id);

    List<Account>  getAll();


    boolean blockAccount(Long id);

    boolean openBlock(Long id);

    List<Card> getAllCardsById(Long id);




}
