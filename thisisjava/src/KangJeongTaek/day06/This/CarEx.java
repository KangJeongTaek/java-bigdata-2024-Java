package KangJeongTaek.day06.This;

public class CarEx {
	public static void main(String[] args) {
	Car myCar = new Car("벤츠");
	Car yourCar = new Car("포르쉐");
	
	myCar.run();
	yourCar.run();
	myCar.setSpeed(250);
	}
}