package KangJeongTaek.day09.Practice8;

public class Example {
	public static void main(String[] args) {
		action(new B());
		action(new C());
		
	}
	public static void action(InterfaceA a) {
		if(a instanceof C c) {
			c.method2();
		}
	}
}
