package day0720;

import java.util.Scanner;

public class Ex07Operator_Arithmetic {

	public static void main(String[] args) {
		//�� ���� �Է� �� ��� �����ڸ� �̿��Ͽ� ����غ���
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("�� ���� �Է��� �ּ���");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("���ϱ� = " + (x+y));
		System.out.println("���� = " + (x-y));
		System.out.println("���ϱ� = " + (x*y));
		System.out.println("������ = " + (double)(x/y));
		System.out.println("������ = " + (x%y));
		

	}

}
