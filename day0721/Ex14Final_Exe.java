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
//		System.out.println("���� �� ���� �Է��ض�");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		for(int i = 1; i<=y; i++) {
//			System.out.println(x);
//		}
		//
		
		/*���� 2
		 * �� 10���� �پ��� ���ڸ� �Է¹޾� ����� ������ ������ ������ ���Ͻÿ�
		 * */
		System.out.println("����2. 10�� ���ڸ� �Է��ض�");
		for(int i = 1; i<=10; i++) {
			int ran = sc.nextInt();
			if(ran>0) {
				
			}
		}
		
		
		
		
		/*���� 3
		 * ���ڸ� �Է½� ���丮�� ���� ���Ͻÿ�
		 * ex)
		 * 5 �Է½� 
		 * 5! = 120
		 * */
		System.out.println("����3. ���ڸ� �Է��ض�");
		int num = sc.nextInt();
		int fac = 1;
		for(int i = 1; i<=num; i++) {
			fac *=i;
		} System.out.println(num + "! = " + fac);
		
		
		
	}

}
