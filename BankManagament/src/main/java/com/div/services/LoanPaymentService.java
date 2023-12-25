package com.div.services;

import com.div.properties.LoanPayment;

import java.util.List;
import java.util.Optional;

public interface LoanPaymentService {


    Optional<LoanPayment> findById(Long id);

    List<LoanPayment> getAll();

    Double getLeftAmountByLoanPaymentId(Long id);

}
