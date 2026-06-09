package com.nt.task02;

import java.time.LocalDate;
import java.time.Month;

public class YearService {

    public String getMonth() {
        Month month = LocalDate.now().getMonth();
        return month.toString();   // returns JANUARY, DECEMBER etc.
    }
}
