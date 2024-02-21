package KangJeongTaek.day05.Packtest.ck;

//1. Setter 이용하기
class Car2{
	//++++++++++++++++++++++++++++++++++++++++++++++++++필드, 멤버변수, 속성 영역
	String kind = "세단"; //공통으로 적용될 속성은 초기화를 진행한다.
	String modelName;
	String carColor;
	int carYear;
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++메서드, 멤버함수, 기능 영역
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setcarColor(String carColor) {
		this.carColor = carColor;
	}
	public void setcarYear(int carYear) {
		this.carYear = carYear;
	}
}


public class CreateCar2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.setModelName("람보르기니");
		c1.setcarColor("흰색");
		c1.setcarYear(2014);
		System.out.printf("나의 차는 %s이며, 색상은 %s이고, %d 최신형입니다.",c1.modelName,c1.carColor,c1.carYear);
		
		
	
	}

}
