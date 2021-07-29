package day0729;

import java.sql.Date;

class Birth {
	//필드,= 멤버변수,= 인스턴스변수
	int year, month, day;
	
	//생성자
	Birth(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void display() {
		System.out.println(year + "년" + month + "월" + day + "일 생입니다.");
		System.out.println("저는 " + this.getMyWeek() + "요일에 태어났어요");
		System.out.println("저는 " + this.getMyDdi() + "띠 입니다.");
	}
	
	public String getMyWeek() {
		String week = "";
		Date d = new Date(year-1900, month-1, day);
		//요일숫자 얻기
		int day = d.getDay();
		week=day==0?"일":day==1?"월":day==2?"화":day==3?"수":day==4?"목":day==5?"금":"토";
		return week;
	}
	
	public String getMyDdi() {
		String[] ddi = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", 
				"토끼", "용", "뱀", "말", "양"};
		return ddi[year%12];
	}
	
}

public class Ex03Constructor {

	public static void main(String[] args) {
		
		Birth b1 = new Birth(2000, 01, 11);
		b1.display();
		System.out.println();
		
		Birth b2 = new Birth(2021,7,29);
		b2.display();
		
		
		
		
	}

}
