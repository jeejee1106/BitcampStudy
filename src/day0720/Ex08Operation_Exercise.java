package day0720;

import java.util.Scanner;

public class Ex08Operation_Exercise {

	public static void main(String[] args) {
		/*
		 * 월급여를 입력하여 만원, 천원, 백원, 십원, 일원 갯수를 출력하시오
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//내 코드
//		int money;
//		System.out.println("금액을 입력하세요");
//		money = sc.nextInt();
//		
//		System.out.println("만원 : " + money/10000);
//		System.out.println("천원 : " + (money%10000)/1000);
//		System.out.println("백원 : " + ((money%10000)%1000)/100);
//		System.out.println("십원 : " + (((money%10000)%1000)%100)/10);
//		System.out.println("일원 : " + ((((money%10000)%1000)%100)/10)/1);
		
		//강사님 코드
		int money;
		System.out.println("금액을 입력하세요");
		money = sc.nextInt();
		System.out.println("만원 : " + money/10000);
		System.out.println("천원 : " + (money%10000)/1000);
		System.out.println("백원 : " + (money%1000)/100);
		System.out.println("십원 : " + (money%100)/10);
		System.out.println("일원 : " + (money%10));

		
	}

}
