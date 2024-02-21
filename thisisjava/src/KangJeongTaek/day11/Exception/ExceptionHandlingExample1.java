package KangJeongTaek.day11.Exception;

public class ExceptionHandlingExample1 {
	public static void main(String[] args) {
		String[] array = {"100", "i00"};
		
		for(int i = 0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스 초과" + e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("실행에 문제가 있습니다.");
			}
		}
	}
}
