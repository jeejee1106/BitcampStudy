package day0803;

import java.text.NumberFormat;

public class Ex13NumberFormat {

	public static void main(String[] args) {
		
		//���ڸ� ���ڿ��� ��ȯ�Ͽ� ���(�޸��� �Ҽ����� ����)
		int money = 6517165;
		double num = 67.31846;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(); //ȭ�����(�� ǥ��)�� �ڸ����޸�����
		System.out.println(nf1.format(money));
		
		NumberFormat nf2 = NumberFormat.getInstance(); //�޸��� ����!
		System.out.println(nf2.format(money));
		System.out.println(nf2.format(num));
	}

}
