package KangJeongTaek.day12.Thread;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i + 1);
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		};

		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);

			} catch (Exception e) {
			}
		}

	}
}
