package day0720;

import java.util.Scanner;

public class Ex12Condition_Operation {

	public static void main(String[] args) {

		/*
		 * ������ �Է¹޾� 90�̻��̸� "�� ���߾��!"
		 * 80�̻��̸� "�� �� ����ϼ���."
		 * �������� "�����!!"
		 */
		Scanner sc = new Scanner(System.in);
		int score;
		String mes;
		
		
		//if������ �޼��� ���� �� ���
		System.out.println("<if������ ���ϱ�>");
		System.out.println("������ �Է��ϼ���");
		score = sc.nextInt();
		if (score>=90) 
			mes = "�� ���߾��!";
		 else if(score>=80)
			mes = "�� �� ����ϼ���";
		 else
			mes = "�����!!";
		System.out.println(mes);
		
		
		//���ǿ����ڷ� �޼��� ���� �� ���. ���� ������ ���� �ڵ�
		System.out.println("<���� �����ڷ� ���ϱ�>");
		mes = score>=90?"�� ���߾��!":score>=80?"�� �� ����ϼ���.":"�����!!";
		System.out.println(mes);
		
		
	}

}
