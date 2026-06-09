package com.nt.task01;
import java.time.LocalDate;

public class CalendarService {
	public int getDate() {
		return LocalDate.now().getDayOfMonth();
	}

}
