package day0726;

import java.util.Scanner;

public class Ex04Array_Rank {

	public static void main(String[] args) {
		
		/*
		 * ����� �ο����� ���� �Է�. �� �ο�����ŭ �̸��� ������ �Է��� ��
		 * �Է��� �����Ϳ� ����� ����ϰ�, ��ü�հ�� ����� ���Ͻÿ�
		 * */
		Scanner sc = new Scanner(System.in);
		
		int inwon;
		String[] name;
		int[] score;
		int[] rank;
		int tot = 0;
		double avg = 0;
		
		System.out.println("�ο����� �Է��Ͻÿ�");
		inwon = Integer.parseInt(sc.nextLine());
		//�ο�����ŭ �迭 �Ҵ�
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		//�ο�����ŭ ����Ÿ �Է�
		for(int i = 0; i<inwon; i++) {
			System.out.println(i + "���� �̸�");
			name[i] = sc.nextLine();
			System.out.println(i + "��������");
			score[i] = Integer.parseInt(sc.nextLine());
			
			//����
			tot+=score[i];
		}
		
		//��� ���ϱ� - ���� ������.
		for(int i = 0; i<inwon; i++) {
			rank[i] = 1;
			for(int j = 0; j<inwon; j++) {
				if(score[i]<score[j]) {
					rank[i]++; //i++�ϰ� i+1�ϰ� �ٸ���?�̤�
				}
			}
		}
		
		//���
		avg = (double)tot/inwon;
		
		
		//���
		System.out.println("��ȣ\t�̸�\t����\t���");
		System.out.println("======================");
		for(int i = 0; i<inwon; i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		System.out.println("======================");
		System.out.println("����  = " + tot);
		System.out.println("���  = " + avg);
		
		

	}

}
