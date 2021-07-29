package day0729;

import day0728.Info; //일부로 다른 패키지에 class를 만들어봄.

public class Ex04Constructor {

	public static void main(String[] args) {
		
		Info info = new Info();
		
		System.out.println("**초기값 확인**");
		info.dataOut();
		System.out.println("**값 변경하기**");
		info.dataIn();
		info.dataOut();
		
		
		
	}

}
