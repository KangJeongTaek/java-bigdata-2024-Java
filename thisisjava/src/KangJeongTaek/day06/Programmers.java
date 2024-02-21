package KangJeongTaek.day06;
import java.util.Scanner;

public class Programmers {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        String answer = "";
	        for(int i = 0;i<a.length();i++)
	        if(a.charAt(i) == a.toUpperCase().charAt(i)) {
	        	answer += a.toLowerCase().charAt(i);
	        	
	        }else {
	        	answer += a.toUpperCase().charAt(i);
	        }
	        System.out.println(answer);
	    }
	    
}
