package day0723;

import java.util.Random;
import java.util.Scanner;

public class Ex01Exe {

	public static void main(String[] args) {
		//������ ���߸� ������ ������ ������� ������ �� ����
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("1���� 100���� ���� �� �ϳ��� �Է��ϼ���");
		int num;
		int n;
		int a;
		Exit:
			while(true){
				n=1;
				num=rand.nextInt(100)+1;
				while(true) {
					System.out.print("��ȸ" + n++ + " : ");
					a = Integer.parseInt(sc.nextLine());
					if(a==num) {
						System.out.println("¦¦¦. �����Դϴ�.");
						System.out.println("������ ��� �Ϸ��� y�� �����ּ���");
						char ans = sc.nextLine().charAt(0);
						if(ans=='y'||ans=='Y') {
							System.out.println("���ο� ������ ���۵˴ϴ�.");
							continue Exit; //�ٱ��� while���� ���ǽ����� �̵�
						} else {
							System.out.println("***��������***");
							break Exit; //�ٱ��� while���� ���������� ������ ����
						}
					} else if(a>num) {
						System.out.println(a + "���� �۽��ϴ�.");
					} else {
						System.out.println(a + "���� Ů�ϴ�.");
					}
				} 
			} System.out.println("***����***");





	}

}
