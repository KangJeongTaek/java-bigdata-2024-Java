package KangJeongTaek.day06.Class.Calculator;

public class CalculatorExample {
	public static void main(String[] args){
	Calculator1 myCalc =  new Calculator1();

	myCalc.powerOn();
	int result1 = myCalc.plus(5, 6);
	System.out.println("reuslt1 : " + result1);
	int x = 10;
	int y = 4;
	double result2 = myCalc.divide(x, y);
	System.out.println("result2 : " + result2);
	
	myCalc.poweroff();
	}
}