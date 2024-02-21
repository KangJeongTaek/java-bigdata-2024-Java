package KangJeongTaek.day11.CalendarExample;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
	public static void main(String[] args) {
		TimeZone timezone = TimeZone.getTimeZone("Asia/Seoul");
	
		Calendar now = Calendar.getInstance(timezone);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		

	}
}
