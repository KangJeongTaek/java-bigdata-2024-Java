package KangJeongTaek.day06.Class;
public class CarP {
	String model;
	boolean start;
	int speed;
	
	CarP(){
		System.out.println("나는 디폴트 생성자입니다.");
	}// 디폴트 생성자는 위로 와야한다.
	CarP(String model, boolean start, int speed){
		this.model = model;
		this.start = start;
		this.speed = speed;
		
	}
}

