package Org.KangJeongTaek.calc01;

import java.util.Scanner;
public class CalcClass01 {
	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오.");
		String name = sc.nextLine();
		System.out.println("");
		System.out.println("이름은 " + name + "입니다.");
		
		System.out.println("");
		System.out.println("나이를 입력하시오.");
		int age = sc.nextInt();
		System.out.println("");
		System.out.println("나이는 " + age + "살입니다.");
		
		sc.nextLine();
		System.out.println("주소를 입력하시오.");
		String ad = sc.nextLine();
		System.out.println("주소는 " + ad);
		sc.close(); */
		int val1 = 0;
		int val2 = 0;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1번을 입력하시오.");
		
			
		val1 = sc.nextInt();
		
		System.out.println("정수 2번을 입력하시오.");
		val2 = sc.nextInt();
		
		
		System.out.println("두 값의 덧셈은 " + (val1 + val2));
		System.out.println("두 값의 뺄셈은 " + (val1 - val2));
		System.out.println("두 값은 곱셈은 " + (val1 * val2));
		System.out.println("두 값의 나눗셈은 "+ ((double)val1 / val2));
		
		sc.close();
	} 
}
