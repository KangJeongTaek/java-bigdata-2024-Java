package KangJeongTaek.day04.String;

public class CharAtExample {
	public static void main(String[] args) {
		String num = "9610031111111";
		char sex = num.charAt(6);
		/*switch(sex) {
			case '1','3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;*/
		
		if(num.charAt(6) == '1' || sex == '3') {
			System.out.println("남자입니다.");
		} else if(sex == '4' || sex == '2') {
			System.out.println("여자입니다.");
		}

}
}
