package KangJeongTaek.day09.Type;
interface A{

}
public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a;
		a = b; //B 객체가 -> A인터페이스 타입으로 자동 변환
		a = c; //C 객체가 -> A인터페이스 타입으로 자동 변환
		a = d; //D 객체가 -> A인터페이스 타입으로 자동 변환
		a = e; //E 객체가 -> A인터페이스 타입으로 자동 변환
		
		D f = (D) a; //강제 타입 변환
		
		
	}
}

class B implements A{

}
class C implements A{
		
}

class D extends B{
		
}
class E extends C{
		
}
