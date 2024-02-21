package KangJeongTaek.day07.Overriding;

public class ComputerExample {
	public static void main(String[] args) {
		int r= 10;
		//부모 객체(Calculator)
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		//자식 객체(computer)
		Computer computer = new Computer();
		System.out.println("원 면적: " + computer.areaCircle(r));
	}
}
