package Org.KangJeongTaek.Thread;


public class ThreadFour {

	public static void main(String[] args) throws Exception {
		MyClass my = new MyClass();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {

					my.increase();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {

					my.decrease();
				}
			}
		});

		thread1.start();
		thread2.start();
		thread2.join();

		my.getCount();
	}
}

class Increase implements Runnable {
	MyClass my = new MyClass();

	@Override
	public synchronized void run() {
		my.increase();
	}

}

class Decrease implements Runnable {
	MyClass my = new MyClass();

	@Override
	public void run() {
		synchronized (this) {

			my.decrease();
		}
	}
}

class MyClass {
	private int count;

	public void increase() {
		count++;
	}

	public void decrease() {

		count--;

	}

	public void getCount() {
		System.out.println(count);
	}
}
