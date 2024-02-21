package KangJeongTaek.day13.Thread.P697;

public class Cal implements Calculable{
	@Override
	public int calculate(int x,  int y) {
		int result = x+y;
		System.out.println(result);
		return result;
	}
	
}
