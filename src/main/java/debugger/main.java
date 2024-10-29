package debugger;

public class main {
	public static void main(final String[] args) {
		final int[] numbers = {1, 2, 3, 4, 5};
		final int sum = calculateSum(numbers);
		System.out.println("Sum: " + sum);
	}

	public static int calculateSum(final int[] numbers) {
		int sum = 0;
		for (int i = 0; i <= numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}
