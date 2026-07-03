package com.nit.bean;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PaymentRunner implements CommandLineRunner {

    private PaymentService paymentService;

    public PaymentRunner(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {

        paymentService.makePayment();

        paymentService.showPaymentDetails();
    }
}
