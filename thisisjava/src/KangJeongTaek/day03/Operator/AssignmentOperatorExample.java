package KangJeongTaek.day03.Operator;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result= " + result); //현재 result의 값은 10
		result -= 5;
		System.out.println("result= " + result); //현재 result의 값은 5
		result *= 3;
		System.out.println("result= " + result); //현재 result의 값은 15
		result /= 5;
		System.out.println("result= " + result); //현재 result의 값은 3
		result %= 3;
		System.out.println("result= " + result); // 현재 result의 값은 0
		
		int result1 = 100;
		int res = 0;
		res = (result1 == 100) ? 1 : 0;
		System.out.println(res);
	}
}
