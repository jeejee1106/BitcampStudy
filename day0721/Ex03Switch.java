package day0721;

import java.util.Scanner;

public class Ex03Switch {

	
	public static void main(String[] args) {
		
		System.out.println("-------���� ���-------");
		/*
		 * ���ڸ� �Է� �� 1�̸� one, 2�� two, 3�̸� three
		 * �� �̿ܿ��� "all" ���
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("���� �Է�");
		num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("one");
			break; //switch���� ���������� ����. break�� ������ break�� ���� �� ���� ��� �ڵ� ����.
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("all");
		}
		
		
		System.out.println("-------���� ���-------");
		/*
		 * ���� 1���ڸ� �Է¹޾� a,A�� ��� "Apple"
		 * b,B�� ��� "Banana"
		 * �� �ܴ̿� "��� ������ ������"
		 */
		char fruit;
		fruit = sc.nextLine().charAt(0); //�Է��� ���ڿ� �� 0��(ù����)�� char�� ��ȯ
		//��ĳ�� �޼ҵ� ���ΰ� �ʿ��� ��. �����ϱ�
		switch(fruit){
			case 'a': case 'A':
				System.out.println("Apple");
				break;
			case 'b': case 'B':
				System.out.println("Banana");
				break;
			default:
				System.out.println("��� ������ ������");
		}
		
		
		System.out.println("-------���ڿ� ���-------");
		/*
		 * ���ڿ��� ����ܾ �Է��ϸ� �ѱ۷� ���
		 */
		String eword;
		System.out.println("����ܾ� �Է�");
		eword = sc.nextLine();
		switch(eword) {
			case "apple":
				System.out.println("���");
				break;
			case "strawberry":
				System.out.println("����");
					break;
			default:
				System.out.println("��ø�..������");
		}
		
		
		
		
		
		
	}

}
