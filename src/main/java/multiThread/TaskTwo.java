package multiThread;

public class TaskTwo implements Runnable {
	@Override
	public void run() {
		System.out.println("Task 2 działa na wątku: " + Thread.currentThread().getName());
		processTask();
	}

	private void processTask() {
		try {
			Thread.sleep(2000);  // Symulacja pracy
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task 2 zakończony.");
	}
}
