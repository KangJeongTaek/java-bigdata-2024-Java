package KangJeongTaek.day13.Thread.P697;

public class LambdaExample {
	public static void main(String[] args) {
		action((x, y) -> {
			int result = x + y;
			System.out.println(result);
			return result;
		});
		Calculable cal = new Cal();
		cal.calculate(4, 10);

		Calculable a = new Cal() {
			@Override
			public int calculate(int x, int y) {
				int result = x + y;
				System.out.println(result);
				return result;
			}
		};
		a.calculate(10, 4);
		action((x, y) -> {
			int result = x - y;
			System.out.println(result);
			return result;
		});

	}

	public static void action(Calculable calculabe) {
		int x = 10;
		int y = 4;

		calculabe.calculate(x, y);
	}
}
