package KangJeongTaek.day08.Vehicle;

public class DriverExample {
	public static void main(String[] args) {
		//Driver 타입의 dirver 참조 변수에 Driver 객체의 주소를 저장하라
		Driver driver = new Driver();
		//Bus 타입의 bus 참조 변수에 Bus 객체의 주소를 저장하라
		Bus bus = new Bus();
		//Driver 객체의 run 를 bus(BUS 타입)를 매개 변수로 받아 실행하라.
		driver.run(bus);
		
		//Taxi 타입의 taxi 참조 변수에 Taxi 객체의 주소를 저장하라
		Taxi taxi = new Taxi();
		//Driver 객체의 run 를 taxi(TAXI 타입)를 매개 변수로 받아 실행하라.
		driver.run(taxi);
		
		//Bus 클래스와 Taxi 클래스는 Vehicle 클래스로부터 상속 받았기에 Bus 타입과 Taxi 타입의 객체는 
		//자동으로 Vehicle 타입으로 변환이 된다.
	}
}
