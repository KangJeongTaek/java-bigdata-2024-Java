package KangJeongTaek.day03.LoopStatement;

import java.util.Scanner;
public class MultiplicationTableExample {
	public static void main(String[] args){
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.printf("몇 단을 출력할까요?");
		int var1 = sc.nextInt();
		for(i = 1 ; i<=9 ; i++) {
			if(var1 == i) { // 출력하고자 하는 단의 값과 반복하는 i가 같다면 출력
			System.out.println("*** " + i + "단 ***");
			for(j = 1; j<=9; j++) {
				System.out.println(i +" x " + j + " = " + (i *j) );
			}
			}
		}
		System.out.println("*************");
		
		sc.close();
	}
}
