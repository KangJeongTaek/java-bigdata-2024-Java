package KangJeongTaek.day08.Instanceof;

public class Student extends Person{
	

	public int studentNo;

	public Student(String name,int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	@Override
	public void walk() {
		System.out.println("학생은 뜁니다.");
	}
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
