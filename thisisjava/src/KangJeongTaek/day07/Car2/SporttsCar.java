package KangJeongTaek.day07.Car2;

public class SporttsCar extends Car{
	@Override
	void speedUp() {
		speed += 10;
	}
	// 부모 클래스의 stop 메소드는 final 메소드 이므로 재정의 할 수 없다.
	/*void stop() {
		System.out.println("스포츠 카를 멈춤");
		speed = 0;
	}*/
}
