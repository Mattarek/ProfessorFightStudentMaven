package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DIfferenceBetweenDate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj pierwszą datę (YYYY-MM-DD): ");
		LocalDate date = LocalDate.parse(scanner.nextLine());

		System.out.println("Podaj drugą datę (YYYY-MM-DD): ");
		LocalDate dateTwo = LocalDate.parse(scanner.nextLine());

		long daysBetween = ChronoUnit.DAYS.between(date, dateTwo);
		System.out.println("Liczba dni pomiędzy: " + daysBetween);
	}
}
