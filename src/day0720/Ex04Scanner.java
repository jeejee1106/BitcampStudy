package day0720;

import java.util.Scanner;

public class Ex04Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Ű����κ��� �б� ���� ����
		
		//��������
		String name;
		int age;
		String blood;
		
		//Ű����� �Է¹ޱ�
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.nextLine(); //������ �д´�(���� ��� ����)
		System.out.println("���̸� �Է��ϼ���");
		age = sc.nextInt(); 
		//���� �Է��� ���͸� ������ �� ���Ͱ� Ű���� ���۷� ����ż�
		//���� ���ڿ��� ���� ��� ���� �о� ������ ������ �߻��Ѵ�
		//�׷��� �������� �б� ���� ���͸� �о ���ֹ�����.
		sc.nextLine(); // �׷����� �����ϸ� nextLine�޼��带 ����
		System.out.println("�������� �Է��ϼ���");
		blood = sc.nextLine();
		
		//���
		System.out.println(name + "���� ���̴� " + age + "�� �Դϴ�.");
		System.out.println(name + "���� �������� " + blood + "�� �Դϴ�.");
		System.out.println(name + "���� �������� " + blood.toUpperCase() + "�� �Դϴ�.");
		

	}

}
