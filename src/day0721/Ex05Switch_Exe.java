package day0721;

import java.util.Scanner;

public class Ex05Switch_Exe {

	public static void main(String[] args) {

		/*
		 * ���ڸ� �Է¹޾� �� ���ڰ� ¦������ Ȧ������ ���
		 * if��, switch������ ���
		 * */
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("if�� - ¦���Դϴ�.");
		} else {
			System.out.println("if�� - Ȧ���Դϴ�.");
		}
		
		
		switch(num%2) {
		case 0:
			System.out.println("switch�� - ¦���Դϴ�.");
			break;
		default:
			System.out.println("switch�� - Ȧ���Դϴ�.");
		}
		
	}

}
