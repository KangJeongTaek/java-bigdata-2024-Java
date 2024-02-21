package KangJeongTaek.day07.Calculator;

public class Calculator11Example {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator11.pi; //정적 필드는 클래스 명으로 접근한다.
		
		int result2 = Calculator11.plus(10,5); // 정적 메소드는 클래스 명으로 접근한다.
		int result3 = Calculator11.minus(10,5);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
