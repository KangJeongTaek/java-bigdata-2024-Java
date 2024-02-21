package by20240212;

public class ExeClass {
    public static void main(String[] args) {
    CustomerClass c1 = new CustomerClass(1, "홍길동", 29, 10);
    CustomerClass c2 = new CustomerClass(2, "김영희", 31, 10);
    CustomerClass c3 = new CustomerClass(3, "강정택", 29, 10);
    c1.customInfo();
    System.out.println();
    c2.customInfo();
    System.out.println();
    c3.customInfo();
    System.out.println("---------------------------------------------------------");
    ProductClass p1 = new ProductClass(1, 100, "새우깡", 1000);
    ProductClass p2 = new ProductClass(2, 500, "콜라", 2000);
    ProductClass p3 = new ProductClass(3, 1000, "천하장사", 800);
    ProductClass p4 = new ProductClass(4, 300, "빼빼로", 1500);
    ProductClass p5 = new ProductClass(5, 500, "사이다", 2000);
    p1.productInfo();
    System.out.println();
    p2.productInfo();
    System.out.println();
    p3.productInfo();
    System.out.println();
    p4.productInfo();
    System.out.println();
    p5.productInfo();

    c3.addToCart(p1, 1);

    c3.addToCart(p2, 10);

    c3.addToCart(p3, 21);

    c3.addToCart(p4, 50);


    c3.purchase();

}
}

