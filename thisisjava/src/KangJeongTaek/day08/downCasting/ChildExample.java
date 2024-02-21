package KangJeongTaek.day08.downCasting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); //자동 타입 변환
		parent.superField1 = "data1";
		parent.superMethod1();
		parent.superMethod2();
		//parent.subField1; << 불가능
		//parent.subMethod1(); << 불가능
		
		Child child = (Child) parent; //강제 타입 변환 (자동 타입 변환된 부모 타입의 참조변수를 강제로 자식 타입으로 변환)
		child.subField = "data2"; //현재 자식 타입의 참조 변수에 자식 타입의 부모 객체가 들어가 있다.
		child.subMethod1();
		
	}
}
