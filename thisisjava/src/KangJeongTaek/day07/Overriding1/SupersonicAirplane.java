package KangJeongTaek.day07.Overriding1;

public class SupersonicAirplane extends Airplane{
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	int flyMode = NORMAL;
	
	@Override
	void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속으로 비행합니다.");
		}else {
			super.fly();
		}
	}
}
