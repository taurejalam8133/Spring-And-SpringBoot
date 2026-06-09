package com.nt.task01;

public class MonthEndChecker {

    private CalendarService calendarService;

    public void setCalendarService(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    public void checkMonthEnd() {
        int day = calendarService.getDate();

        if (day == 30 || day == 31) {
            System.out.println("Month is ending, please submit reports.");
        } else {
            System.out.println("Continue working as usual.");
        }
    }
}