package day0722;

public class Ex11MathRandom {

	public static void main(String[] args) {
		
		/*
		 * �ڹٿ��� ������ ���ϴ� ��� �ΰ���
		 *   1. Math.random() �޼��带 �̿��ϴ� ���
		 *   2. Random �̶�� Ŭ������ �����ؼ� ���ϴ� ���
		 */

		double a = Math.random(); //Math��� Ŭ������ random�̶�� �޼���!
								  //�� �޼����� ���� �� 0.0<=a<1.0
								  //�� 0���� 1�� ������ �������!! (0.0~0.9999...)
		System.out.println(a); //���� �� �� ���� ���� �ٸ� ������ ��µ�
		
		System.out.println("<<random �޼���� �������ϴ� ��>>");
		System.out.println("0~9 ������ ���� 5�� ���ϱ�");
		for(int i = 1; i<=5; i++) {
			int b = (int)(Math.random()*10);
			// 1. Math.random�� ����Ϸ��� ������ ����(?)�� �����ش�. --> 0.0 ~ 9.99999
			// 2. �⺻������ �����޼���� �Ǽ��̱� ������ int���� ������ ���� �������� ���� ����ȯ�� ������Ѵ�. --> 0 ~ 9
			System.out.println(b);
		}
		
		System.out.println();
		
		System.out.println("1~10 ������ ���� 5�� ���ϱ�");
		for(int i = 1; i<=5; i++) {
			int c = (int)((Math.random()*10)+1); //���� (int)((0.0~9.9)*10)+1 --> 1~10
			System.out.println(c);
		}		 
		
		System.out.println();
		
		System.out.println("A~Z �� �빮�ڰ� �����ϰ� 5�� �������� �ϱ�");
		for(int i = 1; i<=5; i++) {
			int d = (int)((Math.random()*26)+65);
			System.out.println((char)d);
		}
		
		
		
		
	}

}
