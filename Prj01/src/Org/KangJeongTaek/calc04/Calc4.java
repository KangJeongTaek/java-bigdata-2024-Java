package Org.KangJeongTaek.calc04;
import java.util.Scanner;
//메소드 생성을 연습합니다.
public class Calc4 {
	public static void Sum(int a,int b) {
		System.out.println("덧셈 : " + (a + b));
	}
	public static void Minus(int a, int b) {
		System.out.println("뺄셈 : " + (a + b));
	}
	public static void Multiple(int a, int b) {
		System.out.println("곱셈 : " + (a * b));
	} 
	public static void Division(int a, int b) {
		System.out.printf("나눗셈 : %.1f\n" ,(a / (double) b));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("끝내시려면 q를 입력하세요.");
			String quit = sc.nextLine();
			if(quit.equals("q")){
				break;
			}else {
				int val1 = 0;
				int val2 = 0;
				System.out.print("정수를 입력하시오.");
				val1 = sc.nextInt();
				System.out.print("정수를 입력하시오.");
				val2 = sc.nextInt();
				
				sc.nextLine();
				System.out.println("연산자를 입력하시오.");
				String operator = sc.nextLine();
				
				if(operator.equals("+")) {
					Sum(val1,val2);
				}else if(operator.equals("-")) {
					Minus(val1,val2);
				}else if(operator.equals("*")) {
					Multiple(val1,val2);
				}else if(operator.equals("/")) {
					Division(val1,val2);
				}else {
					continue;
				}
				
			
			}
		
		}
		sc.close();
	}
}
