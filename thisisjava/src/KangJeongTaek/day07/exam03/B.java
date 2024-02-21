package KangJeongTaek.day07.exam03;

public class B {
	public void method() {
		A a = new A();
		
		
		a.field1 = 1; // public 필드 접근 제한 사용 가능
		a.field2 = 1; // default 필드 접근 제한 사용 가능
		//a.field3 = 1; private 필드 접근 제한으로 사용 불가
		
		a.method1(); //public 메소드 접근 제한 사용 가능
		a.method2(); //default 메소드 접근 제한 사용 가능
		//a.method3(); private 메소드 접근 제한으로 사용 불가
	}
}
