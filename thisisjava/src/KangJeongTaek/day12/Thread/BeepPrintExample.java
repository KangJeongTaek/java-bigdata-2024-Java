package KangJeongTaek.day12.Thread;

//import java.awt.Toolkit;
public class BeepPrintExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
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
		});
		thread.start();

		// Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}
}
