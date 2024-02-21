package KangJeongTaek.day03.LoopStatement;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0; //누적 시키는 변수는 반드시 0으로 초기화 해야 한다.
		int i;
		
		for(i=1 ; i<=100; i++) {
			sum+= i;
		}
		
		System.out.println("1~" + (i-1) + "합 : " + sum);
	} 
}
