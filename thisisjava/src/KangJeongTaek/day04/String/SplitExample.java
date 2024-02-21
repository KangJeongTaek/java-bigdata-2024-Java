package KangJeongTaek.day04.String;

public class SplitExample {
	public static void main(String[] args) {
		String str1 = "1, 자바 학습, 참조 타입 String을 학습하고 있습니다, 강정택";
		String[] splitStr1 = str1.split(", ");
		
		System.out.println("번호 : " + splitStr1[0]);
		System.out.println("제목 : " + splitStr1[1]);
		System.out.println("학습 내용 : " + splitStr1[2]);
		System.out.println("이름 : " + splitStr1[3]);
		
		for(int i = 0;i<splitStr1.length;i++) {
			System.out.println(splitStr1[i]);
		
		
	}
}
}
