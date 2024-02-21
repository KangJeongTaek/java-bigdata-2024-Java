package Org.KangJeongTaek.myClass;

public class MyClass {
	/* 클래스 구성 멤버 : 멤버변수 + 멤버함수 + 생성자 */
	//=================== 멤버 변수
	
	String name;
	int age;
	
	
	//=================== 멤버 함수
	MyClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	void printMyClass() {
		System.out.println("나의 이름 : " + name + " 나의 이름 : " + age);
	}
	
	
}
