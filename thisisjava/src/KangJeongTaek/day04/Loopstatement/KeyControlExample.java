package KangJeongTaek.day04.Loopstatement;
import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) { //현재 run 변수에 들어가 있는 값은 true이다.
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.print("선택: ");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("속도를 증가합니다.");
				System.out.println("현재 속도는 " +speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("속도를 감소합니다.");
				System.out.println("현재 속도는 " + speed);
			} else if(strNum.equals("3")) {
				run = false;
				//break; < 브레이크로 문으로 빠져나오는 것도 가능하다.
			} else {
				System.out.println("1,2,3 중에 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		
	}
}
