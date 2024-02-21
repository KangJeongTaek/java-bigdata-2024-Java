package KangJeongTaek.day07.Car1;

public class Car1Example {
	public static void main(String[] args) {
		Car1 myCar= new Car1();
		
		myCar.setSpeed(-12);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setStop(true);
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}
