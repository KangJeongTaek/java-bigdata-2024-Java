package KangJeongTaek.day11.CalendarExample;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY: strWeek = "월";break;
		case Calendar.TUESDAY: strWeek = "화";break;
		case Calendar.WEDNESDAY: strWeek = "수";break;
		case Calendar.THURSDAY: strWeek = "목";break;
		case Calendar.FRIDAY: strWeek = "금";break;
		case Calendar.SATURDAY: strWeek = "토";break;
		case Calendar.SUNDAY: strWeek = "일";break;
		}
		
		int ampm = now.get(Calendar.AM_PM);
		String strampm;
		if(ampm == Calendar.AM) {
			strampm = "오전";
		}else {
			strampm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year+"년" );
		System.out.println(month+"월" );
		System.out.println(day+"일" );
		System.out.println(strWeek +"요일");
		System.out.println(strampm);
		System.out.println(hour+"시" );
		System.out.println(minute+"분" );
		System.out.println(second+"초" );
		
	}
}
