package com.nt.EmployeeSalarySlipApp;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int id;
    private String name;
    private double basicSalary;
    private double hra;
    private double da;
    private double taxPercentage;

       public Employee() {
        this.id = 101;
        this.name = "John";
        this.basicSalary = 40000;
        this.hra = 5000;
        this.da = 5000;
        this.taxPercentage = 10;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }
}
