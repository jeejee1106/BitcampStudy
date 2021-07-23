package day0723;

import java.util.Date;
import java.util.Scanner;

public class Ex07Calendar_Exe2 {

	public static void main(String[] args) {
		
		/*
		 *�⵵�� ���� �Է� �� �޷� ����ϱ�
		 *
		 * �䱸����
		 * 1. ���� 1~12�� ����� ���޼����� �Բ� ���α׷� ����
		 * 2. �Ͽ��Ϻ��� ����ϼ����� ���
		 * 
		 * ��Ʈ : �޷��� ����� ���ؼ� �˾ƾ� �� ����
		 * 1. �� �⵵�� �� ���� ��ĥ���� �ִ���
		 * 2. �� �⵵�� ���� 1���� ���� ��������(DateŬ������ getday�� �̿�)
		 */
		
		Scanner sc = new Scanner(System.in);
		int year, month;
		Date date;
		int days;//���ϼ�
		int week; //���ϼ�
		System.out.println("�⵵ �� �Է�");
		year=sc.nextInt();
		month=sc.nextInt();
		//1. ���� 1~12�� ����� ���޼����� �Բ� ���α׷� ����
		if (month<1 || month>12) {
			System.out.println("�߸��Է�");
			return;
		}
		
		//date����
		date = new  Date(year-1900, month-1, 1);
		//���ϼ��� ���ϱ�
		week = date.getDay();
		//�Է��� �⵵�� ���� �� �ϼ� ���ϱ�
		switch(month) {
		case 2:
			if(year%4==0 && year%100!=0 || year%400==0) {
				days = 29;
			} else {
				days = 28;
			} break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		default:
			days = 31;
		}
		
		System.out.println("\t"+ year + "��" + month + "��\n");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("===================================================");
		//���� ���� ��ŭ �� ����
		for(int i = 1; i<=week; i++) {
			System.out.print("\t");
		}
		//1�Ϻ��� ����ϱ�
		for(int i = 1; i<=days; i++) {
			week++;
			System.out.print(i + "\t");
			if(week%7==0) { //������� ��� �ٳѱ�
				System.out.println();
			}
		}
		
		
		
		
		
		
		
//		int y, m, d;
//		String day;
//		boolean flag;
//		
//		System.out.println("�⵵�� ���� �Է��ϼ���");
//		y = sc.nextInt();
//		m = sc.nextInt();
//		Date fd = new Date(y-1900, m-1, 1);
//		
//		fd.getDay(); //�ش�⵵ �� 1���� ���� ���ڰ� ����� �ڵ�.
//		
//		flag = (y%4==0 && y%100!=0 || y%400==0); //true�� ���� false�� ���
//		if ((m==4)||(m==6)||(m==9)||(m==11)) {
//			d = 30;
//		} else if(m==2) {
//			if(flag==true) {
//				d = 29;
//			} else {
//				d = 28;
//			}
//		} else {
//			d = 31;
//		}
//
//		switch(fd.getDay()) {
//		case 0: day = "��"; break;
//		case 1: day = "��"; break;
//		case 2: day = "ȭ"; break;
//		case 3: day = "��"; break;
//		case 4: day = "��"; break;
//		case 5: day = "��"; break;
//		case 6: day = "��"; break;
//		}
//		
//		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
//		if(fd.getDay()==0 || d==30) {
//			for(int i = 1; i<=30; i++) {
//				if(i>7) {
//					System.out.println();
//				} System.out.print(i);
//			} 
//		}
		
		
		
		
		

	}

}
