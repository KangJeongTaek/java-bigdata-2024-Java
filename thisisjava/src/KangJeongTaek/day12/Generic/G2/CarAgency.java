package KangJeongTaek.day12.Generic.G2;

public class CarAgency implements Rentable{
	@Override
	public Car rent() {
		return new Car();
	}
}
