package com.div.services.impl;

import com.div.models.Loan;
import com.div.models.User;
import com.div.services.LoanService;

import java.util.List;
import java.util.Optional;

public class LoanServiceImpl implements LoanService {
    @Override
    public Optional<Loan> getLoanById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Loan> getAll() {
        return null;
    }

    @Override
    public User getUserByLoanId(Long id) {
        return null;
    }
}
