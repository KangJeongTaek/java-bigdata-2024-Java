package KangJeongTaek.day09.InstanceofExample;

public class InstanceofExample {
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		ride(taxi);
		System.out.println();
		ride(bus);
	}
		public static void ride(Vehicle vehicle) {
			if(vehicle instanceof Bus bus) {
				bus.checkFare();
			}
			/*if(vehicle instanceof Bus){
				//Bus bus = (Bus) vehicle;
				//bus.checkFare();
			//}*/
			{
		vehicle.run();
		}
	}
}
