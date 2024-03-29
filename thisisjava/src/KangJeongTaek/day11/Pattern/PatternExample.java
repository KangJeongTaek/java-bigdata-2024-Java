package KangJeongTaek.day11.Pattern;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "02|010-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 다릅니다.");
		}
		
		regExp = "\\w+@\\w+\\.(\\w+)";
		data = "dfgddjd@naver.com";
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 다릅니다.");
		}
	}
}
