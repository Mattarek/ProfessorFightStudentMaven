package multiThread;

public class TaskThree implements Runnable {
	@Override
	public void run() {
		System.out.println("Task 3 działa na wątku: " + Thread.currentThread().getName());
		processTask();
	}

	private void processTask() {
		try {
			Thread.sleep(3000);  // Symulacja pracy
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task 3 zakończony.");
	}
}
