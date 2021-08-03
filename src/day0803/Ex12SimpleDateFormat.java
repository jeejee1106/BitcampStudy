package day0803;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex12SimpleDateFormat {
	
	

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		//날짜, 시간을 원하는 양식에 맞게 출력하기
		//HH:24시간 표시, MM:월, mm:분
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		System.out.println(sdf1.format(date));
		
		//a:오전/오후, hh:12시간 표시, ss:초
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		//EEE:요일 짧게
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEE");
		System.out.println(sdf3.format(date));
		
		//EEEE:요일 길게
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		System.out.println(sdf4.format(date));

		//
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		System.out.println(sdf5.format(date));
	}

}
