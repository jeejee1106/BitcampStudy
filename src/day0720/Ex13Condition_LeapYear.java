package day0720;

import java.util.Scanner;

public class Ex13Condition_LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�⵵�� �Է��ϸ� �ش� �⵵�� �������� ������� ����Ͻÿ�
		int year;
		System.out.println("�⵵ �Է�");
		year = sc.nextInt();
		
		//���ⱸ�ϴ� ���� �ܿ��α�!!!!!!!!
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
		}
	}

}
