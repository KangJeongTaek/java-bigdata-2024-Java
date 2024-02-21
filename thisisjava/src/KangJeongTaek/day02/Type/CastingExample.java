package KangJeongTaek.day02.Type;

public class CastingExample {
	public static void main (String[] args) {
		int var1 = 10;
		byte var2 = (byte) var1; //int 타입을 강제로 byte로 변환 
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int) var3; //long 타입을 강제로 int로 변환
		System.out.println(var4);
		
		int var5= 65;
		char var6 = (char) var5; //int 타입을 강제로 char로 변환
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int) var7; //double 타입을 강제로 int로 변환
		System.out.println(var8);
		
	}
}
