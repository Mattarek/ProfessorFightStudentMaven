package personExtends;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Marcin", "Barć", 27);
		Student studentTwo = new Student("Sylwia", "Barć", 27);
		Student studentThree = new Student("Patryk", "Barć", 31);

		System.out.println(student);
		System.out.println(studentTwo);
		System.out.println(studentThree);

		int a = -130;
		byte b = (byte) a;
		System.out.println(b);
	}
}
