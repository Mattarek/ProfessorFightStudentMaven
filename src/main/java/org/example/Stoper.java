package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Wpisz 'start', aby uruchomić serwer.");
		String command = scanner.nextLine();

		if (command.equals("start")) {
			Instant start = Instant.now();
			System.out.println("Stoper uruchomiony... Wpisz 'stop', aby zatrzymać.");

			command = scanner.nextLine();

			if (command.equals("stop")) {
				Instant stop = Instant.now();
				Duration duration = Duration.between(start, stop);
				System.out.println("Trwanie: " + duration.toSeconds() + " sekund");
			}
		}
	}
}
