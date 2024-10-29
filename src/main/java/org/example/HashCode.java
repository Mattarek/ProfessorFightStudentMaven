package org.example;

import java.util.ArrayList;
import java.util.List;

public class HashCode {
	String name;
	int age;

	public static void main(String[] args) {
		List<Integer> intCollections = new ArrayList();
		intCollections.add(1);
		intCollections.add(2);
		intCollections.add(3);
		System.out.println(intCollections);
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Person person = (Person) o;
		return age == person.age && name.equals(person.name);
	}

}
