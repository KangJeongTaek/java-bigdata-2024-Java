package KangJeongTaek.day04.String;

public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.printf("%s\n",oldStr);
		System.out.printf("%s",newStr);
	}
}
