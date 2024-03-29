package KangJeongTaek.day14.P712;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		Member m1 = person.getMember1(Member :: new);
		System.out.println(m1);
		
		Member m3= person.getMember1((id) -> {
			Member m = new Member(id);
			System.out.println(m);
			return m;
		});
		
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);
	}
}
