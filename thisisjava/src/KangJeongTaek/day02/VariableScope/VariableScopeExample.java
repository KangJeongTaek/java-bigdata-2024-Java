package KangJeongTaek.day02.VariableScope;
//int v2; 객체는 클래스 안에 존재해야 한다. 따라 자바에서 이런 문법은 사용할 수 없다.
public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2= v1 - 10;
			System.out.println(v2);
		}
		// int v3 = v1 + v2 +5; v2는 if 블록 안 에서만 사용되는 변수이므로 에러 발생
	}
}
