package com.loan.services;

import com.loan.model.Loan;
import com.loan.exception.*;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("icici")
public final class ICICIService implements LoanService {

    private final String branchCode = "ICICI001";
    private final double interestRate = 9.0;
    private final String managerName = "Suresh";

    private final Map<Integer, Loan> loans = new HashMap<>();

    @Override
    public void applyLoan(Loan loan) {
        if (loan.getAmount() < 1000) {
            throw new LoanProcessingException("Minimum amount 1000!");
        }
        loans.put(loan.getLoanId(), loan);
        System.out.println("ICICI Loan Applied: " + loan);
    }

    @Override
    public void rejectLoan(int loanId) {
        if (!loans.containsKey(loanId)) {
            throw new InvalidLoanOperationException("Loan not found!");
        }
        loans.remove(loanId);
        System.out.println("ICICI Loan Rejected: " + loanId);
    }

    @Override
    public void viewApplications() {
        loans.values().forEach(System.out::println);
    }
}
