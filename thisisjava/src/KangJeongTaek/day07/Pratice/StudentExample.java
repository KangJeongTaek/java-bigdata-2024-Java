package KangJeongTaek.day07.Pratice;

public class StudentExample {
	public static void main(String[] args) {
		Student me = new Student("강정택", "남자", 201510147, "부경대학교", 4); //자식 객체 생성
		Person my = new Person("강정택", "남자"); // 부모 객체 생성
		me.myInfo();
		my.myInfo();
		
		
		
		
	}
}
