package day0803;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex12SimpleDateFormat {
	
	

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		//��¥, �ð��� ���ϴ� ��Ŀ� �°� ����ϱ�
		//HH:24�ð� ǥ��, MM:��, mm:��
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		System.out.println(sdf1.format(date));
		
		//a:����/����, hh:12�ð� ǥ��, ss:��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		//EEE:���� ª��
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEE");
		System.out.println(sdf3.format(date));
		
		//EEEE:���� ���
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		System.out.println(sdf4.format(date));

		//
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm��");
		System.out.println(sdf5.format(date));
	}

}
