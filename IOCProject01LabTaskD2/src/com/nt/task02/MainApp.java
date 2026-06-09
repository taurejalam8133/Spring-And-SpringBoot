package com.nt.task02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.task02.NewYearChecker;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext ctx =
            new ClassPathXmlApplicationContext("com/nt/task02/applicationContext.xml");

        NewYearChecker checker = ctx.getBean("checker", NewYearChecker.class);

        checker.checkMonth();
    }
}
