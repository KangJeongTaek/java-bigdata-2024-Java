package Org.KangJeongTaek.Book;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Bookmain {
	static List<BookClass> bookclass = new ArrayList<>();

	public static void main(String[] args) {
		Outter: while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.print("1. 도서 등록 \n2. 도서 검색 \n3. 도서 삭제\n4. 도서 확인 \n5. 도서 구입 \n0.종료\n");
			int menuInput = sc.nextInt();
			switch (menuInput) {
			case 1:
				registration();
				break;
			case 2:
				search();
				break;
			case 3:
				delete();
				break;
			case 4:
				confirmation();
				break;
			case 5:
				int totalPrice = buy();
				System.out.println("총 가격은 " + totalPrice + "입니다.");
				sc.nextLine();
				break;
			case 0:
				System.out.println("종료합니다.");
				break Outter;
			}
		}
	}

	// 도서 등록 메소드
	public static void registration() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도서 이름은 입력하세요. : ");
		String title = sc.nextLine();
		System.out.print("저자를 입력하세요. : ");
		String author = sc.nextLine();
		System.out.print("가격을 입력하세요. : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사를 입력하세요. :");
		String publisher = sc.nextLine();
		bookclass.add(new BookClass(title, author, price, publisher));
	}

	public static void search() {
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.print("제목 또는 저자명을 입력해주세요.");
		String input = sc.nextLine();
		for (index = 0; index < bookclass.size(); index++) {
			String author = bookclass.get(index).getAuthor();
			String title = bookclass.get(index).getTitle();
			int price = bookclass.get(index).getPrice();
			String publisher = bookclass.get(index).getPublisher();
			if (input.equals(author) || input.equals(title)) {
				System.out.println("해당 도서가 존재합니다.");
				System.out.println("도서명 : " + title + "\n저자명 : " + author + "\n가격 : " + price + "\n출판사 : " + publisher);
			} else {
				System.out.println("해당 제목 또는 저자명과 일치하는 도서가 없습니다.");
			}

		}

	}

	public static void delete() {
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하실 제목을 입력해주세요.");
		String input = sc.nextLine();
		for (index = 0; index < bookclass.size(); index++) {
			if (input.equals(bookclass.get(index).getTitle())) {
				System.out.println("해당 도서를 삭제합니다.");
				bookclass.remove(index);
			} else {
				System.out.println("해당 제목과 일치하는 도서가 없습니다.");
			}
		}

	}

	public static void confirmation() {
		System.out.println("현재까지 등록된 도서 \n-------------------------------");
		for (int i = 0; i < bookclass.size(); i++) {

			String title = bookclass.get(i).getTitle();
			String author = bookclass.get(i).getAuthor();
			int price = bookclass.get(i).getPrice();
			String publisher = bookclass.get(i).getPublisher();
			System.out.println("도서명 : " + title + "|저자명 : " + author + "|가격 : " + price + "|출판사 : " + publisher);
			System.out.println();

		}
	}

	public static int buy() {
		int sum = 0;
		for (int i = 0; i < bookclass.size(); i++) {
			sum += bookclass.get(i).getPrice();
		}
		return sum;
	}

}
