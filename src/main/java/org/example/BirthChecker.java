package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj swoją datę urodzenia (YYYY-MM-DD)");
		LocalDate birthDate = LocalDate.parse(scanner.nextLine());
		LocalDate today = LocalDate.now();

		Period age = Period.between(birthDate, today);
		System.out.println("Masz " + age.getYears() + " lat, " + age.getMonths() + " miesięcy, " + age.getDays() + " dni.");
	}
}
