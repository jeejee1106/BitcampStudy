package day0723;

import java.util.Date;

public class Ex03Date {

	public static void main(String[] args) {
		/*
		 * ��¥�� ����ϴ� ������� date�� Caleadar�� �̿��ϴ� ����� �ִ�.
		 * java���� date�� �������� ������ date�� ����ϱ� �� ���ؼ� d..~��¼�� ������
		 * ������ ���� ���̰� �ִ�.
		 * */
		
		//���� �� �� �� ���� �� �� ���
		Date date = new Date();
		int y = date.getYear()+1900; //year�� 1900�� ������� ���� �⵵�� ����� ��µ�
		int m = date.getMonth()+1; 
		int d = date.getDate();
		int hh = date.getHours();
		int mm = date.getMinutes();
		int week = date.getDay();
		//get~�� ���� �׾��� ������ �� �޼��带 �������� �ʴ´�. �ٸ� �޼��带 ���. ��� ��
		//�ٵ� �ᵵ �ƹ� ���� ����!
		
		System.out.println("���ó�¥ : " + y + "-" + m + "-" + d);
		System.out.println("����ð� : " + hh + ":" + mm);
		System.out.println("���ϼ��� : " + week);
		System.out.println("������ " + 
		(week==0?"��":week==1?"��":week==2?"ȭ":week==3?"��":week==4?"��":week==5?"��":week==6?"��":"��")
		+ "�����Դϴ�.");
		
		
		
		
		

	}

}
