package by20240212;

public class ProductClass {
    int id;
    String name;
    int price;
    int quantity;

    ProductClass(int id, int quantity, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    ProductClass() {
    }

    void productInfo() {
        String msg = "상품 번호 : " + this.id + " | 상품 이름 : " + this.name + " | 상품 개수 : " + this.quantity + " | 상품 가격 : " + this.price;
        System.out.println(msg);
    }

    public void displayTotalQuantity() {
        System.out.println("Total quantity for " + this.name + ": " + this.quantity);
    }
}
