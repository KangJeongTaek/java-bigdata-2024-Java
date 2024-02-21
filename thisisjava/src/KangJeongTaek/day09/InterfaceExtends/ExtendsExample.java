package KangJeongTaek.day09.InterfaceExtends;

public class ExtendsExample {
	public static void main(String[] args) {
		
		//구현 객체 생성 후 InterfaceA 타입에 저장 -> InterfaceA에 있는 멤버들만 사용 가능
		InterfaceA a = new InterfaceCImpl();
		a.methodA();
		//a.methodB(); InterfaceA에는 methodB가 없다.
		//a.methodC(); InterfaceA에는 methodC가 없다.
		System.out.println("");
		
		//구현 객체 생성 후 InterfaceB 타입에 저장 -> InterfaceB에 있는 멤버들만 사용 가능
		InterfaceB b = new InterfaceCImpl();
		//b.methodA(); InterfaceB에는 methodA가 없다.
		b.methodB();
		//b.methodC(); InterfaceB에는 methodC가 없다.
		System.out.println("");
		
		//InterfaceC는 InterfaceA와 InterfaceB를 상속 받았기에 A와 B에 있는 멤버들이 사용가능하다.
		InterfaceC c = new InterfaceCImpl();
		c.methodA();
		c.methodB();
		c.methodC();
	}
}
