package KangJeongTaek.day02.PrintTest;


public class PrintTest {
	public static void main(String[] args) {
		String name = "강정택";
		int age = 29;
		
	
		System.out.println("나의 이름은 " + name + "입니다.\n나이는 " + age  + "세입니다.");
		System.out.printf("나의 이름은 %s이고 나이는 %d입니다.", name, age);
		//%s < 문자열 %d < 정수 %10.2f < 정주 7자리 + 소수점 + 소수 2자리. 왼쪽 빈자리 공백
	}
}
