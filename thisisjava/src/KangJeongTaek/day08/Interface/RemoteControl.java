package KangJeongTaek.day08.Interface;

public interface RemoteControl {
	//상수 필드 선언 (public static final)는 생략가능하다.
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// 추상 메소드 (public abstract)는 생략가능하다
	public abstract void turnOn();
	
}
