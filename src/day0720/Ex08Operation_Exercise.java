package day0720;

import java.util.Scanner;

public class Ex08Operation_Exercise {

	public static void main(String[] args) {
		/*
		 * ���޿��� �Է��Ͽ� ����, õ��, ���, �ʿ�, �Ͽ� ������ ����Ͻÿ�
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//�� �ڵ�
//		int money;
//		System.out.println("�ݾ��� �Է��ϼ���");
//		money = sc.nextInt();
//		
//		System.out.println("���� : " + money/10000);
//		System.out.println("õ�� : " + (money%10000)/1000);
//		System.out.println("��� : " + ((money%10000)%1000)/100);
//		System.out.println("�ʿ� : " + (((money%10000)%1000)%100)/10);
//		System.out.println("�Ͽ� : " + ((((money%10000)%1000)%100)/10)/1);
		
		//����� �ڵ�
		int money;
		System.out.println("�ݾ��� �Է��ϼ���");
		money = sc.nextInt();
		System.out.println("���� : " + money/10000);
		System.out.println("õ�� : " + (money%10000)/1000);
		System.out.println("��� : " + (money%1000)/100);
		System.out.println("�ʿ� : " + (money%100)/10);
		System.out.println("�Ͽ� : " + (money%10));

		
	}

}
