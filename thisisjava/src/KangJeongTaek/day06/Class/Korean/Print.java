package KangJeongTaek.day06.Class.Korean;

public class Print {
	public static void main(String[] args) {
		Korean k1 = new Korean("강정택","123412");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println();
		
		Korean k2 = new Korean("박자바","31413");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
		Korean k3 = new Korean();
	}
}
