package day0723;

import java.util.Calendar;

public class Ex04Calendar {

	public static void main(String[] args) {
		
//		Calendar cal = new Calendar(); //Ķ������ �����ڰ� protectsd�� new�� ����� �� ����
		
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR); 
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int hh = cal.get(Calendar.HOUR);
		int mm = cal.get(Calendar.MINUTE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("���ó�¥ : " + y + "-" + m + "-" + d);
		System.out.println("����ð� : " + hh + ":" + mm);
		System.out.println("���ϼ��� : " + week); //�Ͽ��Ϻ��� 1234567
		switch(week) {
		case Calendar.SUNDAY:
			System.out.println("������ �Ͽ���");
			break;
		case Calendar.MONDAY:
			System.out.println("������ ������");
			break;
		case Calendar.TUESDAY:
			System.out.println("������ ȭ����");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("������ ������");
			break;
		case Calendar.THURSDAY:
			break;
		case Calendar.FRIDAY:
			System.out.println("������ �ݿ���");
			break;
		case Calendar.SATURDAY:
			System.out.println("������ �����");
			break;
		}

	}

}
