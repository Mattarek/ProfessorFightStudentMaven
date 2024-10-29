package personExtends;

import java.util.Objects;

public class Student extends Person {
	protected String firstName;
	protected int age;

	public Student(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student { " +
				"FirstName=" + super.firstName + "," +
				" LastName=" + super.lastName +
				", age=" + age +
				" }";
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Student student)) {
			return false;
		}
		return age == student.age && Objects.equals(firstName, student.firstName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, age);
	}
}
