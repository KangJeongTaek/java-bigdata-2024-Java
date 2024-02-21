package KangJeongTaek.day04.Loopstatement;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		int sum2 = 0;
		
		for(i=1; i<=100;i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1 + "합 :" )+ sum);
		
		i = 0;
		System.out.println("-------------------");
		while(i <=100) {
			sum2 += i;
			i++;
		}
		System.out.println("1~" + (i-1 + "합 :") + sum2);
	}
	
}
