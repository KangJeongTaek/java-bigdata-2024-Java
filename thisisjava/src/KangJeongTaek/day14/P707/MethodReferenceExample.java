package KangJeongTaek.day14.P707;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.action(Computer :: staticMethod);
		
		person.action((x, y) -> {
			double result = x-y;
			return result;
		});
		Computer computer = new Computer();
		
		person.action(computer::instanceMethod);
		
	}
}
