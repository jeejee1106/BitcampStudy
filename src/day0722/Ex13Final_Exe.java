package day0722;

import java.util.Random;
import java.util.Scanner;

public class Ex13Final_Exe {

	public static void main(String[] args) {

		/*[����1]
		 * while�� ���, Math.random() ���
		 * while�� �ȿ��� �빮�ڸ� ���Ƿ� ������� �� ���ڸ� �Է��Ͽ� �������
		 * cnt ���� 1 ����
		 * �Է½� q �� Q �� �Է��ϸ� ����������
		 * �� ���ĺ� 10���� 5�� ����
		 * (��)
		 * G
		 * ���߱� : G
		 * Y
		 * ���߱� :K
		 * J
		 * ���߱� : q
		 * �� 2������ 1�� ����
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			int cnt = 0;
//			char a = (char)((Math.random()*26)+65);
//			System.out.println(a);
//			System.out.print("���߱� : ");
//			char b = (char)sc.nextInt();
//			if(a==b) {
//				cnt++;	
//			} else if(b==1) {
//				break;
//			}
//			System.out.println("��" + cnt + "���� ����");
//		}
//		
//		
//		char uni = 'A';
//		int num = 65;
//		for(int i =1; i<=26; i++) {
//			System.out.println(uni++ + "=" + num++);
//		}
		
		/*
		 * [����2]
		 * Random Ŭ���� ���
		 * 1~100 ������ ������ ������ ���� rnd �� ������
		 * �� ���� �˾Ƹ��߱�
		 * (��)
		 *  50 �̶�� ������ rnd�� ����Ǿ��ִ� �Ұ��
		 *  1 : 40
		 *      40���� Ů�ϴ�
		 *  2 : 70
		 *      70���� �۽��ϴ�
		 *  3 : 60 
		 *      60���� �۽��ϴ�
		 *  4 : 50
		 *    ¦¦¦. �����Դϴ� (����� while�� ����������)
		*/
		
		
		System.out.println("1���� 100���� ���� �� �ϳ��� �Է��ϼ���");
		Random rand = new Random();
		int rnd = rand.nextInt(100)+1;
		int n=1;
		while(true) {
			System.out.println("��ȸ" + n);
			int a = sc.nextInt();
			n++;
			if(a==rnd) {
				System.out.println("¦¦¦. �����Դϴ�.");
				break;
			} else if(a>rnd) {
				System.out.println(a + "���� �۽��ϴ�.");
			} else {
				System.out.println(a + "���� Ů�ϴ�.");
			}
		}
		
		
		
		
	}

}
