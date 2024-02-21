package KangJeongTaek.day14.P710;

public class Person {
	public void ordering(Comparable compare) {

		String a = "홍길동";
		String b = "김길동";
		compare.compare(a, b);

		int result = compare.compare(a, b);

		if (result < 0) {
			System.out.println(a + "은" + b + "보다 앞에 옵니다.");

		} else if (result == 0) {
			System.out.println(a + "은" + b + "와 같습니다.");

		} else {
			System.out.println(a + "은" + b + "보다 뒤에 옵니다.");
		}

	}
}
