package day0720;

public class Ex01DataType_printf {

	public static void main(String[] args) {
		boolean flag = false;
		char ch1 = 'A';
		char ch2 = '��';
		String str = "Happy";
		String str2 = new String("Goog");
		float f = 123.456789f; //���е� 8�ڸ�
		double d = 123.456789; //���е� 15�ڸ�
		System.out.println("��� #1");
		System.out.println("flag = " + flag);
		System.out.println("not flag = " + !flag);
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		//printf - ��ȯ��ȣ�� �̿��ؼ� ����ϴ� �޼���
		//���� %d, �Ǽ� %f, ���� %c, ���ڿ� %s
		System.out.println("--------------");
		System.out.printf("ch1 = %c\n", ch1);
		System.out.printf("ch2 = %c\n", ch2);
		System.out.printf("str = %s\n", str);
		System.out.printf("str2 = %s\n", str2);
		System.out.printf("f = %f\n", f);
		System.out.printf("d = %f\n", d);
		System.out.printf("d = %10.2f\n", d); //��ü �ڸ��� 10�ڸ�, �Ҽ��� �ڸ��� 2�ڸ� (������ 0�� ������ ��)
		System.out.printf("d = %-10.2f#\n", d); //��ü �ڸ��� 10�ڸ�, �Ҽ��� �ڸ��� 2�ڸ�(���ʺ��� ���)
		System.out.printf("d = %.1f\n", d); // �Ҽ��� �ڸ��� 1�ڸ�

	}

}
