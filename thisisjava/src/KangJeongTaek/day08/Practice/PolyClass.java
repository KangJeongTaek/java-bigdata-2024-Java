package KangJeongTaek.day08.Practice;
class Car{
	Model model;
	
	void drive() {
		model.run();
	}
}
class Model{
	void run() {
		System.out.println("차가 달린다.");
	}
}

class Avante extends Model{
	@Override
	void run() {
		System.out.println("Avante가 달린다.");
	}
	
}
class Ramborghini extends Model{
	@Override
	void run() {
		System.out.println("Ramborghini가 달린다.");
	}
	
}
class Bentley extends Model{
	@Override
	void run() {
		System.out.println("Bentley가 달린다.");
	}
	
}
public class PolyClass {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.model = new Avante();
		myCar.drive();
		myCar.model = new Ramborghini();
		myCar.drive();
		myCar.model = new Bentley();
		myCar.drive();
		System.out.println("");
		
		/*Bentley a = new Bentley();
		a.run();
		Ramborghini b = new Ramborghini();
		b.run();
		Avante c = new Avante();
		c.run();*/
	}
	
}
