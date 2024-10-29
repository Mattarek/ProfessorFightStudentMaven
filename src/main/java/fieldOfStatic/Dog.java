package fieldOfStatic;

public class Dog extends Animal {

	public static int howManyDogs;

	Dog(final String name) {
		super(name);
		howManyDogs++;
	}
}
