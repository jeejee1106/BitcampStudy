package day0726;

import java.util.Scanner;

public class Ex04Array_Rank {

	public static void main(String[] args) {
		
		/*
		 * 출력할 인원수를 먼저 입력. 그 인원수만큼 이름과 점수를 입력한 후
		 * 입력한 데이터와 등수를 출력하고, 전체합계와 평균을 구하시오
		 * */
		Scanner sc = new Scanner(System.in);
		
		int inwon;
		String[] name;
		int[] score;
		int[] rank;
		int tot = 0;
		double avg = 0;
		
		System.out.println("인원수를 입력하시오");
		inwon = Integer.parseInt(sc.nextLine());
		//인원수만큼 배열 할당
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		//인원수만큼 데이타 입력
		for(int i = 0; i<inwon; i++) {
			System.out.println(i + "번지 이름");
			name[i] = sc.nextLine();
			System.out.println(i + "번지점수");
			score[i] = Integer.parseInt(sc.nextLine());
			
			//총점
			tot+=score[i];
		}
		
		//등수 구하기 - 거의 공식임.
		for(int i = 0; i<inwon; i++) {
			rank[i] = 1;
			for(int j = 0; j<inwon; j++) {
				if(score[i]<score[j]) {
					rank[i]++; //i++하고 i+1하고 다른가?ㅜㅜ
				}
			}
		}
		
		//평균
		avg = (double)tot/inwon;
		
		
		//출력
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("======================");
		for(int i = 0; i<inwon; i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		System.out.println("======================");
		System.out.println("총점  = " + tot);
		System.out.println("평균  = " + avg);
		
		

	}

}
