package Org.KangJeongTaek.calc06;


public class Cal06Example {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		double x= 1.2;
		double y = 2.4;
	
		plus(a,b);
		plus(x,y);
		plus(a);
		plus(a,x);
		plus(x,a);
	}
	public static void plus(int a, int b) {
		int res = a +b;
		System.out.println(a + b);
	}
	public static void plus(double a,double b) { //메소드 오버로딩
		double res = a+b;
		System.out.printf("%.2f\n", a+b);
	}
	public static void plus(int a) { //메소드 오버로딩
		int res = a;
		System.out.println(res);
	}
}

