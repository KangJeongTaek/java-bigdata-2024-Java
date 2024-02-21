package KangJeongTaek.day10.nestedClass;

public class AExample {
	public static void main(String[] args) {
		// A 객체 생성
		A a = new A();

		// A의 인스턴스 메소드 호출
		a.useB();

		// A의 인스턴스 멤버 클래스 B의 객체 생성
		A.B b = a.new B();
		System.out.println(b.toString());
	}
}