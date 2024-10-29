package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class AfterBefore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj datę (YYYY-MM-DD):");

		LocalDate inputDate = LocalDate.parse(scanner.nextLine());
		LocalDate today = LocalDate.now();

		if (inputDate.isBefore(today)) {
			System.out.println("Podana data jest z przeszłości.");
		} else if (inputDate.isAfter(today)) {
			System.out.println("Podana data jest z przyszłości.");
		} else {
			System.out.println("Podana data to dzisiaj.");
		}
	}
}
