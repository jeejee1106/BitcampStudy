package day0803;

import java.util.Scanner;

class User extends Exception{
	public User(String name) {
		super(name + "���� ������ �� �����ϴ�."); //getMessage()�� �� ���� �޼����� ���� �Է����ش�!
	}
}

public class Ex05UserException2 {
	public static void process() throws User{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ض�");
		String name = sc.nextLine();
		if(name.equals("������")||name.equals("������")||name.equals("�۽���")) {
			throw new User(name);
		} else {
			System.out.println(name + "���� ȸ������ �Ǿ����ϴ�.");
		}
		
		
		/*
		 * �̸��� �Է¹޾� ������, ������, �۽����� ���
		 * "���������� ������ �� �����ϴ�" ��� �޼��� ���(���� exception�߻�)
		 * �� �̿��� �̸��� ���
		 * xxx���� ȸ������ �Ǿ����ϴ� ��� ���
		 * */
	}

	public static void main(String[] args) {
		
		//processȣ�� �� exceptionó��
		try {
			process();
		} catch (User e) {
			System.out.println("�����޼��� : " + e.getMessage());
		}
		System.out.println("**��������**");
	}

}
