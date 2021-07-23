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
//		int cnt = 0;
//		while(true) {
//			char a = (char)((Math.random()*26)+65);
//			System.out.println(a);
//			System.out.print("맞추기 : ");
//			char b = (char)sc.nextInt(); //이 코드가 잘못돼서 실행시 오류가 난다.
//			if(b=='q'||b=='Q') {
//				System.out.println("종료");
//				break;
//			}
//			if(a==b) {
//				System.out.println("정답");
//				cnt++;	
//			} else {
//				System.out.println("오답");
//			}
//		}
		
		
		//강사님 코드
//		int cnt = 0; //맞춘갯수
//		int allcnt = 0; //총 문제 갯수
//		char rnd, inp;
//		while(true) {
//			rnd=(char)((Math.random()*26)+65); //랜덤하게 알파벳 대문자 출력
//			System.out.println(rnd);
//			inp = sc.nextLine().charAt(0); //입력하는 문자열의 첫글자만 얻기
//			if(inp=='q'||inp=='Q') { //종료코드
//				break;
//			}
//			allcnt++; //문제갯수 증가
//			if(inp==rnd) {
//				System.out.println("정답");
//				cnt++; //맞았을 경우 증가
//			} else {
//				System.out.println("오답");
//			}
//		}
//		//빠져나온 후 출력
//		System.out.println("총" + allcnt + "문제중 " + cnt + "개 맞음!");
		
		
		
		
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
		
		for(int i = 1; i<=5; i++) { //for문은 내가 그냥 한 번 넣어봄ㅎㅎ 런 안누르고 이어서 게임 계속 하고 싶어서! 게임 5번 반복!
			System.out.println("1부터 100까지 숫자 중 하나를 입력하세요");
			Random rand = new Random();
			int num = rand.nextInt(100)+1;
			int n=1;
			while(true) {
				System.out.print("기회" + n + " : ");
				int a = sc.nextInt();
				n++;
				if(a==num) {
					System.out.println("짝짝짝. 정답입니다.");
					break;
				} else if(a>num) {
					System.out.println(a + "보다 작습니다.");
				} else {
					System.out.println(a + "보다 큽니다.");
				}
			} System.out.println("***종료***");
		
		}
		
		
	}

}
