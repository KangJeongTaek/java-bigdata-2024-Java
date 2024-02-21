package KangJeongTaek.day01.Type;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10; // 컴파일러는 자동으로 정수 리터럴을 int 타입으로 간주하나, 10은 int 범위 내의 정수이므로 에러가 발생하지 않음. 다만 6번행처럼 써주는 게 좋다. 
		long var2 = 20L; 
		// long var3 = 1000000000000; < 컴파일러는 int 타입으로 간주하기 때문에 에러 발생
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		//System.out.println(var3);
		System.out.println(var4);
	}
}
