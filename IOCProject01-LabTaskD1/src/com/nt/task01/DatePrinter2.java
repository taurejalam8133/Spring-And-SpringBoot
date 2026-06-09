package com.nt.task01;

import java.time.LocalDate;

public class DatePrinter2 {

    private LocalDate currentDate;
    
    public DatePrinter2() {
        System.out.println("DatePrinter::0-param constructor");
    }

    public void setCurrentDate(LocalDate currentDate) {
        System.out.println("DatePrinter.setCurrentDate()");
        this.currentDate = currentDate;
    }

    public void printDate() {
        System.out.println("Current Date: "+currentDate);

      
    }
}
