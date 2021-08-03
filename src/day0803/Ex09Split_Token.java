package day0803;

import java.util.StringTokenizer;

import sun.util.locale.StringTokenIterator;

public class Ex09Split_Token {

	public static void main(String[] args) {
		
		String str = "red, blue, yellow, orange, gray";
		System.out.println("String 객체의 split을 이용한 문자열 분리");
		String[] arr = str.split(","); //split은 문자열을 분리하느 메서드. 반환타입은 스트링배열!
		System.out.println("총 "+ arr.length + "개");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i + ":" + arr[i]);
		}
		
		System.out.println("StringTokenizer를 이용한 문자열 분리" );
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("총 토큰수 : " + st.countTokens());
		while(st.hasMoreTokens()) { //토근 뒤에 또 토큰이 있나 확인하는 메서드
			System.out.println(st.nextToken()); //다음 토큰 얻기
		}
		
	}

}
