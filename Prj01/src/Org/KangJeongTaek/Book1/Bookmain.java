package Org.KangJeongTaek.Book1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Bookmain {
	static List<BookClass> bookclass = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Outter: while (true) {
			System.out.print("1. 도서 등록 \n2. 도서 검색 \n3. 도서 삭제\n4. 도서 확인 \n5. 도서 구입 \n0. 종료\n");
			int menuInput = sc.nextInt();
			switch (menuInput) {
			case 1:
				// 등록 메소드 호출
				registration();
				break;
			case 2:
				// 검색 메소드 호출
				search();
				break;
			case 3:
				// 삭제 메소드 호출
				delete();
				break;
			case 4:
				// 확인 메드 호출
				confirmation();
				break;
			case 5:
				// 구매 메소드 호출 후 가격 출력
				int totalPrice = buy();
				if (totalPrice != 0) {
					System.out.println("-----------------------------------------------------------");
					System.out.println("총 가격은 부가세를 포함해 " + totalPrice + "원 입니다.");
					System.out.println("-----------------------------------------------------------");
				} else {
					System.out.println("구매하시려는 종류의 책이 없거나 잘못 입력하셨습니다.");
				}
				break;
			case 0:
				System.out.println("종료합니다.");
				break Outter;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
		sc.close();

	}

	// 도서 등록 메소드
	public static void registration() throws InterruptedException {
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

		boolean run = true;
		while (run) {
			System.out.println("e-book이라면 1, 종이책이라면 2를 입력해주세요.");
			int check = sc.nextInt();
			sc.nextLine();
			if (check == 1) {
				System.out.println("호환 기기를 입력해주세요.");
				String supperdevice = sc.nextLine();
				bookclass.add(new EbooksClass(title, author, price, publisher, supperdevice));
				System.out.println("등록이 완료됐습니다.");
				Thread.sleep(1500);
				System.out.println();
				run = false;
			} else if (check == 2) {
				System.out.println("페이지 수를 입력해주세요.");
				int size = sc.nextInt();
				bookclass.add(new PaperBookClass(title, author, price, publisher, size));
				System.out.println("등록이 완료됐습니다.");
				Thread.sleep(1500);
				System.out.println();
				run = false;
			} else {
				System.out.println("1과 2중에 입력해주세요.");
			}

		}
	}

	// 도서 검색 메소드
	public static void search() throws InterruptedException {
		int i;
		System.out.print("제목 또는 저자명을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		boolean found = false;
		for (i = 0; i < bookclass.size(); i++) {
			String author = bookclass.get(i).getAuthor();
			String title = bookclass.get(i).getTitle();
			int price = bookclass.get(i).getPrice();
			String publisher = bookclass.get(i).getPublisher();
			if (input.equals(author) || input.equals(title)) {
				System.out.println("\t\t해당 도서가 존재합니다.");
				System.out.println("-----------------------------------------------------------");
				found = true;
				if (bookclass.get(i) instanceof EbooksClass) {
					EbooksClass ebook = (EbooksClass) bookclass.get(i);
					String device = ebook.deviceInfo();
					System.out.println("도서명 : " + title + "\n저자명 : " + author + "\n가격 : " + price + "\n출판사 : "
							+ publisher + "\n 종류 : 전자 도서\n호환기기 : " + device);

				} else if (bookclass.get(i) instanceof PaperBookClass) {
					PaperBookClass paperBook = (PaperBookClass) bookclass.get(i);
					int page = paperBook.sizeInfo();
					System.out.println("도서명 : " + title + "\n저자명 : " + author + "\n가격 : " + price + "\n출판사 : "
							+ publisher + "\n종류 : 종이책\n페이지 수 : " + page);
				}
				System.out.println("-----------------------------------------------------------");
			}
		}
		if (!found) {
			System.out.println("찾으시는 도서가 없습니다.");
		}
		Thread.sleep(1500);
		System.out.println();
	}

	// 도서 삭제 메소드
	public static void delete() throws InterruptedException {
		int index;
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하실 도서의 제목을 입력해주세요.");
		String input = sc.nextLine();
		for (index = 0; index < bookclass.size(); index++) {
			if (input.equals(bookclass.get(index).getTitle())) {
				System.out.println("해당 제목의 도서를 삭제합니다.");
				found = true;
				bookclass.remove(index);
			}
		}
		if (!found) {
			System.out.println("해당 제목의 도서가 없습니다.");
		}
		Thread.sleep(1500);
	}

	// 도서 확인 메소드
	public static void confirmation() throws InterruptedException {
		System.out
				.println("\t\t현재까지 등록된 도서 \n-------------------------------------------------------------------------");
		for (int i = 0; i < bookclass.size(); i++) {
			String title = bookclass.get(i).getTitle();
			String author = bookclass.get(i).getAuthor();
			int price = bookclass.get(i).getPrice();
			String publisher = bookclass.get(i).getPublisher();
			if (bookclass.get(i) instanceof EbooksClass) {
				EbooksClass ebook = (EbooksClass) bookclass.get(i);
				String device = ebook.deviceInfo();
				System.out.println("도서명 : " + title + " | 저자명 : " + author + " | 가격 : " + price + " | 출판사 : "
						+ publisher + " | 전자 도서 | " + "호환기기 : " + device);
			} else if (bookclass.get(i) instanceof PaperBookClass) {
				PaperBookClass paperBook = (PaperBookClass) bookclass.get(i);
				int size = paperBook.sizeInfo();
				System.out.println("도서명 : " + title + " | 저자명 : " + author + " | 가격 : " + price + " | 출판사 : "
						+ publisher + " | 종이책 | " + "페이지 수 : " + size);
			}
		}
		System.out.println("-------------------------------------------------------------------------");
		Thread.sleep(1500);
	}

	// 도서 구입 메소드
	public static int buy() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("구매를 원하시는 책의 종류를 입력해주세요. 1. e-book || 2. 종이책");
		int type = sc.nextInt();
		for (int i = 0; i < bookclass.size(); i++) {
			if (type == 1) {
				if (bookclass.get(i) instanceof EbooksClass) {
					EbooksClass ebook = (EbooksClass) bookclass.get(i);
					int taxPrice = (int) (bookclass.get(i).getPrice() * bookclass.get(i).getTax());
					System.out.println("-----------------------------------------------------------");
					String msg = "제목 : " + ebook.getTitle() + "\n저자명 : " + ebook.getAuthor() + "\n세금 포함 가격 : "
							+ taxPrice + "\n출판사 : " + ebook.getPublisher() + "\n호환 기기 : " + ebook.deviceInfo();
					System.out.println(msg);
					sum += taxPrice;
				}
			} else if (type == 2) {
				if (bookclass.get(i) instanceof PaperBookClass) {
					PaperBookClass paper = (PaperBookClass) bookclass.get(i);
					int taxPrice = (int) (bookclass.get(i).getPrice() * bookclass.get(i).getTax());
					System.out.println("-----------------------------------------------------------");
					String msg = "제목 : " + paper.getTitle() + "\n저자명 : " + paper.getAuthor() + "\n세금 포함 가격 : "
							+ taxPrice + "\n출판사 : " + paper.getPublisher() + "\n페이지 : " + paper.sizeInfo();
					System.out.println(msg);
					sum += taxPrice;
				}
			}
		}
		return sum;
	}
}
