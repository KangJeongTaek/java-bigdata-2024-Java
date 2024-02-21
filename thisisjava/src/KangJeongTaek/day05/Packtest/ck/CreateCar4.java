package KangJeongTaek.day05.Packtest.ck;

import java.util.Scanner;

class Car4{
	String modelName;
	String carColor;
	int carYear;
	String kind = "세단";
	//생성자 오버로딩
	Car4(){ //디폴트 생성자 : 입력이 없는 생성자), 오버로딩하면 디폴트 생성자를 명시적으로 만들어야 한다.
		System.out.printf("나는 디폴트 생성자입니다.\n");
		
	}
	Car4(String kind){ //나는 매개 변수 하나를 받는 생성자입니다.
		this.kind = kind;
	}
	Car4(String modelName, String carColor, int carYear){ //매개 변수 3개를 갖는 생성자입니다.
		Scanner sc = new Scanner(System.in);
		this.modelName = modelName;
		this.carColor = carColor;
		this.carYear = carYear;
	}
}

public class CreateCar4 {

	public static void main(String[] args) {
		//Car3 c = new Car3(); //자동으로 디폴트 생성자가 출력된다.
		Car4 c1 =new Car4("모닝", "흰색", 2024);
		Car4 c2 = new Car4("소형차");
		System.out.printf("나의 차 종류는 %s %s이고 색상은 %s이며 연식은 %d식입니다.",c2.kind,c1.modelName,c1.carColor,c1.carYear);
	}

}
