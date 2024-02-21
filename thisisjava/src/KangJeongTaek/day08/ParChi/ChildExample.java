package KangJeongTaek.day08.ParChi;

public class ChildExample {
	public static void main(String[] args) {
	Child child = new Child();
	
	
	Parent parent = child;
	
	parent.method1();
	parent.method2();
	//parent.method3(); 는 호출 불가능( 자식 개체에만 있는 메소드이기 때문에)
	}
}
