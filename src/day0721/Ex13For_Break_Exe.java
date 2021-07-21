package day0721;

import java.util.Scanner;

public class Ex13For_Break_Exe {
	
	public static void main(String[] args) {
		
		/*
		 * 총 5개의 점수를 입력 받아 합계를 구해보자
		 * 점수가 1보다 작거나 100보다 크면 다시 입력받으시오
		 * ex)
		 * 1번 점수 : 90
		 * 2번 점수 : 120
		 * 	잘못입력했어요
		 * 2번 점수 : 100
		 * 3번 점수 : 50
		 * ...
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int score;
		System.out.println("점수입력");
		for(int i = 1; i<=5; i++) {
			score = sc.nextInt();
			if(score<0 || score>100) {
				System.out.println("잘못입력");
				continue;
			} System.out.println("");
		}
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.println("점수 입력");
//		for(int i = 1; i<=5; i++) {
//			int score = sc.nextInt();
//			if(score<0 || score>100) {
//				System.out.println("	<잘못 입력>");
//				i--;
//				continue;
//			}
//			System.out.println(i + "번 점수 : " + score);
//			sum=+score;
//		} System.out.println("총점 : " + sum);
		
		//강사님 코드
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int score;
//		for(int i=1; i<=5; i++) {
//			System.out.print(i + "번 점수");
//			score = sc.nextInt();
//			if(score<1 || score>100) {
//				System.out.println("\t잘못입력");
//				i--;
//				continue;
//			} sum+=score;
//		} System.out.println("총점 : " + sum);
		
		
	}

}
