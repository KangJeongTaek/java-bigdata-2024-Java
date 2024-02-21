package KangJeongTaek.day09.InterfacePoly;

public class Car {
	//필드의 타입이 인터페이스이다.
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
