package day0723;

import java.util.Date;

public class Ex03Date {

	public static void main(String[] args) {
		/*
		 * 날짜를 출력하는 방법에는 date와 Caleadar를 이용하는 방법이 있다.
		 * java에서 date는 권장하지 않지만 date가 사용하기 더 편해서 d..~어쩌고가 됐지만
		 * 여전히 많이 쓰이고 있다.
		 * */
		
		//현재 년 월 일 요일 시 분 출력
		Date date = new Date();
		int y = date.getYear()+1900; //year은 1900을 더해줘야 현재 년도가 제대로 출력됨
		int m = date.getMonth()+1; 
		int d = date.getDate();
		int hh = date.getHours();
		int mm = date.getMinutes();
		int week = date.getDay();
		//get~에 줄이 그어진 이유는 이 메서드를 권장하지 않는다. 다른 메서드를 써라. 라는 뜻
		//근데 써도 아무 문제 없음!
		
		System.out.println("오늘날짜 : " + y + "-" + m + "-" + d);
		System.out.println("현재시간 : " + hh + ":" + mm);
		System.out.println("요일숫자 : " + week);
		System.out.println("오늘은 " + 
		(week==0?"일":week==1?"월":week==2?"화":week==3?"수":week==4?"목":week==5?"금":week==6?"토":"일")
		+ "요일입니다.");
		
		
		
		
		

	}

}
