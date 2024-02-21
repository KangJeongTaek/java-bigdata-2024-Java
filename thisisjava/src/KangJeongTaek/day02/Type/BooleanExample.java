package KangJeongTaek.day02.Type;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		int x = 10;
		boolean result1 = (x ==20); // false 값이 나옴
		boolean result2 = (x != 20); //true
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
	}
}
//&&는 and 라는 뜻이고, ||는 or 라는 뜻이다.