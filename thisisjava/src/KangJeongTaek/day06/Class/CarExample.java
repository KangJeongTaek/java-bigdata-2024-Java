package KangJeongTaek.day06.Class;

public class CarExample {
	public static void main(String[] args) {
	CarP myCar = new CarP("그렌져", true, 145); //Car 객체 생성
	
	//Car 객체의 필드값 읽기
	System.out.println("모델명: " + myCar.model); 
	System.out.println("시동여부: "  + myCar.start);
	System.out.println("현재속도: " + myCar.speed);
	}
}