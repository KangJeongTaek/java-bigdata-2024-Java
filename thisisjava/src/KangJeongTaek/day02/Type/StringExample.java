package KangJeongTaek.day02.Type;

public class StringExample {
	public static void main(String[] args) {
		String name = "강정택"; //name 이라는 변수 안에 강정택 이라는 문자열의 값이 시작하는 주소값을 대입한다. 
		String job = "졸업예정자";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다."; // \" < "를 문자열로 받아들인다.
		
		System.out.println(str);
		
		str = "번호\t이름\t직업"; // \t < 탭만큼 띄워쓴다.
		System.out.println(str);
		
		System.out.print("나는\n"); //\n <줄 바꿈
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		
	}
}
