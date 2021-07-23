package day0721;

import java.util.Scanner;

public class Ex04LeapYearQuiz2_switch {

	public static void main(String[] args) {
		
		/*
		 * 년도와 월을 입력받아 그해가 윤년인지 평년인지 출력하고
		 * 해당 달이 몇일까지 있는지 출력하시오
		 * */
		
		Scanner sc = new Scanner(System.in);
		int year, month, days;
		boolean flag;
		System.out.println("년도와 월을 입력해주세요.");
		year = sc.nextInt();
		month = sc.nextInt();
		//월 잘못 입력시 프로그램 종료
		if(month<1 || month>12) {
			System.out.println("월을 잘못 입력했어요");
			return; //메인 메서드 종료
		} 
		
		flag = year%4==0 && year%100!=0 || year%400==0;
		//true는 생략가능. if(flag) 이런 식으로 많이 쓴다. false를 출력하고 싶은 경우 if(!flag)
		if(flag==true) { 
			System.out.println(year + "년는 윤년입니다.");
		} else {
			System.out.println(year + "년는 평년입니다.");
		}
		
		//if문으로!!!!!!
//		if ((month==4)||(month==6)||(month==9)||(month==11)) {
//			days = 30;
//		} else if(month==2) {
//			if(flag==true) {
//				days = 29;
//			} else {
//				days = 28;
//			}
//		} else {
//			days = 31;
//		}
//		System.out.println(year + "년" + month + "월은" + days + "일 까지 있습니다.");
		
//		if ((month==4)||(month==6)||(month==9)||(month==11))
//			days = 30;
//		else if(month==2) {
//			if (flag)
//				days = 29;
//			else
//				days = 28;
//		} else
//			days = 31;
		
		//switch문으로!!!!!!
		switch(month) {
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		case 2:{
			if(flag) {
				days = 29;
			} else {
				days = 28;
			}
		}
		break;
		default:
			days = 31;
		}


		System.out.println(year + "년" + month + "월은" + days + "일 까지 있습니다.");
		
		
	}

}
