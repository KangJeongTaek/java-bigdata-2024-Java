package KangJeongTaek.day05.MultiDimension;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		int sum2 = 0;
		for(int i= 0;i<scores.length;i++) {
			sum2 += scores[i];
		}
		System.out.println("총합은 " + sum);
		System.out.printf("평균은 %.1f\n" ,(double)sum / scores.length);
		System.out.println(sum2);
		System.out.println((double)sum2/ scores.length);
	}
}
