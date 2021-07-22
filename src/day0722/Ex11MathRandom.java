package day0722;

public class Ex11MathRandom {

	public static void main(String[] args) {
		
		/*
		 * 자바에서 난수를 구하는 방법 두가지
		 *   1. Math.random() 메서드를 이용하는 방법
		 *   2. Random 이라는 클래스를 생성해서 구하는 방법
		 */

		double a = Math.random(); //Math라는 클래스에 random이라는 메서드!
								  //이 메서드의 범위 는 0.0<=a<1.0
								  //즉 0부터 1과 무한히 가까워짐!! (0.0~0.9999...)
		System.out.println(a); //런을 할 때 마다 각기 다른 난수가 출력됨
		
		System.out.println("<<random 메서드로 정수구하는 법>>");
		System.out.println("0~9 사이의 난수 5개 구하기");
		for(int i = 1; i<=5; i++) {
			int b = (int)(Math.random()*10);
			// 1. Math.random에 출력하려는 숫자의 범위(?)를 곱해준다. --> 0.0 ~ 9.99999
			// 2. 기본적으로 랜덤메서드는 실수이기 때문에 int형의 변수에 값을 담으려면 강제 형변환을 해줘야한다. --> 0 ~ 9
			System.out.println(b);
		}
		
		System.out.println();
		
		System.out.println("1~10 사이의 난수 5개 구하기");
		for(int i = 1; i<=5; i++) {
			int c = (int)((Math.random()*10)+1); //범위 (int)((0.0~9.9)*10)+1 --> 1~10
			System.out.println(c);
		}		 
		
		System.out.println();
		
		System.out.println("A~Z 의 대문자가 랜덤하게 5개 나오도록 하기");
		for(int i = 1; i<=5; i++) {
			int d = (int)((Math.random()*26)+65);
			System.out.println((char)d);
		}
		
		
		
		
	}

}
