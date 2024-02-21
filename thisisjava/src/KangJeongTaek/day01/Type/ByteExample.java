package KangJeongTaek.day01.Type;

public class ByteExample {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; <에러가 뜬다. byte의 값 안에 들어가는 범위는 -128 ~ 127이기 때문이다. 8bit = 2^8 = 256개의 가지 수
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		//System.out.println(var6);
		
	}
}
