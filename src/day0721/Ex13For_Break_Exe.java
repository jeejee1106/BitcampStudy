package day0721;

import java.util.Scanner;

public class Ex13For_Break_Exe {
	
	public static void main(String[] args) {
		
		/*
		 * �� 5���� ������ �Է� �޾� �հ踦 ���غ���
		 * ������ 1���� �۰ų� 100���� ũ�� �ٽ� �Է¹����ÿ�
		 * ex)
		 * 1�� ���� : 90
		 * 2�� ���� : 120
		 * 	�߸��Է��߾��
		 * 2�� ���� : 100
		 * 3�� ���� : 50
		 * ...
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int score;
		System.out.println("�����Է�");
		for(int i = 1; i<=5; i++) {
			score = sc.nextInt();
			if(score<0 || score>100) {
				System.out.println("�߸��Է�");
				continue;
			} System.out.println("");
		}
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.println("���� �Է�");
//		for(int i = 1; i<=5; i++) {
//			int score = sc.nextInt();
//			if(score<0 || score>100) {
//				System.out.println("	<�߸� �Է�>");
//				i--;
//				continue;
//			}
//			System.out.println(i + "�� ���� : " + score);
//			sum=+score;
//		} System.out.println("���� : " + sum);
		
		//����� �ڵ�
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int score;
//		for(int i=1; i<=5; i++) {
//			System.out.print(i + "�� ����");
//			score = sc.nextInt();
//			if(score<1 || score>100) {
//				System.out.println("\t�߸��Է�");
//				i--;
//				continue;
//			} sum+=score;
//		} System.out.println("���� : " + sum);
		
		
	}

}
