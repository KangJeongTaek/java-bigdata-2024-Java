package KangJeongTaek.day13.Thread.P624;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("DaeMonThread");	
		}
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
}
