package multiThread;

public class Main {
	public static void main(String[] args) {
		Thread task_one = new Thread(new TaskOne());
		Thread task_two = new Thread(new TaskTwo());
		Thread task_three = new Thread(new TaskThree());
		Thread task_four = new Thread(new TaskFour());

		task_one.start();
		task_two.start();
		task_three.start();
		task_four.start();

		Day[] WEEK = multiThread.Day.values();
		Day DAY = multiThread.Day.SATURDAY;



		try {
			task_one.join();
			task_two.join();
			task_three.join();
			task_four.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Wszystkie wątki zakończyły pracę.");
	}
}
