package KangJeongTaek.day07.Phone;

public class Phone {
	//필드 선언
	public String model;
	public String color;
	//디폴트 생성자
	Phone(){
		System.out.println("나는 Phone 클래스의 디폴트 생성자(부모)입니다.");
	}
	//메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	public void hangup() {
		System.out.println("전화를 끊습니다.");
	}
}
