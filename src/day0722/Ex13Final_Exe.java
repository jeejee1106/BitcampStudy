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
//		int cnt = 0;
//		while(true) {
//			char a = (char)((Math.random()*26)+65);
//			System.out.println(a);
//			System.out.print("���߱� : ");
//			char b = (char)sc.nextInt(); //�� �ڵ尡 �߸��ż� ����� ������ ����.
//			if(b=='q'||b=='Q') {
//				System.out.println("����");
//				break;
//			}
//			if(a==b) {
//				System.out.println("����");
//				cnt++;	
//			} else {
//				System.out.println("����");
//			}
//		}
		
		
		//����� �ڵ�
//		int cnt = 0; //���᰹��
//		int allcnt = 0; //�� ���� ����
//		char rnd, inp;
//		while(true) {
//			rnd=(char)((Math.random()*26)+65); //�����ϰ� ���ĺ� �빮�� ���
//			System.out.println(rnd);
//			inp = sc.nextLine().charAt(0); //�Է��ϴ� ���ڿ��� ù���ڸ� ���
//			if(inp=='q'||inp=='Q') { //�����ڵ�
//				break;
//			}
//			allcnt++; //�������� ����
//			if(inp==rnd) {
//				System.out.println("����");
//				cnt++; //�¾��� ��� ����
//			} else {
//				System.out.println("����");
//			}
//		}
//		//�������� �� ���
//		System.out.println("��" + allcnt + "������ " + cnt + "�� ����!");
		
		
		
		
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
		
		for(int i = 1; i<=5; i++) { //for���� ���� �׳� �� �� �־���� �� �ȴ����� �̾ ���� ��� �ϰ� �;! ���� 5�� �ݺ�!
			System.out.println("1���� 100���� ���� �� �ϳ��� �Է��ϼ���");
			Random rand = new Random();
			int num = rand.nextInt(100)+1;
			int n=1;
			while(true) {
				System.out.print("��ȸ" + n + " : ");
				int a = sc.nextInt();
				n++;
				if(a==num) {
					System.out.println("¦¦¦. �����Դϴ�.");
					break;
				} else if(a>num) {
					System.out.println(a + "���� �۽��ϴ�.");
				} else {
					System.out.println(a + "���� Ů�ϴ�.");
				}
			} System.out.println("***����***");
		
		}
		
		
	}

}
