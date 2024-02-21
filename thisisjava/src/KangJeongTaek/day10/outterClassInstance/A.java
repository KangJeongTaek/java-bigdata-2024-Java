package KangJeongTaek.day10.outterClassInstance;

public class A {
	// A 인스턴스 필드
	String field = "A-field";

	// A 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}

	// 인스턴스 멤버 클래스
	class B {
		// B 인스턴스 필드
		String field = "B-field";

		// B 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}

		// B 인스턴스 메소드
		void print() {
			System.out.println(this.field); // this(즉 객체B를 가리킨다.)
			this.method();

			System.out.println(A.this.field); // A.this (즉 객체A를 가리킨다.)
			A.this.method();
		}

	}

	// A객체의 인스턴스 메소드
	void useB() {

		// B객체 생성
		B b = new B();
		// B객체의 print 메소드 호출
		b.print();
	}
}
