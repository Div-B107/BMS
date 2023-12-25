package com.div.services.impl;

import com.div.properties.LoanPayment;
import com.div.services.LoanPaymentService;

import java.util.List;
import java.util.Optional;

public class LoanPaymentServiceImpl implements LoanPaymentService {
    @Override
    public Optional<LoanPayment> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<LoanPayment> getAll() {
        return null;
    }

    @Override
    public Double getLeftAmountByLoanPaymentId(Long id) {
        return null;
    }
}
