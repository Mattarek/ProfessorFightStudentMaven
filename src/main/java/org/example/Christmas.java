package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class Christmas {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		int year = today.getYear();

		List<LocalDate> holidays = Arrays.asList(
				LocalDate.of(year, 1, 1),
				LocalDate.of(year, 12, 25),
				LocalDate.of(year, 12, 26)
		);

		for (LocalDate holiday : holidays) {
			long daysUntil = ChronoUnit.DAYS.between(today,holiday);
			System.out.println(holiday + " - Pozostało dni: " + daysUntil);
		}
	}
}
