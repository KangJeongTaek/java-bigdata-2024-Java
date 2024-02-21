package KangJeongTaek.day05.Packtest;

public class ArrTest01 {
	public static void arrPrint(int[] a /* 매개 변수에는 변수 선언과 똑같이 적는다 */) {
		for(int i =0;i<a.length;i++) {
			System.out.println("a[" + i + "]" + a[i]);
		}
	}
	public static void main(String[]  args) {
		int[] ary = {10,20,30,40,50};
		for(int i = 0;i<ary.length;i++) {
			System.out.println("ary[" +i+ "]" + ary[i]);
			
			
		}
		
		// 배열 선언과 초기화가 분리되면 명시적으로 객체생성(new 연산자를 통해서 배열객체 생성)
		int[] ary1; //참조 배열 선언
		ary1 = new int[]{50,60,70,80,90,100}; //초기화
		for(int i =0;i<ary1.length;i++) {
			System.out.printf("ary1[%d] %d\n",i,ary1[i]);
		}
		arrPrint(new int[]{1,2,3}); //새로운 객체를 생성해야 한다. Why? 배열 선언과 초기화가 분리되어 있기에 객체를 명시적으로 생성해야 하기 때문
		arrPrint(ary); //이미 초기화가 이루어져 있기에 새로운 객체를 생성할 필요가 없다.
	}
}
