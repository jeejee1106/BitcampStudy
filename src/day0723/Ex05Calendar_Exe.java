package day0723;

import java.util.Date;
import java.util.Scanner;

public class Ex05Calendar_Exe {

	public static void main(String[] args) {
		
		/*
		 * �¾ �⵵�� �Է¹޾� ���̿� �츦 ���Ͻÿ�
		 * (��Ʈ: ���� 1���� �߶����̴�)
		 * �䱸����
		 * 1. ���� �⵵�� DateŬ���� �̿�
		 * 2. ��� switch������ �ۼ�
		 */
		
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		
		int y = date.getYear()+1900;
		System.out.println("�¾ �ظ� �Է��ض�");
		int birth = sc.nextInt();
		System.out.println("���� : " + (y-birth+1));
		
		switch(birth%12){
		case 0:
			System.out.println("�� : ������");
			break;
		case 1:
			System.out.println("�� : ��");
			break;
		case 2:
			System.out.println("�� : ��");
			break;
		case 3:
			System.out.println("�� : ����");
			break;
		case 4:
			System.out.println("�� : ��");
			break;
		case 5:
			System.out.println("�� : ��");
			break;
		case 6:
			System.out.println("�� : ȣ����");
			break;
		case 7:
			System.out.println("�� : �䳢");
			break;
		case 8:
			System.out.println("�� : ��");
			break;
		case 9:
			System.out.println("�� : ��");
			break;
		case 10:
			System.out.println("�� : ��");
			break;
		case 11:
			System.out.println("�� : ��");
			break;
		}
		
		

	}

}
