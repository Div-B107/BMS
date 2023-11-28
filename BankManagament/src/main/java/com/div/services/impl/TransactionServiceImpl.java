package com.div.services.impl;

import com.div.enums.TransactionResultType;
import com.div.enums.TransactionType;
import com.div.models.Card;
import com.div.models.Transaction;
import com.div.services.TransactionService;

import java.util.Optional;
import java.util.Set;

public class TransactionServiceImpl  implements TransactionService {
    @Override
    public Optional<Transaction> getTransactionById(Long id) {
        return Optional.empty();
    }

    @Override
    public Set<Transaction> getAll() {
        return null;
    }

    @Override
    public TransactionResultType getTransactionResultById(Long id) {
        return null;
    }

    @Override
    public void generateTransaction(String fromUserFin, Double amount, Card fromCard, TransactionType transactionType, String toUserFin, Card toCard) {

    }
}
