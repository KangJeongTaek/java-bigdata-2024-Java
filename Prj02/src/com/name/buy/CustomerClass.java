package com.name.buy;

public class CustomerClass {
	int id;
	String name;
	int age;
	ProductClass[] basket;
	int index = 0;
	int totalPrice = 0;
	int purchaseQuantity[] = new int[10];
	CustomerClass(int id, String name, int age, int range) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.basket = new ProductClass[range];
	}

	void customInfo() {
		String msg = "회원 번호 : " + this.id + " | 이름 : " + this.name + " | 나이 : " + this.age;
		msg = msg + "인 회원 생성.";
		System.out.println(msg);
	}

	public void addToCart(ProductClass product, int purchaseQuantity) {
		if (index < 10) {
			this.basket[index] = product;
			boolean isOk = product.checkQuantity(purchaseQuantity);
			if (!isOk) { //
				System.out.println(
						"담을 수 없습니다. " + product.name + "의 재고가 부족합니다. 남은 " +product.name + "의 재고는 " + product.quantity + "개입니다.");
			} else {
				product.quantity -= purchaseQuantity;
				this.totalPrice += product.price * purchaseQuantity;
				System.out.println("나이가 "+ this.age  + "살인 " + this.name  + "(이)가 " + product.price + "원짜리 "+product.name + " " + purchaseQuantity + "개를 장바구니에 담았습니다.");
				this.purchaseQuantity[index] = purchaseQuantity;
				index++;
				
			}
			
		} else {
			System.out.println(this.name + " 고객님의 바구니가 가득 찼습니다. 더 이상 물건을 담을 수 없습니다.");
		}

	}

	public void purchase() {
		for(int i = 0; i<purchaseQuantity.length;i++) {
			if(this.purchaseQuantity[i] == 0) {
			}else {
				
				System.out.println(basket[i].name + "을(를) " + this.purchaseQuantity[i]+ "개 구입하셨습니다.");
			}
		}
		System.out.println(this.name + "고객님의 총 결재 금액은 " + this.totalPrice + "입니다.");

		this.totalPrice = 0;
		this.index = 0;
	}

}
