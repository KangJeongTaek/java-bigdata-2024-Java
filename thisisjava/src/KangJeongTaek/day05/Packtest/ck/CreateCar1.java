package KangJeongTaek.day05.Packtest.ck;

class Car1{
	String kind = "세단";
	String modelName;
	String carColor;
	int carYear = 2024;
}

public class CreateCar1 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		System.out.println(c1.kind);
		System.out.println(c2.kind);
	}

}
