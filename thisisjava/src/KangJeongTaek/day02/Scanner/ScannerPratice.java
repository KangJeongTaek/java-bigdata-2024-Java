package KangJeongTaek.day02.Scanner;

import java.util.InputMismatchException; //입력 타입 미스 오류
import java.util.Scanner; //스캐너

public class ScannerPratice {
	public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	int age = 0;
	String name;
	System.out.print("이름을 입력하시오 : ");
	name = sc.nextLine();
	System.out.print("나이를 입력하시오 : ");
	while(true) {
		
	try{
		age = sc.nextInt(); //sc의 입력값(정수를 age라는 변수에 넣어라)
		break;
	}
	
	catch(InputMismatchException ime) { //타입이 다르다는 에러가 뜬다면 이 구문을 실행하라.
		System.out.println("숫자를 입력해주십시오.");
		System.out.println("");
		sc = new Scanner(System.in); //다시 입력값을 받아서 sc에 넣어라.
		} 
	}
	System.out.println("이름은 " + name + "\n나이는 " + age);
	System.out.println("종료합니다.");
	sc.close(); //입력을 다 받으면 입력 스트림을 닫아야 한다.
	}
}
