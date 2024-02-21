package KangJeongTaek.day01.Type;

public class IntergerLiteralExample {
	public static void main(String[] args) {
		int var1 = 0b1011; // 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0
		int var2 = 0206;   // 2*8^2 + 0*8^1 + 6*8^0
		int var3 = 365;		// 3*10^2 + 6*10^1 + 5*10^0
		int var4 = 0xB3;	// 12*16^1 + 3*16^0
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
	}
	
}
