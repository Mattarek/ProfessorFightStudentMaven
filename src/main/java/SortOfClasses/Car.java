package SortOfClasses;

public class Car {
	private final String model = "Tesla Model S";

	public static void main(final String[] args) {
		final Car car = new Car();
		final Car.Engine engine = car.new Engine();
		engine.start();
	}

	// Inner class
	class Engine {
		void start() {
			// Accessing non-static member of the outer class
			System.out.println("Starting engine of: " + model);
		}
	}
}
