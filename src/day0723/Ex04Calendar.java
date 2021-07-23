package day0723;

import java.util.Calendar;

public class Ex04Calendar {

	public static void main(String[] args) {
		
//		Calendar cal = new Calendar(); //캘린더는 생성자가 protectsd라서 new를 사용할 수 없음
		
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR); 
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int hh = cal.get(Calendar.HOUR);
		int mm = cal.get(Calendar.MINUTE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("오늘날짜 : " + y + "-" + m + "-" + d);
		System.out.println("현재시간 : " + hh + ":" + mm);
		System.out.println("요일숫자 : " + week); //일요일부터 1234567
		switch(week) {
		case Calendar.SUNDAY:
			System.out.println("오늘은 일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("오늘은 월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("오늘은 화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("오늘은 수요일");
			break;
		case Calendar.THURSDAY:
			break;
		case Calendar.FRIDAY:
			System.out.println("오늘은 금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("오늘은 토요일");
			break;
		}

	}

}
