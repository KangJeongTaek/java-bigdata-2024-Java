package KangJeongTaek.day10.nestedStaticClass;

public class A1 {

	// 정적 멤버 클래스
	static class B1 {
	}

	// 인스턴스 필드 값으로 B1 객체 대입
	B1 field1 = new B1();

	// 정적 필드 값으로 B1 객체 대입
	static B1 field2 = new B1();

	// 생성자
	A1() {
		B1 b1 = new B1();
	}

	// 인스턴스 메소드
	void method1() {
		B1 b1 = new B1();
	}

	// 정적 메소드
	static void method2() {
		B1 b1 = new B1();
	}
}
