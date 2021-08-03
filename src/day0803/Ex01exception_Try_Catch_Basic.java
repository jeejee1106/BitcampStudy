package day0803;

import java.util.Scanner;

public class Ex01exception_Try_Catch_Basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		while(true) { //1~4�� �ݺ��Ǹ鼭 Exception�� �߻����� �ʴ´ٸ� catch���� ������� �ʰ� ���������� �ڵ尡 ��µȴ�.
			try {
				System.out.println("ù ��° ���ڸ� �Է�(����0)");
				num1 = Integer.parseInt(sc.nextLine()); //1. ���⼭ �̼����� �߰ߵǸ� ���� �ڵ�� ��������ʰ� ĳġ�� �̵�
				if(num1==0) {							//���� ���ڰ� �ƴ� ����or���ڿ��� �Է��Ѵٸ�?? Exception�߻�.
					break;
				}
				System.out.println("�� ��° ���ڸ� �Է�");
				num2 = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e){ //2. ����!����� �̵�! ����� �ͼ� �����޼����� ����ϰ� ���� �ڵ�� ����
				System.out.println("�޼��� : " + e.getMessage()); //3. �޼��� : For input string: "���� �߸��Է��� ��(�̸��׸� ����)"
				continue; //4. �ٽ� ���Ϲ��� ���ǹ�����.
			}
			System.out.println("�� ������ ���� " + (num1+num2)+ "�Դϴ�.");
			System.out.println();
		}
		System.out.println("��������");
	}

}
