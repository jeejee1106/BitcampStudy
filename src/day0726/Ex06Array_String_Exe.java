package day0726;

import java.util.Scanner;

public class Ex06Array_String_Exe {

	public static void main(String[] args) {

		/*
		 * ���� �Է� �ӱ� ������ ���� ����� �� �ο��� ���
		 * ������ �Է½� ���α׷� ����
		 * */
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"�ֿ���", "�輱��", "������", "������", "������", "��â��",
				"��ν�", "��ȣ��", "����ȣ"};
		String search;
		
		System.out.println("���� �Է��ϼ���.");
		while(true) {
			int cnt=0; //�˻��� �� ���� 0���� �ʱ�ȭ �ؾ��ϱ� ������ while�� �ȿ� �־����
			search = sc.nextLine();
			if(search.equals("����")) {
				System.out.println("���α׷� ����");
				break;
			}
			for(int i = 0; i<name.length; i++) {
				if(name[i].startsWith(search)) {
					System.out.println(name[i]);
					cnt++;
				}		
			} System.out.println(search + "�� ���� ���� ����� ��" + cnt + "�� �Դϴ�.");
			
		}  
		
		
		
		////
//		boolean find=false;
//		cnt=0;//�˻��Ҷ����� 0���� �ʱ�ȭ�� �ʿ���
//		for(int i=0;i<names.length;i++)
//		{
//			if(names[i].startsWith(search))
//			{
//				cnt++;
//				System.out.println(i+":"+names[i]);
//				find=true;
//			}
//		}
//		if(find)
//			System.out.println("\t��"+cnt+"�� �˻�");
//		else
//			System.out.println(search+"������ ��������� �����ϴ�");
//		System.out.println();
//	}

		
		
		
		
		
		
		
	}

}
