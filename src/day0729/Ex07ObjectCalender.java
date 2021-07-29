package day0729;

import java.util.Date;
import java.util.Scanner;

public class Ex07ObjectCalender {
	int year;
	int month;
	int endday; //각 월이 며칠까지 있는지
	int week; //요일숫자
	Scanner sc = new Scanner(System.in);
	
	public Ex07ObjectCalender() { //디폴트 생성자
		//현재 년도,월 구하기
		Date date = new Date();
		this.year = date.getYear()+1900;
		this.month = date.getMonth()+1;
		//위에서 얻는 년.월의 1일의 요일 구하기
		Date date2 = new Date(year-1900, month-1, 1);
		this.week = date2.getDay();
		
		//현재 년도에 월이 몇일까지 있는지 구하기
		this.processendDay();
		//달력출력
		this.showCalendar();
	}
	
	//각 월의 최종일 구하기
	public void processendDay() {
		switch(month) {
		case 2:
			if(year%4==0 && year%100!=0 || year%400==0) {
				endday = 29;
			} else {
				endday = 28;
			} break;
		case 4: case 6: case 9: case 11:
			endday = 30;
			break;
		default:
			endday = 31;
		}
	}
	
	//제목부분 출력
	public void showTitle() {
		System.out.println("\t"+ year + "년" + month + "월\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("===================================================");
	}
	
	//달력 출력하는 메서드
	public void showCalendar() {
		this.showTitle();
		
		//week만큼 tap띄우기
		for(int i = 1; i<=week; i++) {
			System.out.print("\t");
		}
		
		//1일부터 endday까지 출력
		for(int i = 1; i<=endday; i++) {
			week++;
			System.out.print(i + "\t");
			if(week%7==0) {
				System.out.println();
			}
		}
	}
	
	//새로운 년도와 월을 입력 후 달력 출력
	public void process() {
		//이 부분 숙제
		//년도와 월을 반복해서 입력하면 그 날짜에 대한 달력 출력
		//년도가 0이 입력되면 프로그램 종료(전체 while문)
		//월은 1~12가 아니면 메세지 출력 후 다시 입력
		//year, month, week 구해야함
		
		while(true) {
			System.out.println("새로운 년도와 월을 입력하세요");
			year = sc.nextInt();
			if(year==0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			month = sc.nextInt();
			if(month<1 || month>12) {
				System.out.println("1~12 중에 입력해라");
				continue;
			}
			
			Date date = new Date(year-1900, month-1, 1);
			week = date.getDay();
			
			showCalendar();
			System.out.println();
			System.out.println();
			
		}
		
	}
	

	public static void main(String[] args) {
		
		Ex07ObjectCalender ex = new Ex07ObjectCalender();
		ex.process();
		

	}

}
