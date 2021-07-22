package day0722;

import java.util.Random;

public class Ex12NewRandom {

	public static void main(String[] args) {

		Random r = new Random();
		System.out.println("0~9 사이의 난수 5개 발생");
		for(int i=1;i<=5;i++) {
			int n=r.nextInt(10);//0~9
			System.out.println(n);
		}
		
		System.out.println("-----------");
		System.out.println("0~99 사이의 난수 5개 발생");
		for(int i=1;i<=5;i++) {
			int n=r.nextInt(100);//0~99
			System.out.println(n);
		}
		
		System.out.println("-----------");
		System.out.println("1~10 사이의 난수 5개 발생");
		for(int i=1;i<=5;i++) {
			int n=r.nextInt(10)+1;//1~10
			System.out.println(n);
		}
		
		System.out.println("-----------");
		System.out.println("A~Z 사이의 난수 5개 발생");
		for(int i=1;i<=5;i++) {
			int n=r.nextInt(26)+65;//65~90
			System.out.println((char)n);
		}
		
		System.out.println("-----------");
	}

}
