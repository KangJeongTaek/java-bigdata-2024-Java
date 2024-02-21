package by20240212;

public class CustomerClass {
    int id;
    String name;
    int age;
    ProductClass[] basket;
    int index = 0;
    int totalPrice = 0;

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
            if (product.quantity < purchaseQuantity) {
                System.out.println("살 수 없습니다. " + product.name + "의 재고가 부족합니다. 남은 물품의 재고는 " + product.quantity + "개 입니다.");
            } else {
                product.quantity -= purchaseQuantity;
                this.totalPrice += product.price * purchaseQuantity;
                System.out.println(product.name + "을(를) " + purchaseQuantity + "개를 장바구니에 담았습니다.");
            }
            index++;
        } else {
            System.out.println(this.name + " 고객님의 바구니가 가득 찼습니다. 더 이상 물건을 담을 수 없습니다.");
        }

    }

    public void purchase() {
        System.out.println(this.name + "고객님의 총 결재 금액은 " + this.totalPrice + "입니다.");

        this.totalPrice = 0;
        this.index = 0;
    }
}