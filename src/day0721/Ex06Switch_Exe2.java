package day0721;

import java.util.Scanner;

public class Ex06Switch_Exe2 {

	public static void main(String[] args) {
		/*
		 * ������ �Է¹޾� ������ ���Ͻÿ�
		 * 90�̻��� A, 80�̻��� B, 70�̻��� C, 60�̻��� D, �������� F
		 * (switch�� �̿�)
		 */
		
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.println("������ �Է����ּ���.");
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
		
		System.out.println(score + "���� " + grade + "���� �Դϴ�.");
		
		
		
	}

}
