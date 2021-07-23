package day0723;

import java.util.Date;
import java.util.Scanner;

public class Ex07Calendar_Exe2 {

	public static void main(String[] args) {
		
		/*
		 *년도와 월을 입력 후 달력 출력하기
		 *
		 * 요구사항
		 * 1. 월이 1~12를 벗어나면 경고메세지와 함께 프로그램 종료
		 * 2. 일요일부터 토요일순으로 출력
		 * 
		 * 힌트 : 달력을 만들기 위해서 알아야 할 사항
		 * 1. 그 년도의 그 월이 며칠까지 있는지
		 * 2. 그 년도의 월의 1일이 무슨 요일인지(Date클래스의 getday를 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		int year, month;
		Date date;
		int days;//총일수
		int week; //요일수
		System.out.println("년도 월 입력");
		year=sc.nextInt();
		month=sc.nextInt();
		//1. 월이 1~12를 벗어나면 경고메세지와 함께 프로그램 종료
		if (month<1 || month>12) {
			System.out.println("잘못입력");
			return;
		}
		
		//date생성
		date = new  Date(year-1900, month-1, 1);
		//요일숫자 구하기
		week = date.getDay();
		//입력한 년도와 월의 총 일수 구하기
		switch(month) {
		case 2:
			if(year%4==0 && year%100!=0 || year%400==0) {
				days = 29;
			} else {
				days = 28;
			} break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		default:
			days = 31;
		}
		
		System.out.println("\t"+ year + "년" + month + "월\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("===================================================");
		//요일 숫자 만큼 탭 띄우기
		for(int i = 1; i<=week; i++) {
			System.out.print("\t");
		}
		//1일부터 출력하기
		for(int i = 1; i<=days; i++) {
			week++;
			System.out.print(i + "\t");
			if(week%7==0) { //토요일일 경우 줄넘김
				System.out.println();
			}
		}
		
		
		
		
		
		
		
//		int y, m, d;
//		String day;
//		boolean flag;
//		
//		System.out.println("년도와 월을 입력하세요");
//		y = sc.nextInt();
//		m = sc.nextInt();
//		Date fd = new Date(y-1900, m-1, 1);
//		
//		fd.getDay(); //해당년도 월 1일의 요일 숫자가 저장된 코드.
//		
//		flag = (y%4==0 && y%100!=0 || y%400==0); //true면 윤년 false면 평년
//		if ((m==4)||(m==6)||(m==9)||(m==11)) {
//			d = 30;
//		} else if(m==2) {
//			if(flag==true) {
//				d = 29;
//			} else {
//				d = 28;
//			}
//		} else {
//			d = 31;
//		}
//
//		switch(fd.getDay()) {
//		case 0: day = "일"; break;
//		case 1: day = "월"; break;
//		case 2: day = "화"; break;
//		case 3: day = "수"; break;
//		case 4: day = "목"; break;
//		case 5: day = "금"; break;
//		case 6: day = "토"; break;
//		}
//		
//		System.out.println("일\t월\t화\t수\t목\t금\t토");
//		if(fd.getDay()==0 || d==30) {
//			for(int i = 1; i<=30; i++) {
//				if(i>7) {
//					System.out.println();
//				} System.out.print(i);
//			} 
//		}
		
		
		
		
		

	}

}
