package com.nt.task02;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyMgmtTest3 {

    public static void main(String[] args) {

        FileSystemXmlApplicationContext ctx =
            new FileSystemXmlApplicationContext("src/com/nt/task02/applicationContext3.xml");

        YearService3 ys = (YearService3) ctx.getBean("ys");

        ys.getMonth();

        ctx.close();
    }
}

