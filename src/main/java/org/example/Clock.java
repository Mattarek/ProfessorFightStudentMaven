package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
	public static void main(String[] args) throws InterruptedException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

		while (true) {
			LocalTime now = LocalTime.now();
			System.out.println(now);
			System.out.println("\r" + now.format(formatter));
			Thread.sleep(1000);
		}
	}
}
