package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AddTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

		System.out.println("Aktualna data i czas: " + now.format(formatter));

		System.out.println("Ile dni chcesz dodać/odjąć?");
		int days = scanner.nextInt();

		System.out.println("Ile godzin chcesz dodać/odjąć?");
		int hours = scanner.nextInt();

		System.out.println("Ile minut chcesz dodać/odjąć?");
		int minutes = scanner.nextInt();

		LocalDateTime newDateTime = now.plusDays(days).plusHours(hours).plusMinutes(minutes);
		System.out.println("Nowa data i czas: " + newDateTime.format(formatter));
	}
}
