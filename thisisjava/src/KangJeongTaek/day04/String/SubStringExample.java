package KangJeongTaek.day04.String;

public class SubStringExample {
	public static void main(String[] args) {
		String num1 = "961003-1111111";
		String[] qe = num1.split("-");
		int ee= Integer.parseInt(qe[0]);
		
		System.out.println(ee);
		
		String firstNum = num1.substring(0,6);
		System.out.printf("%s\n",firstNum);
		String secondNum = num1.substring(8);
		System.out.printf("%s",secondNum);
		
	}
}
