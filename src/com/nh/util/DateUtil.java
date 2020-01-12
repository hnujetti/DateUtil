package com.nh.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateUtil {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		DayOfWeek dow = currentDate.getDayOfWeek();
		int day = currentDate.getDayOfMonth();
		int dayOfYear = currentDate.getDayOfYear();
		Month month = currentDate.getMonth();
		int year = currentDate.getYear();
		System.out.println("Today: " + day + "-" + month.getValue() + "-" + year);
		System.out.println("Day of year: " + dayOfYear + ", Week: " + dow);
	}

}
