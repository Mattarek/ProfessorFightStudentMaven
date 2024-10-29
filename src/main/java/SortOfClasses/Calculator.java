package SortOfClasses;

public class Calculator {
	public static void main(final String[] args) {
		final Calculator calculator = new Calculator();
		calculator.calculate(3, 4);
	}

	void calculate(final int a, final int b) {
		final int factor = 10;

		// Local class
		class Multiplier {
			int multiply(final int x, final int y) {
				return x * y * factor;
			}
		}

		final Multiplier multiplier = new Multiplier();
		final int result = multiplier.multiply(a, b);
		System.out.println("Result: " + result);
	}
}
