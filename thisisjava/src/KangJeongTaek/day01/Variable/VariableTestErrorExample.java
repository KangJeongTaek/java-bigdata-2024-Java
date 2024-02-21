package KangJeongTaek.day01.Variable;

public class VariableTestErrorExample {
	public static void main (String[] args) {
		int value;	//value 변수 선언
		/* int result = value + 10; << 	value 변수의 저장된 값과 10을 더해서
								 		result 라는 변수에 넣어라 
								 		value 라는 변수가 초기화 안 됐기에
								 		아직 메모리에 할당되지 않았다.
								 		따라 value 변수값에 접근할 수 없다. */
		
		// System.out.println(result); < 마찬가지로 value 라는 변수가 초기화 되지 않았다.
		// 									따라 메모리에 할당되지 않은 상태.
		
	}
}
