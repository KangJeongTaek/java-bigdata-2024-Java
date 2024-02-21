package KangJeongTaek.day09.InterfacePoly;

public class CarExample {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.run();
		
		mycar.tire1 = new KumhoTire();
		mycar.tire2 = new KumhoTire();
		
		mycar.run();
		
	}
}
