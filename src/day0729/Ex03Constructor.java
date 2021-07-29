package day0729;

import java.sql.Date;

class Birth {
	//�ʵ�,= �������,= �ν��Ͻ�����
	int year, month, day;
	
	//������
	Birth(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void display() {
		System.out.println(year + "��" + month + "��" + day + "�� ���Դϴ�.");
		System.out.println("���� " + this.getMyWeek() + "���Ͽ� �¾���");
		System.out.println("���� " + this.getMyDdi() + "�� �Դϴ�.");
	}
	
	public String getMyWeek() {
		String week = "";
		Date d = new Date(year-1900, month-1, day);
		//���ϼ��� ���
		int day = d.getDay();
		week=day==0?"��":day==1?"��":day==2?"ȭ":day==3?"��":day==4?"��":day==5?"��":"��";
		return week;
	}
	
	public String getMyDdi() {
		String[] ddi = {"������", "��", "��", "����", "��", "��", "ȣ����", 
				"�䳢", "��", "��", "��", "��"};
		return ddi[year%12];
	}
	
}

public class Ex03Constructor {

	public static void main(String[] args) {
		
		Birth b1 = new Birth(2000, 01, 11);
		b1.display();
		System.out.println();
		
		Birth b2 = new Birth(2021,7,29);
		b2.display();
		
		
		
		
	}

}
