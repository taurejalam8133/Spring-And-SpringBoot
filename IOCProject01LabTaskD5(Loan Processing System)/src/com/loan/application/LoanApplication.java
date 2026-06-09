package com.loan.application;

import com.loan.model.Loan;
import com.loan.services.LoanService;

public final class LoanApplication {

    private final LoanService loanService;

    public LoanApplication(LoanService loanService) {
        this.loanService = loanService;
    }

    public void apply(Loan loan) {
        loanService.applyLoan(loan);
    }

    public void reject(int loanId) {
        loanService.rejectLoan(loanId);
    }

    public void view() {
        loanService.viewApplications();
    }
}
