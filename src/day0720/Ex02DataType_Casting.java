package day0720;

public class Ex02DataType_Casting {

	public static void main(String[] args) {
		
		System.out.println("<�ùٸ��� ���� ��������ȯ>");
		//byte�� 1byte�� ������ Ÿ��. ���� -128~127
		byte a = 127;
		byte b = (byte)200; //���� ����ȯ
		System.out.println(a);
		System.out.println(b); //-56. ū ���� ���� Ÿ������ ����ȯ�� �� ��� ���ս��� �߻�
		
		System.out.println("<�ùٸ� ���� ����ȯ Casting>");
		//���� ����ȯ�� �ùٸ��� ����ϴ� ��
		int x = 7;
		int y = 4;
		System.out.println(x/y); //������������ ��� ����� ������ ���� intŸ������ ���� ����
		System.out.println((double)x/y); // x�� ���������� ��ȯ�� �ڵ�
		System.out.println(x/(double)y); //y�� ���������� ��ȯ�� �ڵ�
		// �� ���� �� �ϳ��� ��ȯ���൵ �ȴ�.
		
		System.out.println("<�ڵ� ����ȯ Promotion>");
		//�ڵ� ����ȯ(������ ����ȯ)
		//String + int = String
		//double + int = double
		//long + short = long
		//char + int = int
		System.out.println("Happy" + 5 + 6);
		System.out.println("Happy" + (5+6));
		System.out.println('A' + 3);
		System.out.println(2 + 'b');
		System.out.println('a' + 'b'); //���ڿ����� �� ���ڷ� ��ȯ�Ǽ� ��µȴ�. �ƽ�Ű�ڵ� ����.
		
	}

}
