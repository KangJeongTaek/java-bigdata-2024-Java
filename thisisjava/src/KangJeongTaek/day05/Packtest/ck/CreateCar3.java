package KangJeongTaek.day05.Packtest.ck;

//2. 생성자를 이용한 초기화
class Car3{
	String modelName;
	String carColor;
	int carYear;
	String kind = "세단";
	Car3(){ //디폴트 생성자 : 입력이 없는 생성자)
		System.out.printf("나는 디폴트 생성자입니다.\n");
		
	}
	Car3(String kind){ //나는 매개 변수 하나를 받는 생성자입니다.
		this.kind = kind;
	}
	Car3(String modelName, String carColor, int carYear){ //매개 변수 3개를 갖는 생성자입니다.
		this.modelName = modelName;
		this.carColor = carColor;
		this.carYear = carYear;
	}
}

public class CreateCar3 {

	public static void main(String[] args) {
		//Car3 c = new Car3(); //자동으로 디폴트 생성자가 출력된다.
		Car3 c1 =new Car3("모닝", "흰색", 2024);
		Car3 c2 = new Car3("소형차");
		System.out.printf("나의 차 종류는 %s %s이고 색상은 %s이며 연식은 %d식입니다.",c2.kind,c1.modelName,c1.carColor,c1.carYear);
	}

}
