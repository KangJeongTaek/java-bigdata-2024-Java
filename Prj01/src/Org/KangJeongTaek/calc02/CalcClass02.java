package Org.KangJeongTaek.calc02;
import java.util.Scanner;

public class CalcClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		double val1 = sc.nextDouble();
		
		System.out.println("정수를 입력하세요.");
		double val2 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("연산자를 입력하세요."); 
		String operator = sc.nextLine();
		
		/*switch(operator) {
			case "+":
				System.out.println("더하기 연산 " + (val1 + val2));
				break;
			case "-":
				System.out.println("빼기 연산 " + (val1 -val2));
				break;
			case "*":
				System.out.println("곱하기 연산 " + (val1 * val2));
				break;
			case "/":
				System.out.printf("나누기 연산 %.2f", (val1 / val2));
		}*/
		
		if(operator.equals("+")) {
			System.out.println("더하기 연산 " + (val1 + val2));
		} else if(operator.equals("-")) {
			System.out.println("빼기 연산 " + (val1 - val2));
		} else if(operator.equals("*")) {
			System.out.println("곱하기 연산 " + (val1 * val2));
		} else if(operator.equals("/")) {
			System.out.printf("나누기 연산 %.2f", (val1 / val2));
		}
			
		
	}
	
}
