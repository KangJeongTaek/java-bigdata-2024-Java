package KangJeongTaek.day02.Type;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); //Integer라는 객체 안에서 parseInt라는 메서드를 호출
		double value2 = Double.parseDouble("3.14"); //Double이라는 객체 안에서 parseDouble이라는 메서드를 호출
		boolean value3= Boolean.parseBoolean("true");
		Integer value11 = Integer.valueOf("10"); //기본 타입형이 대문자로 시작하면 객체로 변환된 것임
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10); //10이라는 정수를 강제로 문자열로 변환
		String str2 = String.valueOf(3.14); //3.14라는 실수를 강제로 문자열로 변환
		String str3 = String.valueOf(true); //true라는 boolean 타입을 강제로 문자열로 변환
		
		//int val1 = 10;
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		System.out.println("value11: " +value11);
	}
}
