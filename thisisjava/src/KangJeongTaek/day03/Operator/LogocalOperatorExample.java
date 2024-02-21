package KangJeongTaek.day03.Operator;

public class LogocalOperatorExample {
	public static void main(String[] args) {
		//int charCode = 'A';
		int charCode = 'a';
		//int charCode = '5';
		
		if ( (65<=charCode) & (charCode<=90)){
			System.out.println("대문자이군요."); //charCode의 정수값이 65 이상 90 이하면 "대문자이군요." 출력
		}
		if( (97<=charCode) && (charCode<=122)) {
			System.out.println("소문자이군요."); //charCode의 정수값이 97 이상 122 이하면 "소문자이군요." 출력
		}
		if( (48<=charCode) && (charCode<=57)) {
			System.out.println("0~9 숫자이군요."); //charCode의 정수값 48이상 57이하면 "0~9 숫자이군요." 출력
		}
		
		
		int value = 6;
		// int value = 7;
		
		if( (value%2 == 0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요."); //value를 2로 나누었을 때 나머지가 0이거나 value를 2로 나누었을 때 나머지가 0이면
			
			
		}
		
		boolean result = (value%2==0) ||(value%3==0);
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니군요."); //result가 false라면 = 2나 3으로 나누었을 때 나머지가 0이 아니라면
		}
		
	}
}
