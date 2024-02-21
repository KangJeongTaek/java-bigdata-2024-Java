package KangJeongTaek.day08.Car;

public class Carexample {
	public static void main(String[] args) {
	Car myCar = new Car(); //Car 객체를 생성해서 myCar라는 참조 변수에 그 주소를 저장하라
	myCar.tire = new KumhoTire(); //tire 필드에 KumhoTire의 객체를 생성 후 그 주소를 넣어라
	myCar.run();// tire 필드에 저장된 객체의 roll 메소드를 실행하라
	myCar.tire = new Tire(); //tire 라는 변수에 Tire 객체를 생성 후 그 주소를 넣어라
	myCar.run(); 
	myCar.tire = new HankookTire(); //tire 라는 변수에 HankookKTire의 객체를 생성 후 그 주소를 넣어라
	myCar.run();
	}
}
