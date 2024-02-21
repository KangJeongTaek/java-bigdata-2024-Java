package Org.KangJeongTaek.Book;

public class EbooksClass extends BookClass {
	private String supperDevices;

	EbooksClass(String title, String author, int price, String publisher, String supperDevices) {
		super(title, author, price, publisher);
		this.supperDevices = supperDevices;
	}

	public String deviceInfo() {
		return supperDevices;
	}

}
