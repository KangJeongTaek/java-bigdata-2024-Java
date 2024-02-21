package KangJeongTaek.day14.P710;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		//String 클래스 안에 있는 compareToIgnoreCase 인스턴스 메소드
		person.ordering(String :: compareToIgnoreCase);
		
		
		person.ordering((a,b) -> {
			int result = a.compareToIgnoreCase(b);
			return result;
		});
	}
}
