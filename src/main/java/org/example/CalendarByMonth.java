package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

public class CalendarByMonth {
	public static void main(String[] args) {
		YearMonth yearMonth = YearMonth.now();
		LocalDate firstOfMonth = yearMonth.atDay(1);
		DayOfWeek firstDayOfWeek = firstOfMonth.getDayOfWeek();
		int daysInMonth = yearMonth.lengthOfMonth();

		System.out.println("Kalendarz dla: " +yearMonth);
		System.out.println("Pn Wt Śr Cz Pt So Nd");

		for (int i = 1; i < firstDayOfWeek.getValue(); i++) {
			System.out.print("   ");
		}

		// Wyświetl dni miesiąca
		for (int day = 1; day <= daysInMonth; day++) {
			System.out.printf("%2d ", day);
			if ((day + firstDayOfWeek.getValue() - 1) % 7 == 0) {
				System.out.println(); // Nowa linia po każdej niedzieli
			}
		}
	}
}
