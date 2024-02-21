package KangJeongTaek.day08.Sealed;

public class SealedExample {
	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		Manager n = new Manager();
		Director d = new Director();
		
		p.work();
		e.work();
		n.work();
		d.work();
	}
}
