package KangJeongTaek.day03.ControlStatement;
import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요. ");
		score = sc.nextInt();
		
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");			
		} else if(score >= 80){			
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>= 70) {
			System.out.println("점수가 80보다 작습니다.");
			System.out.println("등급은 C입니다.");
		} else if(score>=60){
			System.out.println("점수가 70보다 작고 60보다 큽니다.");
			System.out.println("등급은 D입니다.");
		} else {
			System.out.println("낙제입니다.");
		}
		sc.close();
	}
}
