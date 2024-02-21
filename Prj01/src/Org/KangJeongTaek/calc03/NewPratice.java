package Org.KangJeongTaek.calc03;

import java.util.Scanner;

public class NewPratice {
	public static void main(String[] args) {
		boolean run = true;
		boolean run2 = true;
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {
		System.out.print("첫 번째 값을 입력하세요:");
		num1 = sc.nextInt(); //첫 번째 정수값 저장
		
		System.out.print("두 번째 값을 입력하세요:");
		num2 = sc.nextInt(); //두 번째 정수값 저장
		
		sc.nextLine(); // sc에 남아있는 엔터값 버림
		
		Inner:while(run2) {
			
			System.out.print("연산자를 입력하세요:");
		
		 
		String operator = sc.nextLine(); //연산자를 키보드로 입력받아 저장
		switch(operator) { //저장 받은 연산자가 무엇인지 확인하고 맞는 계산을 실행하는 과정
			case "+":
				System.out.println("덧셈 : " + (num1 + num2));
				break Inner;
			case "-":
				System.out.println("뺄셈 : " + (num1 - num2));
				break Inner;
			case "*":
				System.out.println("곱셈 : " + (num1 * num2));
				break Inner;
			case "/":
				System.out.printf("나눗셈 : %.1f\n", (num1/(double)num2));
				break Inner;
			default: //연산자가 아닌 다른 문자열이 입력되면 실행될 것
				System.out.println("올바른 연산자를 넣어주세요.");
				run2 = true;
				continue Inner; //Inner while의 첫 부문으로 돌아가 실행하시오.
				
				
		}
		}
		System.out.println("종료하실려면 q를 입력해주세요."); //연산이 끝난 후 출력될 문자
		String str1 = sc.nextLine();
			if(str1.equals("q")) { //q를 입력받는다면 실행
				run = false; // Outer while 문을 빠져나오시오. = 계산기를 더 이상 실행하지 마시오.
				System.out.println("계산기를 종료합니다."); 
				
			} else {
				System.out.println("다른 값을 입력하셨습니다. 계산기를 다시 실행합니다."); //q가 아니라면 출력될 문자열
			} //run = true이기 때문에 while 문을 다시 실행한다.
			}
		
		sc.close();
	}
}

