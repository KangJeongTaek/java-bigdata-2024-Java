package KangJeongTaek.day08.Instanceof;

public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		/*if (person instanceof Student){
		 * Student student = (Student) person;
		 * System.out.println("studentNO " + student.studentNo);
		 * syudent.study();
		 */
		
		if(person instanceof Student student) {
			System.out.println("studentNo : " + student.studentNo);
			student.study();
		}
	}
		public static void main(String[] args) {
			Person p1 = new Person("강정택");
			personInfo(p1);
			
			System.out.println();
			
			Person p2 = new Student("강정" , 10);
			personInfo(p2);
			
			System.out.println(p2 instanceof Person);
		}
	
}
