package KangJeongTaek.day07.Singleton;

public class Singleton {
	//private 접근 권한을 갖는 정적 필드 선언과 초기화 - 자기 자신의 객체를 생성한다.
	private static Singleton singleton = new Singleton();
	
	// private 접근 권한을 갖는 생성자 - 외부에서 생성자 호출을 차단한다.
	private Singleton() {
		
	}
	
	//외부에서 객체가 필요한 경우 getInstance 메소드를 통해 생성한 객체를 리턴한다.
	public static Singleton getInstance() {
		return singleton;
	}
}	
