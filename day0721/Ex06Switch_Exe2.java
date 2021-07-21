package day0721;

import java.util.Scanner;

public class Ex06Switch_Exe2 {

	public static void main(String[] args) {
		/*
		 * 점수를 입력받아 학점을 구하시오
		 * 90이상은 A, 80이상은 B, 70이상은 C, 60이상은 D, 나머지는 F
		 * (switch문 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.println("점수를 입력해주세요.");
		score = sc.nextInt();
		
		switch(score/10) {
		case 10: case 9: 
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'c';
			break;
		case 6:
			grade = 'd';
			break;
		default:
			grade = 'F';
			
		}
		
		System.out.println(score + "점은 " + grade + "학점 입니다.");
		
		
		
	}

}
