import java.util.Date;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		////////////////////////////////0721 13��/////////////////////////////////////
		/*
		 * �� 5���� ������ �Է� �޾� �հ踦 ���غ���
		 * ������ 1���� �۰ų� 100���� ũ�� �ٽ� �Է¹����ÿ�
		 * ex)
		 * 1�� ���� : 90
		 * 2�� ���� : 120
		 * 	�߸��Է��߾��
		 * 2�� ���� : 100
		 * 3�� ���� : 50
		 * ...
		 * 
		 */

		//�� ��° Ǯ��
		//		Scanner sc = new Scanner(System.in);
		//		int sum = 0;
		//		int score;
		//		System.out.println("�����Է�");
		//		for(int i = 1; i<=5; i++) {
		//			System.out.print(i + "�� ���� : ");
		//			score = sc.nextInt();
		//			if(score<0 || score>100) {
		//				System.out.println("�߸��Է�");
		//				i--;
		//				continue;
		//			} sum+=score;
		//		} System.out.println("������ ���� : " + sum);

		//0724 �� ��° Ǯ��




		///////////////////////////////////�޷¸����/////////////////////////////////
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

		//		Scanner sc = new Scanner(System.in);
		//		int year, month;
		//		Date date;
		//		int days;//���ϼ�
		//		int week; //���ϼ�
		//		System.out.println("�⵵ �� �Է�");
		//		year=sc.nextInt();
		//		month=sc.nextInt();
		//		//1. ���� 1~12�� ����� ���޼����� �Բ� ���α׷� ����
		//		if (month<1 || month>12) {
		//			System.out.println("�߸��Է�");
		//			return;
		//		}
		//		
		//		//date����
		//		date = new  Date(year-1900, month-1, 1);
		//		//���ϼ��� ���ϱ�
		//		week = date.getDay();
		//		//�Է��� �⵵�� ���� �� �ϼ� ���ϱ�
		//		switch(month) {
		//		case 2:
		//			if(year%4==0 && year%100!=0 || year%400==0) {
		//				days = 29;
		//			} else {
		//				days = 28;
		//			} break;
		//		case 4: case 6: case 9: case 11:
		//			days = 30;
		//			break;
		//		default:
		//			days = 31;
		//		}
		//		
		//		System.out.println("\t"+ year + "��" + month + "��\n");
		//		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		//		System.out.println("===================================================");
		//		//���� ���� ��ŭ �� ����
		//		for(int i = 1; i<=week; i++) {
		//			System.out.print("\t");
		//		}
		//		//1�Ϻ��� ����ϱ�
		//		for(int i = 1; i<=days; i++) {
		//			week++;
		//			System.out.print(i + "\t");
		//			if(week%7==0) { //������� ��� �ٳѱ�
		//				System.out.println();
		//			}
		//		}






		//////////////////////////////////////0723 ����//////////////////////////////////////
		/*
		 * [����1]
		 * ���� inp�� �Է¹޾� �迭�� ���°�� �ִ��� ���
		 * ������� "�����ϴ�" ���
		 * �ݺ��ؼ� �Է��ϴٰ� 0�Է½� ����
		 * 
		 * ��)
		 * �Է°� : 11
		 * 			11�� 2��°�� �־��!
		 * �Է°� : 100
		 * 			100�� �����ϴ�.
		 * �Է°� : 0
		 * 			�����մϴ�.
		 * */













	}

}
