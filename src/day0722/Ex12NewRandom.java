package day0722;

import java.util.Random;

public class Ex12NewRandom {

	public static void main(String[] args) {

		Random r = new Random();
		System.out.println("0~9 ������ ���� 5�� �߻�");
		for(int i=1;i<=5;i++) {
			int n=r.nextInt(10);//0~9
			System.out.println(n);
		}
		
		System.out.println("-----------");
		System.out.println("0~99 ������ ���� 5�� �߻�");
		for(int i=1;i<=5;i++) {
			int n=r.nextInt(100);//0~99
			System.out.println(n);
		}
		
		System.out.println("-----------");
		System.out.println("1~10 ������ ���� 5�� �߻�");
		for(int i=1;i<=5;i++) {
			int n=r.nextInt(10)+1;//1~10
			System.out.println(n);
		}
		
		System.out.println("-----------");
		System.out.println("A~Z ������ ���� 5�� �߻�");
		for(int i=1;i<=5;i++) {
			int n=r.nextInt(26)+65;//65~90
			System.out.println((char)n);
		}
		
		System.out.println("-----------");
	}

}
