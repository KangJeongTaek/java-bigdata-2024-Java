package KangJeongTaek.day07.Overriding1;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); //부모 객체에 있는 takeoff 메소드 호출
		sa.fly(); // 자식 객체에 있는 fly 메소드 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //자식 객체에 있는 flymode 필드 값 변경
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
