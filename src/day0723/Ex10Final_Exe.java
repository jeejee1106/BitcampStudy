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

//		Scanner sc = new Scanner(System.in);
//		int[] arr = {10,11,12,13,14,15};
//		int inp;
//
//		System.out.println("���ڸ� �Է��ض�");
//		Exit:
//		while(true) {
//			inp = sc.nextInt();
//			for(int i = 0; i<arr.length; i++) {
//				if(inp==arr[i]) {
//					System.out.println(inp + "��(��) " + (i+1) + "��°�� �־��!");
//				} else if(inp==0) {
//					System.out.println("�����մϴ�");
//					break Exit;
//				}
//			}
//		}

		//����� �ڵ�
		Scanner sc = new Scanner(System.in);
		
		int []arr2= {23,11,56,77,13,9,1,6,90,34,22};
		int inp;
		
		while(true)
		{
			System.out.print("�Է°�:");
			inp=sc.nextInt();
			if(inp==0)
			{
				System.out.println("�����մϴ�");
				break;//while���� ���������鼭 ����
			}
			
			boolean find=false;//�ݺ��� �ȿ��� ã������� true�� �����Ұ�
			//�迭 ������ŭ �ݺ��ؼ� �Է��Ѽ��� ã��
			for(int i=0;i<arr2.length;i++)
			{
				if(inp==arr2[i])
				{
					find=true;//ã�Ҵٴ� �ǹ̷� true�� ����
					System.out.println("\t"+(i+1)+"��°�� �־��!");
				}
			}
			
			//�迭�� ���°�� find �� ������ false�̴�
			if(!find)
			{
				System.out.println("\t"+inp+"�� �迭�� �����ϴ�");
			}
			System.out.println();
		}





	}

}
