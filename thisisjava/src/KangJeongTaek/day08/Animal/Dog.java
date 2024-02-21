package KangJeongTaek.day08.Animal;

public class Dog extends Animal{
	//추상 메소드는 반드시 재정의 해야 한다.
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
