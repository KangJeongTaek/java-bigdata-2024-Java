package KangJeongTaek.day05.MultiDimension;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores = {{80,90,96}, {76,88}};
		System.out.println("1차원 배열 길이(반의 수) : " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) : " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번쨰 반의 학생 수) : " + scores[1].length);
		
		
		int[][] scr = new int[2][]; //2차원 배열의 각 행의 크기만 먼저 지정할 수 있다.
		scr[0] = new int[3]; // 각 행의 요소 수가 다를 때 각 열의 크기를 지정해줌
		scr[1] = new int[4];
		scr[2] = new int[1];
		
		
		//첫 번째 반의 세 번째 학생의 점수
		System.out.println("scores[0][2] :" + scores[0][2]);
		//두 번째 반의 두 번째 학생의 점수
		System.out.println("scores[1][1] :" + scores[1][1]);
		
		
		//첫 번째 반의 평균 구하기
		int class1Sum = 0;
		for(int i = 0;i<scores[0].length;i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = class1Sum / scores[0].length;
		System.out.println("첫번 째 반의 평균 점수: " + class1Avg);
		
		//두 번째 반의 평균 구하기
		int class2Sum = 0;
		for(int i = 0; i<scores[1].length;i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = class2Sum / scores[1].length;
		System.out.println("두번 째 반의 평균 점수" + class2Avg);
		
		//총 평균 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for(int i =0; i<scores.length;i++) { //반의 개수만큼 반복
			totalStudent += scores[i].length; //(열의 개수를 모두 더함) 반의 학생수 합산
			for(int j = 0; j<scores[i].length;j++) { //해당 반의 학생 수만큼 반복
				totalSum += scores[i][j]; //해당 반의 학생의 총 점수를 구함
			}
		}
		double totalAvg =  (double)totalSum / totalStudent;
		System.out.println("전체 학생의 평균은 : " + totalAvg);
		
	}
}
