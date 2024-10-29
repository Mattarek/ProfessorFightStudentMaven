package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static final List<JSONObject> professorsList = readJsonArrayFromFile("./professors.json");
	private static final List<JSONObject> studentsArray = readJsonArrayFromFile("./students.json");

	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Wybierz opcję: \n1 - Dodaj studenta, \n2 - Dodaj profesora, \n3 - Odczytaj studentów," + " \n4 - " + "Odczytaj profesorów, \n0 - Wyjdź");
			final int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					addStudent(scanner);
					break;
				case 2:
					addProfessor(scanner);
					break;
				case 3:
					readStudentsFromFile();
					break;
				case 4:
					readProfessorsFromFile();
					break;
				case 0:
					System.out.println("Koniec programu.");
					return;
				default:
					System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
			}
		}
	}

	private static void addProfessor(final Scanner scanner) {
		System.out.println("Podaj imię profesora:");
		final String firstName = scanner.nextLine();
		System.out.println("Podaj nazwisko profesora:");
		final String lastName = scanner.nextLine();
		System.out.println("Podaj wiek profesora:");
		final int age = scanner.nextInt();
		System.out.println("Podaj tytuł profesora:");
		scanner.nextLine();
		final String title = scanner.nextLine();
		System.out.println("Podaj HP profesora:");
		final int hp = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Podaj specjalizację profesora (wpisz dokładnie):");

		for (final ProfessorsSpecialization specialization : ProfessorsSpecialization.values()) {
			System.out.print(specialization.getName() + ", ");
		}
		System.out.println();
		final String specializationInput = scanner.nextLine();
		final ProfessorsSpecialization specialization = ProfessorsSpecialization.fromString(specializationInput);

		System.out.println("Podaj PESEL profesora:");
		final String pesel = scanner.nextLine();

		final PersonalNumber personalNumberProfessor = new PersonalNumber(pesel);

		final Professor professor = new Professor(firstName, lastName, age, title, hp, specialization, personalNumberProfessor);

		professorsList.add(professor);
		saveProfessorToFile(professor);
		System.out.println("Profesor został dodany!");
	}

	private static void saveStudentToFile(final Student student) {
		try (final FileWriter writer = new FileWriter("./students.json", true)) {
			final JSONObject jsonObject = new JSONObject();
			jsonObject.put("firstName", student.getFirstName());
			jsonObject.put("lastName", student.getLastName());
			jsonObject.put("age", student.getAge());
			jsonObject.put("hp", student.getHp());
			jsonObject.put("indexNumber", student.getIndexNumber());
			jsonObject.put("personalNumber", student.personalNumber.pesel());

			writer.write(jsonObject + System.lineSeparator());
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private static void saveProfessorToFile(final Professor professor) {
		try (final FileWriter writer = new FileWriter("./professors.json", true)) {
			final JSONObject jsonObject = new JSONObject();
			jsonObject.put("firstName", professor.getFirstName());
			jsonObject.put("lastName", professor.getLastName());
			jsonObject.put("age", professor.getAge());
			jsonObject.put("title", professor.getTitle());
			jsonObject.put("hp", professor.getHp());
			jsonObject.put("specialization", professor.getProfessorSpecialization());
			jsonObject.put("personalNumber", professor.personalNumber.pesel());

			writer.write(jsonObject + System.lineSeparator());
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	// Metody do odczytywania
	private static void readStudentsFromFile() {
		try (final BufferedReader br = new BufferedReader(new FileReader("./students.json"))) {
			String line;
			while ((line = br.readLine()) != null) {
				final JSONObject jsonObject = new JSONObject(line);
				System.out.println(jsonObject);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private static void readProfessorsFromFile() {
		try (final BufferedReader br = new BufferedReader(new FileReader("./professors.json"))) {
			String line;
			while ((line = br.readLine()) != null) {
				final JSONObject jsonObject = new JSONObject(line);
				System.out.println(jsonObject);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private static List<JSONObject> readJsonArrayFromFile(final String filePath) {
		final List<JSONObject> jsonArray = new ArrayList<>();

		try (final BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			final StringBuilder content = new StringBuilder();
			String line;

			while ((line = br.readLine()) != null) {
				content.append(line);
			}

			// Sprawdź, czy plik nie jest pusty, i zinterpretuj jego zawartość jako JSONArray
			if (!content.toString().isEmpty()) {
				final JSONArray array = new JSONArray(content.toString());
				for (int i = 0; i < array.length(); i++) {
					jsonArray.add(array.getJSONObject(i));
				}
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}

		return jsonArray;
	}

	private static void addStudent(final Scanner scanner) {
		System.out.println("Podaj imię studenta:");
		final String firstName = scanner.nextLine();
		System.out.println("Podaj nazwisko studenta:");
		final String lastName = scanner.nextLine();
		System.out.println("Podaj wiek studenta:");
		final int age = scanner.nextInt();
		System.out.println("Podaj HP studenta:");
		final int hp = scanner.nextInt();
		System.out.println("Podaj numer indeksu:");
		final int indexNumber = scanner.nextInt();
		System.out.println("Podaj PESEL studenta:");
		scanner.nextLine();

		final String pesel = scanner.nextLine();
		final PersonalNumber personalNumber = new PersonalNumber(pesel);
		final Student student = new Student(firstName, lastName, age, hp, indexNumber, personalNumber);

		System.out.println(studentsArray);
		saveStudentToFile(student);
		System.out.println("Student został dodany!");
	}
}
