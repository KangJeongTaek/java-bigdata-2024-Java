package KangJeongTaek.day02.Operator;

public class InCreaseDecreaseOpertaorExample {
	public static void main(String[] args) {
	int x = 10;
	int y = 10;
	int z;
	
	x++; //후위 연산자 < 다른 연산 실행 후 x 값 1증가
	++x; //전위 연산자  < x 값을 1 증가 시킨 후 연산 실행
	System.out.println("x=" + x); // x는 12이다.
	
	System.out.println("-----------------");
	y--; // 후위 연산자
	--y; // 전위 연산자
	System.out.println("y= " + y); // y는 8이다.
	
	System.out.println("-----------------");
	z = x++; //z는 12이다.
	System.out.println("z= " + z); //z는 12이다.
	System.out.println("x= " + x); //x는 13이다.
	
	System.out.println("-----------------");
	z = ++x; //z는 14이다.
	System.out.println("z= " + z); //z는 14
	System.out.println("x= " + x); //x는 14
	
	System.out.println("-----------------");
	z= ++x + y++; //15 + 8 z = 23 / x = 15 / y = 9
	System.out.println("z= " + z); //z = 23
	System.out.println("x= " + x); //x = 15
	System.out.println("y= " + y); //y = 9
	
	}
}
