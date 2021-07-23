package day0723;

import java.util.Date;

public class Ex06Date {

	public static void main(String[] args) {
		
		//2020년 5월 1일의 요일 숫자 얻기
		int year, month, day;
		year = 2020;
		month = 5;
		Date d1 = new Date(year-1900, month-1, 1);
		System.out.println("요일 숫자 : " + d1.getDay());
		
		
		//2019년 4월 1일의 요일 숫자 얻기
		year = 2019;
		month = 4;
		Date d2 = new Date(year-1900, month-1, 1);
		System.out.println("요일 숫자 : " + d2.getDay());

	}

}
