package KangJeongTaek.day08.ParentChild;


class Super{ //부모 클래스
	String superField;
	public void getSuperField() {
		System.out.println("superField :" + superField);
	}

	public void setSuperField(String superField) {
		this.superField = superField;
	}
	public void overrideMethod() {
		System.out.println("나는 Super 객체의 메소드");
	}
}
class Sub extends Super{ // 자식 클래스
	String subField;
	public void getSubField() {
		System.out.println("subField : " + subField);
	}
	public void setSubField(String subField) {
		this.subField = subField;
	}
	@Override
	public void overrideMethod() {
		System.out.println("나는 Sub 객체의 메소드");
	}
}
public class Upcasting {
	public static void main(String[] args) {
		Super s = new Sub(); //부모 타입의 참조 변수에 자식 개체의 주소를 넣는다. (업케스팅)
		s.setSuperField("Parent");
		s.getSuperField();
		s.overrideMethod();
	}
}
