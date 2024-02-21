package KangJeongTaek.day11.System;

public class ErrExample {
	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("I00");
		}catch(Exception a) {
			System.err.println("[에러내용]");
			System.err.println(a.getMessage());
		}
		
	}
}
