package day0802;

import java.util.Date;

public class Ex16Exception {
	Date date;
	
	public void writeDay() {
		int y,m,d;
		try {
		y = date.getYear()-1900;
		m = date.getMonth()+1;
		d = date.getDate();
		System.out.println(y + "년" + m + "월" +d + "일 입니다.");
		} catch(NullPointerException e) {
			System.out.println("객체생성을 안했삼:" + e.getMessage()); //에러 메세지만!
			e.printStackTrace(); //정확하게 어디 몇번줄에서 에러가 났는지!
		}
	}
	
	public static void main(String[] args) {
		Ex16Exception ex = new Ex16Exception();
		ex.writeDay();
		System.out.println("**정상종료**");
	}
}
