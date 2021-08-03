package day0803;

import java.util.Scanner;

//�����exception
//�����δ� ���ܰ� �߻��� ��Ȳ�� �ƴ�����
//� ���ǿ� ���� ���� ��� ������ ���ܸ� �߻���Ű���� �� ��� ����
//throw : ������ ���� �߻�
class UserException extends Exception{
	public UserException(String msg) {
		super(msg); //ExceptionŬ���� �����ڸ� ���ؼ� ���� ���� �޼����� ��� getMessage�� ȣ���ϸ� ��Ÿ���� �޼����� ���� ���!
	}
}

public class Ex04UserException {
	public static void process() throws UserException { 
		Scanner sc = new Scanner(System.in);
		int age = 0;
		System.out.println("���̸� �Է����ּ���");
		age = sc.nextInt();
		if(age<10||age>=60) {
			throw new UserException("��������� 10~59�� �Դϴ�."); //���� ���� �߻�
		} else {
			System.out.println("����� " + age + "�� �̹Ƿ� ���� ����Դϴ�.");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			process();
		} catch (UserException e) {
			System.out.println("�����޼��� : " + e.getMessage());
		}
		System.out.println("**��������**");
	}

}
