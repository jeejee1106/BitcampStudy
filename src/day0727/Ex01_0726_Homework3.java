package day0727;

import java.util.Scanner;

public class Ex01_0726_Homework3 {
	
	public static void main(String[] args) {
		
		/*���� 3
		 * int[] alpha = new int[26];
		 * ���� ������ �Է� �� �м��Ͽ� �� ���ĺ��� ������ ���� �� ����Ͻÿ�.
		 * (���ٿ� ���ĺ� 7���� ���)
		 * ���ڿ����� �ѱ��ھ� ������ charAt �� ���
		 * ������ ���ڰ� B�ϰ�� alpha[1]++ 
		 * */
		Scanner sc = new Scanner(System.in);
		
		int []alpha=new int[26];//0���� �ʱ�ȭ
		String msg;
		System.out.println("���� ���� �Է�");
		msg=sc.nextLine();
		//�� ���ڸ� �����Ͽ� a(A)�� 0���� ����...
		for(int i=0;i<msg.length();i++) {
			char ch = msg.charAt(i); //i������ �ش��ϴ� char ���� ����
			if(ch>='A' && ch<='Z') {
				alpha[ch-'A']++; //�빮���ΰ�� 'A' �� ���� 0~25 �� ���� �߻�
			} else if(ch>='a' && ch<='z')
				alpha[ch-'a']++; //�ҹ����ΰ�� 'a' �� ���� 0~25 �� ���� �߻�
		}

		//���ٿ� 7���� �迭�� ����ϱ�
		for(int i=0;i<alpha.length;i++) {
			System.out.print((char)('A'+i)+":"+alpha[i]+"\t");
			if((i+1)%7==0) {
				System.out.println();
				}				
		}
		
		
		
	}

}
