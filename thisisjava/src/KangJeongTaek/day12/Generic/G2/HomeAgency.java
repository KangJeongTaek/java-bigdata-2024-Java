package KangJeongTaek.day12.Generic.G2;

public class HomeAgency implements Rentable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}
}
