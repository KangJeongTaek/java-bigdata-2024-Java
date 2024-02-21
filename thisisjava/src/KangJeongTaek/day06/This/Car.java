package KangJeongTaek.day06.This;

public class Car {
	String model; //필드 선언
	int speed; 
	Car(String model){ //생성자 선언
		this.model = model; //매개변수를 필드에 대입 (this 사용)
	}
	Car(int speed){
		
	}
	void setSpeed(int speed) { // 멤버함수 정의  
		this.speed = speed;  //매개변수를 필드에 대입
	}
	void run() {
		this.setSpeed(250); //this 생략가능
		System.out.println(this.model + "가 달립니다. (시속:" + this.speed + "km/h)"); //this 생략가능
	}
	
	
}
