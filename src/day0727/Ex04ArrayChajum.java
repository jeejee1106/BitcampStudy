package day0727;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04ArrayChajum {

	public static void main(String[] args) {

		/*
		 * 5���� ���� �Է��ϸ� oxä�� �� ���� ������ ���� ���� ����ϱ�
		 * 
		 * ex)
		 * 5���� ���� �Է����ּ���
		 * 	125
		 * ���׼��� �����մϴ�
		 * 	12ab5
		 * ���ڷθ� �Է����ּ���
		 * 	13124
		 * 1��:O   2��:X   3��:X   4��:O   5��:O
		 * ���䰹��:3   ���䰹��:2
		 * */

		Scanner sc = new Scanner(System.in);

		String jung = "12345"; //����
		String inp; //�� �Է¹ޱ�
		char[] ox = new char[5]; //�����̸� 'O', �����̸� 'X'
		int jcnt = 0; //���䰹��
		int ocnt = 0; //���䰹��

		System.out.println("5���� ���� �Է����ּ���.");

		Loop:
			while(true) {
				inp = sc.nextLine();
				if(inp.length()<jung.length()) {
					System.out.println("���׼��� �����մϴ�.");
					continue;
				}
				for(int i=0;i<5;i++)
				{
					char ch=inp.charAt(i);
					if(!(ch>='1' && ch<='9'))
					{
						System.out.println("\t���ڷθ� �Է����ּ���");
						continue Loop;//while �� ���ǽ����� �̵�
					}

				}


				if(inp.length()==jung.length()) {
					break;
				}
			}


		char[] arr = jung.toCharArray();
		char[] arr2 = inp.toCharArray();

		System.out.println("���� : " + Arrays.toString(arr));
		System.out.println("���� �� �� : " + Arrays.toString(arr2));


		//�������� �������� üũ�ϰ� ī��� ++
		for(int i = 0; i<ox.length; i++) {
			if(arr[i]==arr2[i]) {
				jcnt++;
				System.out.print((i+1) + "��:O\t" );
			} else {
				ocnt++;
				System.out.print((i+1) + "��:X\t" );
			}
		}System.out.println();
		System.out.println("���䰹�� : " + jcnt);
		System.out.println("���䰹�� : " + ocnt);


		//����� �ڵ�
		//		String jungdap = "12345"; //����
		//		String inp; //�� �Է¹ޱ�
		//		char[] ox = new char[5]; //�����̸� 'O', �����̸� 'X'
		//		int jcnt = 0; //���䰹��
		//		int ocnt = 0; //���䰹��
		//
		//		Loop:
		//			while(true)
		//			{
		//				System.out.println("5���� ���� �Է����ּ���");
		//				inp=sc.nextLine();
		//				if(inp.length()<5)
		//				{
		//					System.out.println("\t���׼��� �����մϴ�");
		//					continue;//���ǽ����� �̵�
		//				}
		//
		//				for(int i=0;i<5;i++)
		//				{
		//					char ch=inp.charAt(i);
		//					if(!(ch>='1' && ch<='9'))
		//					{
		//						System.out.println("\t���ڷθ� �Է����ּ���");
		//						continue Loop;//while �� ���ǽ����� �̵�
		//					}
		//
		//				}
		//				break;//���� 2������ �ش� �ȵȴٸ� while���� ����������		
		//			}
		//
		//		//���� ��
		//		for(int i=0;i<jungdap.length();i++)
		//		{
		//			char j=jungdap.charAt(i);//������ ù��° ����
		//			char mydap=inp.charAt(i);//���� �Է��� ���� ù��° ����
		//			if(j==mydap)//����� ���� ���
		//			{
		//				ox[i]='O';
		//				jcnt++;
		//			}else {//����� �ٵ���
		//				ox[i]='X';
		//				ocnt++;
		//			}
		//		}
		//
		//		System.out.println("** ��� ��� **");
		//		for(int i=0;i<ox.length;i++)
		//		{
		//			System.out.print(i+1+"��:"+ox[i]+"  ");
		//		}
		//		System.out.println();
		//		System.out.println("���䰹��:"+jcnt+"  ���䰹��:"+ocnt);













	}

}
