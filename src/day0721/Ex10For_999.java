package day0721;

import java.util.Scanner;

public class Ex10For_999 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * ������ dan�� �Է¹��� �� 2~9�� �ƴ� ��� "�߸� �Է�.�����մϴ�" ����� ���α׷� ����
		 * �� �̿ܿ��� ������ ���
		 * ex) 5 �Է½�
		 * **5��**
		 * 5x1=5
		 * 5x2=10
		 * .....
		 */
		System.out.println("���ڸ� �Է��ϼ���.");
		int dan = sc.nextInt();
		System.out.println("**" + dan + "��**");
		for(int i = 1; i<=9; i++) {
			if(dan<2 || dan>9) {
				System.out.println("�߸��Է�. �����մϴ�.");
				return;
			} else {
//			System.out.println(dan + " x " + i + " = " + (dan*i));
			System.out.printf("%d x %d = %2d\n", dan, i, (dan*i));
			//�� �ΰ��� �ڵ�� ��°��� �ƿ� �Ȱ��� �ڵ��̴�.
			//println�� printf�� �ڵ带 ���غ�.
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
