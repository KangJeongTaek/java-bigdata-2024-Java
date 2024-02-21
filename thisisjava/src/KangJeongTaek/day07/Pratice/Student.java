package KangJeongTaek.day07.Pratice;

public class Student extends Person{


	int sid; //필드 선언
	String shool; //필드 선언
	int grade; //필드 선언
	Student(String name, String gender,int sid, String shool, int grade) { //자식의 생성자
		super(name, gender); //부모 생성자 호출
		this.sid = sid;
		this.shool = shool;
		this.grade = grade;
	}
	
	@Override
	void myInfo() { //메소드 오버라이딩
		System.out.println("나의 이름은 " + name + "이고 "+ shool +"에 재학중인 " + grade + "년이고 " + sid + "학번 " + name + "입니다.");
	}

	  
}
