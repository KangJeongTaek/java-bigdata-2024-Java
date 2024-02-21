package KangJeongTaek.day08.Animal;

public abstract class Animal {
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound(); //추상 메소드는 실행 부분이 없다
}
