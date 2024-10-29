package org.example;

import java.util.Objects;

public final class Student extends Person {
	private final int indexNumber;

	public Student(final String firstName, final String lastName, final int age, final int hp, final int indexNumber, final PersonalNumber personalNumber) {
		super(firstName, lastName, age, hp, personalNumber);
		this.indexNumber = indexNumber;
	}
	
	public int getIndexNumber() {
		return indexNumber;
	}

	@Override
	public String toString() {
		return "Student{" +
				"indexNumber=" + indexNumber +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof final Student student)) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		return indexNumber == student.indexNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), indexNumber);
	}
}