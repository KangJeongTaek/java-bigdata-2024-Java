package KangJeongTaek.day10.outterClass;

public class A {

	// 인스턴스 필드
	int field1;

	// 인스턴스 메소드
	void method1() {
	}

	// 정적 필드
	static int field2;

	// 정적 메소드
	static void method2() {
	}

	// 인스턴스 멤버 클래스
	class B {
		void method() {
			// A의 인스턴스 필드와 메소드 사용
			field1 = 10;
			method1();

			// A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}

	// 정적 멤버 클래스
	static class C {
		void method() {
			// A의 인스턴스 필드와 메소드 사용 | 바깥 객체가 없어도 사용 가능해야 하므로 바깥 클래스의 인스턴스 필드와 인스턴스 메소드는 사용하지 한다.
			// field1 = 10 ; (x)
			// method1();(x)

			// A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}
}
