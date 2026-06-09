package com.loan.application;

import com.loan.config.AppConfig;
import com.loan.model.Loan;
import com.loan.services.LoanService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public final class LoanManagerApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Bank: 1.HDFC  2.ICICI");
        int choice = sc.nextInt();

        LoanService service =
                (choice == 1) ? context.getBean("hdfc", LoanService.class)
                              : context.getBean("icici", LoanService.class);

        LoanApplication app = new LoanApplication(service);

        while (true) {
            System.out.println("\n1.Apply 2.Reject 3.View 4.Exit");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter ID Name Amount: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    double amount = sc.nextDouble();
                    app.apply(new Loan(id, name, amount));
                    break;

                case 2:
                    System.out.print("Enter Loan ID: ");
                    app.reject(sc.nextInt());
                    break;

                case 3:
                    app.view();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
