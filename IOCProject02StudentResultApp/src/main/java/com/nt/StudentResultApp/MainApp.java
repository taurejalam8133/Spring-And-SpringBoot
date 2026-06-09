package com.nt.StudentResultApp;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.StudentResultApp.AppConfig;
import com.nt.StudentResultApp.Student;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        student.showStudentInfo();
        student.calculateResult();
    }
}
