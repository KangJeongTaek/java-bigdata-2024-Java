package KangJeongTaek.day06.Class.Car;

public class Car1 {
	String model; //필드
	String color;
	String company = "현대자동차"; //필드 초기화
	int maxSpeed;
	
	Car1(){ //디폴트 생성자
		
	}
	Car1(String model){ //매개변수를 하나 가지는 생성자
		this(model,"은색",250); //this(n,n,n) n개를 가지는 생성자를 호출
	}
	Car1(String model, String color){ //매개 변수를 2개 가지는 생성자
		this(model,color,250);
	}
	Car1(String model, String color,int maxSpeed){ //매개 변수를 3개 가지는 생성자. 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
