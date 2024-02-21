package KangJeongTaek.day06.Class.Car2;

public class Car2Example {
	public static void main(String[] args) {
	Car2 car1 = new Car2("자가용"); //매개변수를 하나만 가지는 생성자 호출 후 그 주소값을 car1이라는 객체 안에 저장
	System.out.println("car1.company :" + car1.company);
	System.out.println("car1.model : " + car1.model);
	System.out.println("car2.color : " + car1.color);
	System.out.println();
	
	Car2 car2 = new Car2("자가용", "빨강");
	System.out.println("car2.company : " + car2.company);
	System.out.println("car2.model : " + car2.model);
	System.out.println("car2.color : " + car2.color);
	System.out.println();
	
	Car2 car3= new Car2("택시","검정", 200);
	System.out.println("car3.company : " + car3.company);
	System.out.println("car3.model : " + car3.model);
	System.out.println("car3.color : " + car3.color);
	System.out.println("car3.maxSpeed : " + car3.maxSpeed);
	System.out.println();
	}
}
