package KangJeongTaek.day09.InterfacePoly2;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		driver.drive(bus);
		driver.drive(taxi);
		
	}
}
