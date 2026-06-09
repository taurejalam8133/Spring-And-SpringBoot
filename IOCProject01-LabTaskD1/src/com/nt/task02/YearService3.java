package com.nt.task02;

import java.time.LocalDate;
import java.time.Month;

public class YearService3 {

    private LocalDate date;

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void getMonth() {

        Month month = date.getMonth();

        if (month == Month.JANUARY) {
            System.out.println("Happy New Year!");
        } else if (month == Month.DECEMBER) {
            System.out.println("Get ready for the new year!");
        } else {
            System.out.println("Regular month.");
        }
    }
}