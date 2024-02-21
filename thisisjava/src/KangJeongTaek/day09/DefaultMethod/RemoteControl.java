package KangJeongTaek.day09.DefaultMethod;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드는 선언부만 가진다. (public abstract) 생략해도 된다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드는 실행부를 갖는다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음을 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음을 해제합니다.");
		}
	}
	//정적 메소드
	public static void ChangeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
