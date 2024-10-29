package multiThread;

public class TaskOne implements Runnable {
	@Override
	public void run() {
		System.out.println("Task 1 działa na wątku: " + Thread.currentThread().getName());
		processTask();
	}

	private void processTask() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task 1 zakońzcony.");
	}
}
