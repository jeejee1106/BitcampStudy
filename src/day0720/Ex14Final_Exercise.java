package day0720;

import java.util.Scanner;

public class Ex14Final_Exercise {

	public static void main(String[] args) {
		/*
		 *����1. ��ǰ��� ����, �ܰ��� �Է¹޾� �� �ݾ��� ����ؼ� ����ϴµ�
		    ������ 5�� �̻��� ��쿡�� 10% DC�� �ݾ׵� ���� ������ּ���
		*���ǹ����� �ۼ��ϼ���
		*(��)
		*��ǰ��
		*����
		*����
		*6
		*�ܰ�
		*1000
		*[������]
		*��ǰ��:����
		*����:6��
		*�ܰ�:1000��
		*�� �ݾ�:6000��
		*DC�� �ݾ�:5400��
		*/
		System.out.println("<<���� ���� ���ϱ�>>");
		Scanner sc = new Scanner(System.in);
		String prod;
		int num = 0;
		int pri = 0;
		
		System.out.println("��ǰ �Է�");
		prod = sc.nextLine();
		System.out.println("���� �Է�");
		num = sc.nextInt();
		System.out.println("���� �Է�");
		pri = sc.nextInt();
		int total = num*pri;
		double dc = (total*0.1);
		
		System.out.println("��ǰ�� : " + prod);
		System.out.println("���� : " + num +"��");
		System.out.println("���� : " + pri + "��");
		System.out.println("�� �ݾ� : " + total + "��");
		if(num>=5) {
			System.out.println("DC�� �ݾ� : " + (total-dc) + "��");
		}
				
		System.out.println("");
		/*
		 * ����2. ������ �Է¹޾� ������ ���Ͻÿ�
		 * 90�̻��� A, 80�̻��� B, 70�̻��� C, 60�̻��� D, �������� F
		 * (���� �����ڸ� �̿�)
		 */
		System.out.println("<<���� ���ϱ�>>");
		System.out.println("������ �Է��ϼ���");
		int score;
		score = sc.nextInt();
		String mes;
		mes = score>=90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"F";
		System.out.println(score + "���� " + mes + "���� �Դϴ�.");
		
		
		
		
		
		
		
		
		
	}

}
