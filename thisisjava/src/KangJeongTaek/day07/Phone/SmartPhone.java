package KangJeongTaek.day07.Phone;

public class SmartPhone extends Phone{
	//디폴트 생성자
	SmartPhone(){
		System.out.println("나는 SmartPhone 클래스의 디폴트 생성자(자식)입니다.");
	}
	public boolean wifi;
	//두 개의 입력을 가지는 생성자
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
