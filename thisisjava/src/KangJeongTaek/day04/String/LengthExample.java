package KangJeongTaek.day04.String;

public class LengthExample {
	public static void main(String[] args) {
		String num = "9610031111111";
		
		int length = num.length();
		int var1 = (int)(num.charAt(6));
		System.out.println(var1);
		if(length == 13) {
			System.out.println("정상입니다.");
		}else {
			System.out.println("13자리수를 입력하세요");
		}
	}
}
