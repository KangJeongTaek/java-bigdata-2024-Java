package Org.KangJeongTaek.calc05;

import java.util.Scanner;

public class Cal05Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번 정수를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.print("2번 정수를 입력하세요. : ");
		int num2 = sc.nextInt();
		Cal05 cal = new Cal05(num1, num2);

		cal.plus();
		cal.minus();
		cal.multiple();
		cal.divide();
	
					
			}
}

