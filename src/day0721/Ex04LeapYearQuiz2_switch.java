package day0721;

import java.util.Scanner;

public class Ex04LeapYearQuiz2_switch {

	public static void main(String[] args) {
		
		/*
		 * �⵵�� ���� �Է¹޾� ���ذ� �������� ������� ����ϰ�
		 * �ش� ���� ���ϱ��� �ִ��� ����Ͻÿ�
		 * */
		
		Scanner sc = new Scanner(System.in);
		int year, month, days;
		boolean flag;
		System.out.println("�⵵�� ���� �Է����ּ���.");
		year = sc.nextInt();
		month = sc.nextInt();
		//�� �߸� �Է½� ���α׷� ����
		if(month<1 || month>12) {
			System.out.println("���� �߸� �Է��߾��");
			return; //���� �޼��� ����
		} 
		
		flag = year%4==0 && year%100!=0 || year%400==0;
		//true�� ��������. if(flag) �̷� ������ ���� ����. false�� ����ϰ� ���� ��� if(!flag)
		if(flag==true) { 
			System.out.println(year + "��� �����Դϴ�.");
		} else {
			System.out.println(year + "��� ����Դϴ�.");
		}
		
		//if������!!!!!!
//		if ((month==4)||(month==6)||(month==9)||(month==11)) {
//			days = 30;
//		} else if(month==2) {
//			if(flag==true) {
//				days = 29;
//			} else {
//				days = 28;
//			}
//		} else {
//			days = 31;
//		}
//		System.out.println(year + "��" + month + "����" + days + "�� ���� �ֽ��ϴ�.");
		
//		if ((month==4)||(month==6)||(month==9)||(month==11))
//			days = 30;
//		else if(month==2) {
//			if (flag)
//				days = 29;
//			else
//				days = 28;
//		} else
//			days = 31;
		
		//switch������!!!!!!
		switch(month) {
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		case 2:{
			if(flag) {
				days = 29;
			} else {
				days = 28;
			}
		}
		break;
		default:
			days = 31;
		}


		System.out.println(year + "��" + month + "����" + days + "�� ���� �ֽ��ϴ�.");
		
		
	}

}
