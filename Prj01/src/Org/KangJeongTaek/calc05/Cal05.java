package Org.KangJeongTaek.calc05;

public class Cal05 {
	int a;
	int b;


	Cal05(int num1,int num2){
		a = num1;
		b = num2;
	 }
	void plus(){
		int answer = a + b;
		System.out.println("덧셈은 " + answer);
	}
	void minus () {
		int answer= a- b;
		System.out.println("뺄셈은 " + answer);
	}
	void multiple() {
		int answer =a*b;
		System.out.println("곱셈은 " + answer);
	}
	void divide(){
		double answer = (double) a / b;
		System.out.printf("나눗셈은 %.2f", answer);
	}
	
}
