package com.div.services;

import com.div.models.Loan;
import com.div.models.User;

import java.util.List;
import java.util.Optional;

public interface LoanService {

    Optional<Loan> getLoanById(Long id);

    List<Loan> getAll();

    User getUserByLoanId(Long id);


}
