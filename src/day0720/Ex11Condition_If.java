package day0720;

import java.util.Scanner;

public class Ex11Condition_If {

	public static void main(String[] args) {
		
		/*
		 * ���� ���� �Է��Ͽ� �� ū ���� ����Ͻÿ�
		 * if���� ���ǿ����ڸ� �̿��Ͽ� ����� ����غ���
		 */
		Scanner sc = new Scanner(System.in);
		int x,y,z,max;
		System.out.println("������ �� �Է�");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		System.out.println("<if��>");
		if(x>y && x>z)
			max=x;
		else if (y>x && y>z)
			max=y;
		else
			max = z;
		System.out.println("max = " + max);
		
		////////////////////////////////////////////
		System.out.println("<���� ������>");
		max = x>y&&x>z?x:y>x&&y>z?y:z; // ���ǽ�?true��:false��
		System.out.println("max = " + max);
	}

}
