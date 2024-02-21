package KangJeongTaek.day06.Class.Korean;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	
	//생성자 선언
	public Korean(String n, String s){
		name = n;
		ssn = s;

	}
	public Korean() { //디폴트 생성자
		int a = 100;
		System.out.println("나는 디폴트 생성자입니다.");
		System.out.println("a: " + a); //지역 변수 사용 가능
	}

}

