package com.nit.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("gpay")
public class GooglePayPayment implements PaymentService {

    @Value("${payment.companyName}")
    private String companyName;

    @Value("${payment.transactionLimit}")
    private double transactionLimit;

    @Value("${payment.paymentType}")
    private String paymentType;

    @Override
    public void makePayment() {
        System.out.println("Payment done using Google Pay");
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Transaction Limit : " + transactionLimit);
        System.out.println("Payment Type : " + paymentType);
    }
}
