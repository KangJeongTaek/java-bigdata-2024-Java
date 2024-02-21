package Org.KangJeongTaek.Book;

public class PaperBookClass extends BookClass {
	private int size;

	PaperBookClass(String title, String author, int price, String publisher, int size) {
		super(title, author, price, publisher);
		this.size = size;
	}

	public int sizeInfo() {
		return size;
	}

}
