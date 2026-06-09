package com.nt.task01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.task01.MonthEndChecker;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("com/nt/task01/applicationContext.xml");

        MonthEndChecker checker = ctx.getBean("checker", MonthEndChecker.class);

        checker.checkMonthEnd();
    }
}