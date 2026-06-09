package com.nt.StudentResultApp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${student.id}")
    private int studentId;

    @Value("${student.name}")
    private String studentName;

    @Value("${student.subject}")
    private String subject;

    @Value("${student.marks}")
    private int marks;

    @Value("${student.passPercentage}")
    private int passPercentage;

    public void calculateResult() {
        if (marks >= passPercentage) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    public void showStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Subject: " + subject);
        System.out.println("Marks: " + marks);
        System.out.println("Pass Percentage: " + passPercentage);
    }
}
