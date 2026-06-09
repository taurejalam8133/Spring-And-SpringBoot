package com.loan.model;

public final class Loan {
    private int loanId;
    private String applicantName;
    private double amount;

    public Loan(int loanId, String applicantName, double amount) {
        this.loanId = loanId;
        this.applicantName = applicantName;
        this.amount = amount;
    }

    public int getLoanId() {
    	return loanId; }
    public String getApplicantName() {
    	return applicantName; }
    public double getAmount() {
    	return amount; }

    @Override
    public String toString() {
        return loanId + " - " + applicantName + " - " + amount;
    }
}
