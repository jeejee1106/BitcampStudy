package day0720;

import java.util.Scanner;

public class Ex05Scanner {

	public static void main(String[] args) {
		/*
		 * �̸��� Ű, �������� �Է��ϸ� ǥ�� �����Կ� �Բ�
		 * �Է��� �����͸� ����غ���
		 */
		Scanner sc = new Scanner(System.in);
		//��������
		String name;
		double height, weight, st_weight;
		
		//�Է�
		System.out.println("�̸� �Է�");
		name = sc.nextLine();
		System.out.println("Ű �Է�");
		height = Double.parseDouble(sc.nextLine());
		System.out.println("������ �Է�");
		weight = Double.parseDouble(sc.nextLine());
		
		//ǥ�� ������ ���
		st_weight = (height-100)*0.9;
		
		//���
		System.out.println("**�Է� ����**");
		System.out.println("�̸� : " + name);
		System.out.println("Ű : " + height);
		System.out.println("������ : " + weight);
		System.out.printf("���� ǥ�� ������  : %.1f Kg\n", st_weight);

	}

}
