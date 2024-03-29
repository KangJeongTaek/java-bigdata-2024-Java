package KangJeongTaek.day14.P702;

public class LambdaExample {
	public static void main(String[] args) {

		Person person = new Person();

		person.action1((name, job) -> {
			System.out.println(name + "이" + job + "을 합니다.");
		});
		
		person.action1((work, job) -> System.out.println(work + "이" + job + "을 합니다."));

		person.action2((content) -> {
			System.out.println(content + "라고 말합니다.");
		});
		
		person.action2((content) -> System.out.println(content + "라고 말합니다."));
	}
}
