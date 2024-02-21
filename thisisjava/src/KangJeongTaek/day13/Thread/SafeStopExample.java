package KangJeongTaek.day13.Thread;

public class SafeStopExample {
	public static void main(String[] args) {

		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		
		printThread.setStop(true);
		
	}
}
