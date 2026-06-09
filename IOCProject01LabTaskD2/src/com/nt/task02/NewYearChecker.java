package com.nt.task02;

public class NewYearChecker {

    private YearService yearService;

    public void setYearService(YearService yearService) {
        this.yearService = yearService;
    }

    public void checkMonth() {
        String month = yearService.getMonth();

        if (month.equalsIgnoreCase("JANUARY")) {
            System.out.println("Happy New Year!");
        } 
        else if (month.equalsIgnoreCase("DECEMBER")) {
            System.out.println("Get ready for the new year!");
        } 
        else {
            System.out.println("Regular month.");
        }
    }
}
