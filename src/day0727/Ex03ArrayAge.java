package day0727;

import java.util.Scanner;

public class Ex03ArrayAge {

	public static void main(String[] args) {
		
		/*
		 * �� 10���� ���̸� �Է¹޾� ���� �������� ���
		 * 
		 * ex)
		 * 10��:2��   20��:3��   30��:5��   40��:1��   50��:0��
		 * 10�� �̻��̰ų� 60�� �̻��� ����
		 * 
		 * ���� ���� ��� �� ���̺� �ο��� ���
		 * */
		
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		int[] inwon = new int[5]; //10���� ��� index[0] ���� ...
		
		for(int i = 0; i<age.length; i++) {
			System.out.print("�����Է� : ");
			age[i] = sc.nextInt();
			if(age[i]<10 || age[i]>=60) {
				continue;
			} else if(age[i]/10==(i+1)) {
				inwon[i]++;
			}
		} 
		for(int i = 0; i<inwon.length; i++) {
//		System.out.println(i+1 + "0�� : " + inwon[i] + "��");
		System.out.printf("%d�� : %d��", (i+1)*10, inwon[i]);
		}
		
		
		
		

	}

}
