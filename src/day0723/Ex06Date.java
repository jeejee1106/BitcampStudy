package day0723;

import java.util.Date;

public class Ex06Date {

	public static void main(String[] args) {
		
		//2020�� 5�� 1���� ���� ���� ���
		int year, month, day;
		year = 2020;
		month = 5;
		Date d1 = new Date(year-1900, month-1, 1);
		System.out.println("���� ���� : " + d1.getDay());
		
		
		//2019�� 4�� 1���� ���� ���� ���
		year = 2019;
		month = 4;
		Date d2 = new Date(year-1900, month-1, 1);
		System.out.println("���� ���� : " + d2.getDay());

	}

}
