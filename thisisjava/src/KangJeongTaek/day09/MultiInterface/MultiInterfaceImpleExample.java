package KangJeongTaek.day09.MultiInterface;

public class MultiInterfaceImpleExample {
	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		
		searchable.search("https://naver.com");
	}
}
