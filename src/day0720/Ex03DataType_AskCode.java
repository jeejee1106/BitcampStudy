package day0720;

public class Ex03DataType_AskCode {

	public static void main(String[] args) {
		char a = 'A';
		int b = 98;
		System.out.println(a); //A
		System.out.println((int)a); //�ƽ�Ű�ڵ�� ������A = 65
		System.out.println(b); //98
		System.out.println((char)b); //�ƽ�Ű�ڵ�� ������98 = b
		System.out.println(a+3); // �ƽ�Ű�ڵ�� ������A(=65) + 3 = 68
		System.out.println((char)(a+3)); //a+3�� �ƽ�Ű�ڵ�� ����� �� �ٽ� �� ���ڸ� �ƽ�Ű�ڵ�� ������Ų ���ڰ� ����
		System.out.println(b+2); //100
		System.out.println((char)(b+2)); //?
		
		//�ƽ�Ű�ڵ�� Hello ����ϱ�
		System.out.printf("%c %c %c %c %c\n", 72, 101, 108, 108, 111);
		
		//main parameter������ 3������ ������ �о ������ ���(�Ҽ��� 2�ڸ� ����)�� ���
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int mat = Integer.parseInt(args[2]);
		int total = kor + eng + mat;
		int count = 3; //�� ������ �ǹ��ϴ� ������
		double avg1 = total/count;
		double avg2 = (double)total/count;
		System.out.printf("����=%d, ����=%d, ����=%d\n", kor, eng, mat);
		System.out.println("���� = " + total);
		System.out.println("���1 = " + avg1);
		System.out.println("���2 = " + avg2);
		System.out.printf("���3 + %.2f\n", avg2);
		
		
		
		

	}

}
