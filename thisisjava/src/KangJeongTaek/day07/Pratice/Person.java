package KangJeongTaek.day07.Pratice;

public class Person {
	String name; //필드 선언
	String gender; //필드 선언
	
	Person(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	void myInfo() {
		System.out.println("나의 이름은 " + name + "이고 " + gender +"입니다.");
	}

		
}
	


