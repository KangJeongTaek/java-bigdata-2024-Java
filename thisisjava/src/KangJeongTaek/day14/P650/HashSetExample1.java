package KangJeongTaek.day14.P650;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();

		set.add(new Member("홍길동", 24));
		set.add(new Member("홍길동", 24));

		int size = set.size();
		System.out.println("총 객체 수 " + size);

	}
}
