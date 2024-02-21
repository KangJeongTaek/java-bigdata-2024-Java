package KangJeongTaek.day09.InterfaceCasting;

public class CastingExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare(); <- 인터페이스 내부에는 checkFare 메소드가 없기에 호출할 수 없다.
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
	}
}
