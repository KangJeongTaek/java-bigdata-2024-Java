package KangJeongTaek.day06.OverLoading;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator my = new Calculator();
		double result1 = my.areaRectangle(10);
		double result2 = my.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.printf("직사각형 넓이 : %.1f", result2);
	}
}
