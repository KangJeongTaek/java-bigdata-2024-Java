package Org.KangJeongTaek.Thread;
/*
public class Thread1 {
	public static void main(String[] args) {
		Thread tc = Thread.currentThread();
		System.out.println(tc.getName());
	}
}
*/


public class Thread1 extends Thread {

	@Override
	public void run() {
		System.out.println("와 목요일이다.");
	}

	public static void main(String[] args) {
		Thread1 tc = new Thread1();
		try {
			tc.start();
		} catch (Exception e) {
		}
	}
}
