package KangJeongTaek.day06.Class.Car;

public class CarExample {
	public static void main(String[] args) {
		Car1 car = new Car1("자가용"); //car라는 객체 생성 그 안에 Car1 생성자 중에서 입력 하나를 받는 것을 호출한다.
		System.out.println("car.company :" + car.company);
		System.out.println("car.model: " + car.model);
		System.out.println();
	
		
		Car1 car1 = new Car1("자가용", "빨강");
			System.out.println("car1.comapny :" + car1.company);
			System.out.println("car1.model : " + car1.model);
			System.out.println("car1.color : " + car1.color);
			System.out.println("car2.maxSpeed: " + car1.maxSpeed);
			System.out.println();
		Car1 car2 = new Car1("택시", "검정", 200);
			System.out.println("car2.company :" + car2.company);
			System.out.println("car2.model: " + car2.model);
			System.out.println("car2.color: " + car2.color);
			System.out.println("car2.maxSpeed: " + car2.maxSpeed);
	}
	
}
