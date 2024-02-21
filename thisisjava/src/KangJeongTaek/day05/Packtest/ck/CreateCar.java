package KangJeongTaek.day05.Packtest.ck;

class Car{
	String modelName;      //멤버 변수==필드 ==속성
	String carColor;
	int modelYear;
}
public class CreateCar {
	public static void main(String[] args) {
		/* Car 타입의 변수 c에 Car 클래스의 객체를 집어넣어라.*/
		Car c1 = new Car(); //객체 생성 , 디폴트 생성자 호출,default 생성자(따로 만들 필요가 없다. 컴파일러가 생성해준다.)
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.modelName = "테슬라";
		c2.modelName = "람보르기니";
		c3.modelName = "부가티";
		System.out.println(c1.modelName);
		System.out.println(c2.modelName);
		System.out.println(c3.modelName);
		System.out.println(c1.carColor);
		System.out.println(c3.modelYear);
	}
}

