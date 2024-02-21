package KangJeongTaek.day07.Car;

public class Car {
	int speed; //인스턴스 필드 선언
	void run() { //인스턴스 메소드 선언
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {//클래스(정적) 메소드 선언
		Car myCar = new Car(); //Car 객체 생성
		myCar.speed = 200; //객체로 speed 인스턴스 필드에 접근
		myCar.run(); //객체로 run 메소드 호출
	}
	
	public static void main(String[] args) { //정적 main 메소드 선언
		Car.simulate(); //정적 메소드는 클래스 이름으로 접근한다.
		Car myCar = new Car(); //Car 객체 생성
		myCar.speed = 60; // 객체를 통해 speed라는 인스턴스 필드에 접근한다.
		myCar.run();  //객체를 통해 run이라는 메소드 호출한다.	
		Car.simulate();
	}
}
