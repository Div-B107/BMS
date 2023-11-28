package com.div.services;

import com.div.enums.TransactionResultType;
import com.div.enums.TransactionType;
import com.div.models.Card;
import com.div.models.Transaction;
import com.div.models.User;


import java.util.Optional;
import java.util.Set;

public interface TransactionService {


/*
    Long ----> id
String --> transactionİd
LocalDateTime--->instanceTime
String---->fromUserFin
TransactionType (enum) ---> transactionType
Card-----> fromCard
Double ---> amount
String--->toUserFin
Card---->toCard
TransactionResulstTypes(enum)--->transactionResult
    */

    Optional<Transaction> getTransactionById(Long id);

    Set<Transaction> getAll();

    TransactionResultType getTransactionResultById(Long id);

    //need discuss you can add new methods for transaction type or general fields  for any transaction
    void generateTransaction(String fromUserFin, Double amount, Card fromCard, TransactionType transactionType, String toUserFin, Card toCard);


}
