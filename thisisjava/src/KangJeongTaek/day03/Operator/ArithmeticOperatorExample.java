package KangJeongTaek.day03.Operator;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2= 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2; // 10 더하기 4
		System.out.println("result1: " + result1);
		
		long result2 = v1 + v2 - v4;  // 10 더하기 4 빼기 10
		System.out.println("result2: " + result2);
		
		double result3 = (double)v1 /v2; //10 나누기 4의 몫
		System.out.println("result3: " + result3);
		
		int result4 = v1 % v2; // 10/ 4 의 나머지를 불러온다.
		System.out.println("result4: " + result4);
		
		long result5 = v3 + v4;
		System.out.println("result5: " + result5);
				
		
	}
}
