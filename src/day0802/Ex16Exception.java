package day0802;

import java.util.Date;

public class Ex16Exception {
	Date date;
	
	public void writeDay() {
		int y,m,d;
		try {
		y = date.getYear()-1900;
		m = date.getMonth()+1;
		d = date.getDate();
		System.out.println(y + "��" + m + "��" +d + "�� �Դϴ�.");
		} catch(NullPointerException e) {
			System.out.println("��ü������ ���߻�:" + e.getMessage()); //���� �޼�����!
			e.printStackTrace(); //��Ȯ�ϰ� ��� ����ٿ��� ������ ������!
		}
	}
	
	public static void main(String[] args) {
		Ex16Exception ex = new Ex16Exception();
		ex.writeDay();
		System.out.println("**��������**");
	}
}
