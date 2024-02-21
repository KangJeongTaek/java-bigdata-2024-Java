package KangJeongTaek.day07.Protected1;
import KangJeongTaek.day07.Protected.A;
public class D extends A{
	public D() {
		super(); // 부모 클래스의 생성자 호출
	}
	public void method1() { 
		this.field = "value"; //부모 (A클래스)의 필드값에 접근
		this.method(); //부모 (A클래스)의 메소드 호출
	}
	
	public void method2() { //객체를 새로 만드는 방법으로는 접근할 수 없다.
		//A a = new A(); 
		//a.field = value;
		//a.method();
	}
}
