package KangJeongTaek.day07.exam03e;

import KangJeongTaek.day07.exam03.*;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1; //public 메소드 접근 제한으로 호출 가능
		//a.field2 = 1; default 메소드 접근 제한으로 호출 불가
		//a.field3 = 1; private 메소드 접근 제한으로 호출 불가
		
		a.method1(); //public 메소드 접근 제한으로 호출 가능
		//a.method2(); default 메소드 접근 제한으로 호출 불가
		//a.method3(); private 메소드 접근 제한으로 호출 불가
		
	}
}
