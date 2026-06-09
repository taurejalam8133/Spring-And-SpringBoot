package com.nt.EmployeeSalarySlipApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        SalarySlipService service =
                context.getBean(SalarySlipService.class);

        service.generateSlip();
    }
}
