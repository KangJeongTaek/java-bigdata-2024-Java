package KangJeongTaek.day07.Overriding;


public class Computer extends Calculator {
	@Override //컴파일 시 정확히 오버라이딩이 되었는지 체크해 줌(생략가능)
	//메소드 오버라이딩
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
}
