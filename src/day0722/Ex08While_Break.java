package day0722;

import java.util.Scanner;

public class Ex08While_Break {

	public static void main(String[] args) {
		
		System.out.println("<<<<<break>>>>>");
		int n = 1;
		while(n<10) { //������ n�� 10���� ���� �� ���� �ݺ�.
			System.out.print((n++) + " "); //n�� 1�� Ŀ���� ���� ���. ��������? 10�� �Ǳ� ������
		} 
		
		System.out.println();
		
		n = 1;
		while(true) { //������ ������ Ʈ��.
			System.out.print((n++) + " "); //������ Ʈ��ϱ� n�� 1�� Ŀ���鼭 ���.
			if(n>10) { //�ٵ� n�� 10���� Ŀ����
				break; //����ž�!
			}
		} System.out.println();
		
		
		System.out.println("<<<<<continue>>>>>");
		//whlie������ continue�� ������ ���ǽ��� �̵��Ѵ�
		//���ǽ��� true�� ��� ù��°���� �ڵ���� �ٽ� ����
		
		/*
		 * ������ 0�̸� while���� �������´�
		 * ������ �Է¹޴µ� 1~100�� �ƴ� ��� �ٽ� �Է¹ޱ�
		 * �׸��� ����� �� ������ ���� ���ϱ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int count = 0;
		while(true) {
			int score = sc.nextInt();
			if(score==0) {
				System.out.println("����");
				break;
			} else if(score<0 || score>100) {
				System.out.println("���� �ٽ� �Է�");
				continue;
			} else {
				count++;
				System.out.println("���� : " + score);
				System.out.println("������ ���� : " + count);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
