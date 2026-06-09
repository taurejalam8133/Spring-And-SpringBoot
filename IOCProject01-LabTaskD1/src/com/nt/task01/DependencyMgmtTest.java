package com.nt.task01;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class DependencyMgmtTest {
    public static void main(String[] args) {

        FileSystemXmlApplicationContext ctx =
            new FileSystemXmlApplicationContext("src/com/nt/task01/applicationContext2.xml");

        DatePrinter2 dp = (DatePrinter2) ctx.getBean("dp");

        dp.printDate();

        ctx.close();
    }
}
