package KangJeongTaek.day09.SealedInterface;

public class SealedExample {
	public static void main(String[] args) {
		ImplClass impl = new ImplClass();
		
		//boolean instance = impl instanceof ImplClass; <- 객체 intanceof 타입 instance변수에는 true가 저장된다.
		InterfaceA a = impl;
		a.methodA();
		System.out.println();
		
		InterfaceB b = impl;
		b.methodA();
		b.methodB();
		System.out.println();
		
		InterfaceC c = impl;
		c.methodA();
		c.methodB();
		c.methodC();
	}
}
