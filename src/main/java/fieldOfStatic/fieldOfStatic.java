package fieldOfStatic;

public class fieldOfStatic {
	public static void main(final String[] args) {
		final Dog dog = new Dog("Burek");
		final Dog dog1 = new Dog("Marek");
		final Dog dog2 = new Dog("Lanek");
		System.out.println(Dog.howManyDogs);
		System.out.println(Dog.howManyDogs);
		System.out.println(Dog.howManyDogs);
	}
}
