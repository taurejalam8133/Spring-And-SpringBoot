package com.loan.services;

import com.loan.model.Loan;
import com.loan.exception.*;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("hdfc")
public final class HDFCService implements LoanService {

    private final String branchCode = "HDFC001";
    private final double interestRate = 8.5;
    private final String managerName = "Ramesh";

    private final Map<Integer, Loan> loans = new HashMap<>();

    @Override
    public void applyLoan(Loan loan) {
        if (loan.getAmount() <= 0) {
            throw new LoanProcessingException("Invalid amount!");
        }
        loans.put(loan.getLoanId(), loan);
        System.out.println("HDFC Loan Applied: " + loan);
    }

    @Override
    public void rejectLoan(int loanId) {
        if (!loans.containsKey(loanId)) {
            throw new InvalidLoanOperationException("Loan not found!");
        }
        loans.remove(loanId);
        System.out.println("HDFC Loan Rejected: " + loanId);
    }

    @Override
    public void viewApplications() {
        loans.values().forEach(System.out::println);
    }
}
