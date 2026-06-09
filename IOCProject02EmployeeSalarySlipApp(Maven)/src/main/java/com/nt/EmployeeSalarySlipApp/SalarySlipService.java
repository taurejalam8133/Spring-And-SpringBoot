package com.nt.EmployeeSalarySlipApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalarySlipService {

    @Autowired
    private Employee employee;

    public void generateSlip() {

        double grossSalary = employee.getBasicSalary() + employee.getHra() + employee.getDa();

        double taxAmount = (grossSalary * employee.getTaxPercentage()) / 100;

        double netSalary = grossSalary - taxAmount;

        System.out.println("Salary Slip for " + employee.getName());
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax Deducted: " + taxAmount);
        System.out.println("Net Salary: " + netSalary);
    }
}
