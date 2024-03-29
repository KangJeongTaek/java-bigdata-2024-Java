package Org.KangJeongTaek.Thread;

public class ThreadFive {
	public static void main(String[] args) throws Exception {
		MyCl myclass = new MyCl();

		myclass.getCount();

		Runnable task = new Increase1(myclass);
		Runnable task1 = new Decrease1(myclass);
		Thread th = new Thread(task);
		Thread th1 = new Thread(task1);
		th.start();
		th1.start();
		th1.join();
		myclass.getCount();
	}

}

class MyCl {
	private int count;

	public synchronized void increase() {
		count++;
	}

	public void decrease() {
		synchronized (this) {

			count--;
		}
	}

	public void getCount() {
		System.out.println(count);
	}
}

class Increase1 implements Runnable {
	MyCl myclass;

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {

			myclass.increase();
		}
	}

	Increase1(MyCl myclass) {
		this.myclass = myclass;
	}
}

class Decrease1 implements Runnable {
	MyCl myclass;

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			myclass.decrease();
		}
	}

	Decrease1(MyCl myclass) {
		this.myclass = myclass;
	}
}