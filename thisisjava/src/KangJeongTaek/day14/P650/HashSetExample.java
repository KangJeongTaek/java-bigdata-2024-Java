package KangJeongTaek.day14.P650;
import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		set.add("JAVA");
		set.add("Spring");
		
		int size = set.size();
		System.out.println("객체 수는 총 " + size);
		
	}
}
