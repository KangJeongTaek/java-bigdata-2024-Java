package KangJeongTaek.day09.DefaultMethod;

public class RemoteControlExample {
	public static void main (String[] args){
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		System.out.println();
		//정적 메소드는 인터페이스만으로 호출 가능하다.
		RemoteControl.ChangeBattery();
		}
}
