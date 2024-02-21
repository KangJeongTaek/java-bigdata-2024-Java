package KangJeongTaek.day08;


	class A{
		
	}
	class B extends A{
		
	}
	class C extends A{
		
	}
	class D extends B{
		
	}
	class E extends C{
		// A -> B -> D  A -> C -> E 
		public class PromotonExample {
			public static void main (String[] args) {
				B b= new B();
				C c = new C();
				D d = new D();
				E e = new E();
				
				A a1 = b;
				A a2 = c;
				A a3 = d;
				A a4 = e;
				
				B b1 = d;
				C c1 = e;
				
				// B b3 = e; B와 E는 상관 없는 클래스
				// C c2 = d; C와 D는 상관 없는 클래스
			}
			
		
	}
	
}
