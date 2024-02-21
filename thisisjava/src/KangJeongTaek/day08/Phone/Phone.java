package KangJeongTaek.day08.Phone;

public abstract class  Phone {
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	
	void trunOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
