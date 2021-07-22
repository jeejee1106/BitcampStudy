package day0722;

import java.util.Random;
import java.util.Scanner;

public class Ex13Final_Exe {

	public static void main(String[] args) {

		/*[문제1]
		 * while문 사용, Math.random() 사용
		 * while문 안에서 대문자를 임의로 출력한후 그 문자를 입력하여 맞을경우
		 * cnt 변수 1 증가
		 * 입력시 q 나 Q 를 입력하면 빠져나온후
		 * 총 알파벳 10개중 5개 맞춤
		 * (예)
		 * G
		 * 맞추기 : G
		 * Y
		 * 맞추기 :K
		 * J
		 * 맞추기 : q
		 * 총 2문제중 1개 맞음
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			int cnt = 0;
//			char a = (char)((Math.random()*26)+65);
//			System.out.println(a);
//			System.out.print("맞추기 : ");
//			char b = (char)sc.nextInt();
//			if(a==b) {
//				cnt++;	
//			} else if(b==1) {
//				break;
//			}
//			System.out.println("총" + cnt + "문제 맞음");
//		}
//		
//		
//		char uni = 'A';
//		int num = 65;
//		for(int i =1; i<=26; i++) {
//			System.out.println(uni++ + "=" + num++);
//		}
		
		/*
		 * [문제2]
		 * Random 클래스 사용
		 * 1~100 사이의 임의의 난수를 변수 rnd 에 저장후
		 * 그 숫자 알아맞추기
		 * (예)
		 *  50 이라는 난수가 rnd에 저장되어있다 할경우
		 *  1 : 40
		 *      40보다 큽니다
		 *  2 : 70
		 *      70보다 작습니다
		 *  3 : 60 
		 *      60보다 작습니다
		 *  4 : 50
		 *    짝짝짝. 정답입니다 (출력후 while문 빠져나가기)
		*/
		
		
		System.out.println("1부터 100까지 숫자 중 하나를 입력하세요");
		Random rand = new Random();
		int rnd = rand.nextInt(100)+1;
		int n=1;
		while(true) {
			System.out.println("기회" + n);
			int a = sc.nextInt();
			n++;
			if(a==rnd) {
				System.out.println("짝짝짝. 정답입니다.");
				break;
			} else if(a>rnd) {
				System.out.println(a + "보다 작습니다.");
			} else {
				System.out.println(a + "보다 큽니다.");
			}
		}
		
		
		
		
	}

}
