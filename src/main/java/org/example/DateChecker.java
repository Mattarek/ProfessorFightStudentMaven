package org.example;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class DateChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj rok:");
		int year = scanner.nextInt();

		if (Year.of(year).isLeap()) {
			System.out.println(year + " to rok przestępny.");
		} else {
			System.out.println(year + " to nie rok przestępny");
		}

		System.out.println("Podaj datę (YYYY-MM-DD):");
		String date = scanner.next();

		try {
			LocalDate.parse(date);
			System.out.println("Podana data jest poprawna.");
		} catch (Exception e) {
			System.out.println("Podana data jest niepoprawna.");
		}
	}
}
