package day0723;

import java.util.Scanner;

public class Ex10Final_Exe {

	public static void main(String[] args) {

		/*
		 * [����1]
		 * ���� inp�� �Է¹޾� �迭�� ���°�� �ִ��� ���
		 * ������� "�����ϴ�" ���
		 * �ݺ��ؼ� �Է��ϴٰ� 0�Է½� ����
		 * 
		 * ��)
		 * �Է°� : 11
		 * 			11�� 2��°�� �־��!
		 * �Է°� : 100
		 * 			100�� �����ϴ�.
		 * �Է°� : 0
		 * 			�����մϴ�.
		 * */

		Scanner sc = new Scanner(System.in);
		int[] arr = {10,11,12,13,14,15};
		int inp;

		System.out.println("���ڸ� �Է��ض�");
		while(true) {
			inp = sc.nextInt();
			if(arr[i]==inp) {
				System.out.println(inp + "��(��) " + (i+1) + "��°�� �־��!");
			} else if(inp==0) {
				System.out.println("�����մϴ�");
				break;
			} 		
		}









	}

}
