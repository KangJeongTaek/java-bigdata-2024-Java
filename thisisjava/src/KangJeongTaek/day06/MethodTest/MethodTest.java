package KangJeongTaek.day06.MethodTest;

public class MethodTest {
	int num;
	String name;
	
	public static void method1() { //method1의 선언, 정의(입력x, 출력x)
		System.out.printf("method1() 실행\n");
	}
	
	public static void method2(int num) {
		System.out.println("나는 입력 하나를 같는 메소드입니다. 입력값은 " + num);
	}
	public static int method3(int num) {
		System.out.println("나는 입력과 출력을 가지는 메소드입니다. 입력 : " + num);
		return num + 3; //출력이 있는 경우는 return이 온다.
	}
	
	public static void main(String[] args) {
		method1(); //호출 시키면 실행이 된다.
		method2(343);
		int n = method3(1);
		System.out.println("출력값 : " + n);
	}
}
