package day0720;

import java.util.Scanner;

public class Ex10Condition {

	public static void main(String[] args) {
		
		/*
		 * �� ���� �Է��Ͽ� �� ū ���� ����Ͻÿ�
		 * if���� ���ǿ����ڸ� �̿��Ͽ� ����� ����غ���
		 */
		Scanner sc = new Scanner(System.in);
		int x,y,max;
		System.out.println("�� �� �Է�");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("<if��>");
		if(x>y)
			max=x;
		else
			max=y;
		System.out.println("max = " + max);
		
		////////////////////////////////////////////
		System.out.println("<���� ������>");
		max = x>y?x:y; // ���ǽ�?true��:false��
		System.out.println("max = " + max);
	}

}
