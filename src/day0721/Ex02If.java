package day0721;

import java.util.Scanner;

public class Ex02If {

	public static void main(String[] args) {
		
		/*
		 * 3������ ������ �Է� �� ����� ���ϰ�
		 * ����� 60�̻��̰� �� ������ �� 40�̻��̸�
		 * "����� �հ��Դϴ�" ��� ���
		 * �ƴҰ�� "����� ���հ��Դϴ�"���
		 * 3���� ������ ���(�Ҽ���1�ڸ�)�� ���
		 * if������ ���
		 */
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		double avg;
		
		System.out.println("������ �Է��ϼ���");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		avg = (double)(kor+eng+mat)/3; //Q. avg�� ���������� ��µ� �� �� 3.0�̶�� ����ϴ��� �𸣰ڴ�.
		//A. ������ (kor+eng+mat)/3 ��� int������ �ۼ��Ǿ� �ִ�.
		//������� (100+100+35/3)�� �ϸ� 78.333�̴�.
		//�׷��� ������ ��� int�̱� ������ 78����µǰ�! �� �� 78�� �������� avg�� ���� ������
		//78�� ���������� ��ȯ�Ǿ� 78.0�� �ȴ�.
		//�׷��� ������ ���׿��� ���� �������� �������� �Ҽ����� ����� ����� �ȴ�!!!
		
		System.out.println("kor : " + kor + " eng : " + eng + " mat : " + mat );
		System.out.println("avg : " + (avg)); //���������θ� ���
		System.out.printf("avg : %.1f\n", avg); //�Ҽ���1�ڸ����� ���
		
		if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
			System.out.println("����� �հ��Դϴ�.");
		} else {
			System.out.println("����� ���հ��Դϴ�.");
		}
		
		
	}

}
