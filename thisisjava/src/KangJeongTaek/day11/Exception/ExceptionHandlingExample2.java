package KangJeongTaek.day11.Exception;

public class ExceptionHandlingExample2 {
	public static void main(String[] args) {
		String[] array = {"100","i00",null,"200"};
		for(int i = 0;i<=array.length;i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			}catch(ArrayIndexOutOfBoundsException e ) {
				System.out.println(e.getMessage());
			}catch(NullPointerException|NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
