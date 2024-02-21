package KangJeongTaek.day13.Thread;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread1();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		thread.interrupt();

	}
}
