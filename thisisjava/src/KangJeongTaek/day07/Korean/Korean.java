package KangJeongTaek.day07.Korean;

public class Korean {
	final String nation = "대한민국"; //nation 필드에 초기화를 진행히면 final 키워드
	final String ssn; //ssn필드에 초기값은 주지 않고 fianl 선언
	String name;
	Korean(String ssn, String name) {
		this.ssn = ssn; //ssn이라는 변수의 값이 ssn이라는 필드에 저장된다.
		this.name = name;
	}
}
