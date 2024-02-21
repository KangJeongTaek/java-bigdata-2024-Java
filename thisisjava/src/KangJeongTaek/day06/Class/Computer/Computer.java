package KangJeongTaek.day06.Class.Computer;

public class Computer {
	int sum(int...values) { //가변길이 매개변수는 자동으로 배열 형태로 생성한다. 출력은 int 타입
		int sum =0;
		
		for(int i = 0; i< values.length; i++) { //배열의 인자들의 합을 구하는 공식 
			sum += values[i];
		}
		return sum; //출력으로 들어갈 값
		}
	
}

