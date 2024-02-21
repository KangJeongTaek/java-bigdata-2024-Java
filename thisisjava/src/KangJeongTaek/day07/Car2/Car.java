package KangJeongTaek.day07.Car2;

public class Car {
	int speed;
	void speedUp() {
		speed += 1;
	}
	final void stop() {
		System.out.println("차를 멈춤.");
		speed = 0;
	}
}
