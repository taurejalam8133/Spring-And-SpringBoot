package com.loan.services;

import com.loan.model.Loan;

public interface LoanService {
	 void applyLoan(Loan loan);
	    void rejectLoan(int loanId);
	    void viewApplications();

}
