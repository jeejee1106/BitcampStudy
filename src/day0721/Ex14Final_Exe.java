package day0721;

import java.util.Scanner;

public class Ex14Final_Exe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*���� 1
		 * �μ� x,y�� �Է� �� x�� y���� for���� �̿��ؼ� ���Ͻÿ�
		 * ex)
		 * 4  3  �Է½�
		 * 4�� 3���� ~�Դϴ�.
		 * */
		System.out.println("1. x�� y�� ���ϱ� - x,y�� �Է��ض�");
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		int square = 1;
		for(int i = 1; i<=y; i++) {
			square*=x;
		} System.out.println(x+"�� "+y+"���� "+square+"�Դϴ�.");
		
		
		/*���� 2
		 * �� 10���� �پ��� ���ڸ� �Է¹޾� ����� ������ ������ ������ ���Ͻÿ�
		 * */
		int a = 0; //����� ������ ���� �׸�?
		int b = 0; //������ ������ ���� �׸�
		System.out.println("����2. 10�� ���ڸ� �Է��ض�");
		for(int i = 1; i<=10; i++) {
			int ran = sc.nextInt();
			if(ran>=1) {
				a+=1;
			} else if(ran<=-1) {
				b+=1;
			}
		} System.out.println("����� ����  : " + a 
				+ "\n������ ���� : " +b);
			
		
		/*���� 3
		 * ���ڸ� �Է½� ���丮�� ���� ���Ͻÿ�
		 * ex)
		 * 5 �Է½� 
		 * 5! = 120
		 * */
		System.out.println("3. ���丮�� ���ϱ� - ���ڸ� �Է��ض�");
		int num = sc.nextInt();
		int result = 1;
		for(int i = 1; i<=num; i++) {
			result*=i;
		} System.out.println(num + "! = " + result);
		
		
	}

}
