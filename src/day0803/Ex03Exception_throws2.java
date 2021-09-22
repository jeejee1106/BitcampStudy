package day0803;
//���� �ΰ���. �򰥸��� �� ��
import java.util.Random;
import java.util.Scanner;

public class Ex03Exception_throws2 {

	public static void process() {
		Scanner sc = new Scanner(System.in); //��ĳ�� ȣ���Ѱ� �ڵ�����? �����ɼ����� ������ �� ��ĳ�� import�Ƴ� Ȯ��.
		int su1, su2;
		System.out.println("�� ���� �Է��ض�");
		su1 = sc.nextInt(); //����� �� ���ڸ� �Է��Ѵٴ� �����Ͽ�!
		su2 = sc.nextInt();
		try {
			System.out.println("su1/su2 = " + su1/su2); 
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵ� : " + e.getMessage());
		} finally {
			System.out.println("�� ������ ���� ������� ������ ����");
		}
	}
	
	public static void process2() throws NullPointerException{  //NullPointerException�� ��ü�� ���� ��Ȳ���� ��ü�� ����Ϸ� �� �� ��Ÿ���� ����.
		Random r = null; //r�� null�� �ʱ�ȭ. r���� ���°ų� ��������.
		int rnd = r.nextInt(10);
		System.out.println("�߻��� ������" + rnd + "�Դϴ�."); //���� ���� �ҷ���������. ���ܹ߻�
	}
	
	public static void main(String[] args) {
		
		process();
		
		try {
			process2();
		} catch(NullPointerException e) {
			System.out.println("�����޼��� : " + e.getMessage());
		}

		System.out.println("��������");
	}

}
