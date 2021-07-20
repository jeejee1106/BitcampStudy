package day0720;

import java.util.Scanner;

public class Ex13Condition_LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//년도를 입력하면 해당 년도가 윤년인지 평년인지 출력하시오
		int year;
		System.out.println("년도 입력");
		year = sc.nextInt();
		
		//윤년구하는 공식 외워두기!!!!!!!!
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
	}

}
