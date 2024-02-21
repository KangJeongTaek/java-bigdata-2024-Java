package KangJeongTaek.day10.nestedClass;

public class A1 {

	// 인스턴스 멤버 클래스
	class B1 {
	}

	// 인스턴스 필드 값으로 B1객체 대입
	B1 field = new B1();

	// 생성자
	A1() {
		B1 b = new B1();
	}

	// 인스턴스 메소드
	void method() {
		B1 b = new B1();
	}
}
