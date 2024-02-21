package KangJeongTaek.day07.Korean;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "강정택"); //매개 변수 2개를 받는생성자 호출/
		//후 Korean 객체 생성 -> ssn 변수와 name 변수에 각각을 넣어서 ssn필드와 name필드를 초기화. 
		System.out.println(k1.toString());
		System.out.println(k1.nation); //nation과 ssn은 field 필드이기 때문에 한 번 초기화 되면 수정 불가.
		System.out.println(k1.ssn); //k1 객체의 ssn 필드에 저장된 주소의 문자열 출력
		System.out.println(k1.name);
		
		k1.name = "강규택"; //name은 final 필드가 아니기 때문에 값 수정 가능.
		
	}
}
