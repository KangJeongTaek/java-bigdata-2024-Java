package KangJeongTaek.day07.A;

public class B {
	A a1 = new A(true); //public 생성자는 어디에서든 불러올 수 있으므로 가능
	A a2 = new A(1); //default는 같은 패키지 내에서 가능하니까 가능
	//A a3 = new A("문자열"); //private 생성자 접근 불가
}
