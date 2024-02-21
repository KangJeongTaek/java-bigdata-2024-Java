package KangJeongTaek.day02.Scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); //클래스 타입과 함수명이 같으면 생성자이다.
	
	
	
	System.out.print("X 값 입력: ");
	String strX = sc.nextLine(); //엔터가 입력될 때까지의 값을 strX라는 변수에 저장한다.
	int x = Integer.parseInt(strX); //strX는 문자열 자료형이므로 강제로 double 형으로 변환한다.
	
	
	System.out.print("y 값 입력: ");
	String strY = sc.nextLine();
	int y= Integer.parseInt(strY);
	
	int result = x + y;
	System.out.println("x + y: " + result); //result는 int 타입이다.
	System.out.println();
	
	while(true){
		System.out.print("입력 문자열: ");
		String data = sc.nextLine();
		if(data.equals("q")) {
			break;
		}
		System.out.println("출력 문자열: " + data);
		System.out.println();
	}
	System.out.println("종료");
	sc.close();
	}
}


