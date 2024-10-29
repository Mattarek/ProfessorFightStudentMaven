package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Timestamp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj datę i czas (YYYY-MM-DDTHH:MM:SS):");
		LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
		long timestamp = dateTime.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
		System.out.println("Unix timestamp: " + timestamp);

		System.out.println("Podaj Unix timestamp:");
		long inputTimestamp = scanner.nextLong();
		LocalDateTime dateFromTimestamp = LocalDateTime.ofInstant(Instant.ofEpochSecond(inputTimestamp), ZoneId.systemDefault());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("Data z timestamp: " + dateFromTimestamp.format(formatter));
	}
}
