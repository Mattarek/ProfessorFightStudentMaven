package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

public class Calendar {
	public static void main(String[] args) {
		byte daysInCallender = 42;

		LocalDate today = LocalDate.now();
		YearMonth currentMonth = YearMonth.of(today.getYear(), today.getMonth());

		LocalDate firstOfMonth = currentMonth.atDay(1);
		LocalDate startOfGrid = firstOfMonth.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		LocalDate endOfGrid = startOfGrid.plusDays(daysInCallender);

		System.out.println(startOfGrid);
		System.out.println(endOfGrid);

		Clock cl = new Clock();
		System.out.println(cl);
	}
}
