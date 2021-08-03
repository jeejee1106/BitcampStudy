package day0803;

import java.text.NumberFormat;

public class Ex13NumberFormat {

	public static void main(String[] args) {
		
		//숫자를 문자열로 변환하여 출력(콤마나 소수점을 지정)
		int money = 6517165;
		double num = 67.31846;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(); //화폐단위(원 표시)와 자릿수콤마제공
		System.out.println(nf1.format(money));
		
		NumberFormat nf2 = NumberFormat.getInstance(); //콤마만 제공!
		System.out.println(nf2.format(money));
		System.out.println(nf2.format(num));
	}

}
