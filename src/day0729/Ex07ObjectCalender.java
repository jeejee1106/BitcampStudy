package day0729;

import java.util.Date;
import java.util.Scanner;

public class Ex07ObjectCalender {
	int year;
	int month;
	int endday; //�� ���� ��ĥ���� �ִ���
	int week; //���ϼ���
	Scanner sc = new Scanner(System.in);
	
	public Ex07ObjectCalender() { //����Ʈ ������
		//���� �⵵,�� ���ϱ�
		Date date = new Date();
		this.year = date.getYear()+1900;
		this.month = date.getMonth()+1;
		//������ ��� ��.���� 1���� ���� ���ϱ�
		Date date2 = new Date(year-1900, month-1, 1);
		this.week = date2.getDay();
		
		//���� �⵵�� ���� ���ϱ��� �ִ��� ���ϱ�
		this.processendDay();
		//�޷����
		this.showCalendar();
	}
	
	//�� ���� ������ ���ϱ�
	public void processendDay() {
		switch(month) {
		case 2:
			if(year%4==0 && year%100!=0 || year%400==0) {
				endday = 29;
			} else {
				endday = 28;
			} break;
		case 4: case 6: case 9: case 11:
			endday = 30;
			break;
		default:
			endday = 31;
		}
	}
	
	//����κ� ���
	public void showTitle() {
		System.out.println("\t"+ year + "��" + month + "��\n");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("===================================================");
	}
	
	//�޷� ����ϴ� �޼���
	public void showCalendar() {
		this.showTitle();
		
		//week��ŭ tap����
		for(int i = 1; i<=week; i++) {
			System.out.print("\t");
		}
		
		//1�Ϻ��� endday���� ���
		for(int i = 1; i<=endday; i++) {
			week++;
			System.out.print(i + "\t");
			if(week%7==0) {
				System.out.println();
			}
		}
	}
	
	//���ο� �⵵�� ���� �Է� �� �޷� ���
	public void process() {
		//�� �κ� ����
		//�⵵�� ���� �ݺ��ؼ� �Է��ϸ� �� ��¥�� ���� �޷� ���
		//�⵵�� 0�� �ԷµǸ� ���α׷� ����(��ü while��)
		//���� 1~12�� �ƴϸ� �޼��� ��� �� �ٽ� �Է�
		//year, month, week ���ؾ���
		
		while(true) {
			System.out.println("���ο� �⵵�� ���� �Է��ϼ���");
			year = sc.nextInt();
			if(year==0) {
				System.out.println("���α׷� ����");
				break;
			}
			
			month = sc.nextInt();
			if(month<1 || month>12) {
				System.out.println("1~12 �߿� �Է��ض�");
				continue;
			}
			
			Date date = new Date(year-1900, month-1, 1);
			week = date.getDay();
			
			showCalendar();
			System.out.println();
			System.out.println();
			
		}
		
	}
	

	public static void main(String[] args) {
		
		Ex07ObjectCalender ex = new Ex07ObjectCalender();
		ex.process();
		

	}

}
