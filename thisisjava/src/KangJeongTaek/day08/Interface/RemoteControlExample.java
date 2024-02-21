package KangJeongTaek.day08.Interface;

public class RemoteControlExample {
	public static void main(String[] args) {
		/* RemoteControl rc;
		 * rc = new Television();
		 */
		//인터페이스 타입의 변수를 선언하고 그 안에 구현 클래스의 객체를 생성해서 그 주소값을 저장한다.
		RemoteControl rc = new Television();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();
		
		System.out.println("리모트 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모트 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
	}
}
