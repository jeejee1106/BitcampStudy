package day0722;

import java.util.Scanner;

public class Ex10While_Exe {

	public static void main(String[] args) {
		
		/*
		 * 1. ���̸� �ݺ��ؼ� �Է¹޴´�
		 * 2. 0�� �Էµǐ� �������ͼ� ���
		 * 3. ���̰� 50�̻��� ��� a���� ����
		 *    30 �̻��� ��� b���� ����
		 *    �� �������� c���� ����
		 * 4. �������� �� ��³���
		 *    50�� �̻� : 3��
		 *    30�� �̻� : 2��
		 *    �� �̿� : 1��
		 * */
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("���� �Է�");
		while(true) {
			int age = sc.nextInt();
			if(age<=0) {
				break;
			} else if(age>=50) {
				a++;
			} else if(age>=30) {
				b++;
			} else {
				c++;
			}
		}
		System.out.println("50�� �̻� : " + a);
		System.out.println("30�� �̻� : " + b);
		System.out.println("�� �̿� : " + c);
		
		
		System.out.println();
		
		sc.nextLine();
		
		/*
		 *   ������ �ݺ��ؼ� �Է��ϴٰ� q �� Q �� �Է��ϸ� 
		 *   while���� ���������� �� ����, ����,����� ���ؼ� ����Ͻÿ�
		 */
		int sum=0, cnt=0;
		double avg;
		while(true) {
			System.out.println("�����Է�");
			String score = sc.nextLine();	/////////���� ������ ������ ���µ� �� ������ ���� ������ ������ ���� ������ �𸣰���!!!!!!!
			//���� �˰���... 27��° �ٿ��� nextInt�� �־����� 55��° �ٿ��� nextLine�� �־��� �� ������ �ȵȴ�.
			//nextInt ���� nextLine�� �־��� �� ������ ���� ��츦 �ٽ� ��������.
			//�ذ������� 45��° �ٿ� nextLine���־��־����� �� �۵��Ѵ�.
			if(score.charAt(0)=='q'||score.charAt(0)=='Q') { 
				break;
			} 
			cnt++;
			sum+=Integer.parseInt(score);
		}
		avg = (double)sum/cnt;
		System.out.println("**������**");
		System.out.println("���� ���� : " + cnt);
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.1f\n", avg);
		
		
		
		//����� �ڵ�
//		String score;
//		int sum=0,cnt=0;
//		double avg;
//		
//		while(true)
//		{
//			System.out.println("���� �Է�");
//			score=sc.nextLine();
//			//�Է��� ���ڿ��� ù���ڰ� q�ų� Q�� �ݺ��� ����������
//			if(score.charAt(0)=='q' || score.charAt(0)=='Q')
//				break;
//			cnt++;//���� ����
//			sum+=Integer.parseInt(score);//������ ��ȯ�� �հ躯���� ���ϱ�
//		}
//		//����� ������ ������ �ѹ��� ������ �ǹǷ� ���ͼ� ����ص� �ȴ�
//		avg=(double)sum/cnt;//�Ѵ� ����Ÿ���̹Ƿ� ��Ȯ�� ������ �ϱ����ؼ� double�� ����ȯ
//		System.out.println("** ��� ��� **");
//		System.out.println("���� ����:"+cnt);
//		System.out.println("���� :"+sum);
//		System.out.printf("��� : %.1f\n",avg);
		

	}

}
