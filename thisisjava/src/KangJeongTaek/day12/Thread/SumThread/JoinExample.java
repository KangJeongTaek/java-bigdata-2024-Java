package KangJeongTaek.day12.Thread.SumThread;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {

		}
		System.out.println("1~100합: " + sumThread.getSum());
		;
	}
}
