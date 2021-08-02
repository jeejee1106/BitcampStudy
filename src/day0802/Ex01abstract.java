package day0802;

import java.util.Scanner;
/*
 * �Ϲ� class�� abstract�޼��尡 �ִٸ� class�� abstract�� �ٿ�����Ѵ�.
 * �߻�Ŭ������ Ư¡ : 1. new�� ��ü�� ������ �� ����.
 * 2. ��ӹ޴� Ŭ������(�ڽ�Ŭ����) �ݵ�� �߻�޼��带 �������̵� �ؾ��Ѵ�.
 * ���� �������̵带 ������ ��� �� �ڽ�Ŭ������ �߻�ȭ���Ѿ��Ѵ�.
 * */
abstract class Board {
	abstract public void process(); //abstract�� �̿ϼ� �޼��带 �ǹ�
}
////////////////////////////////////////
class List extends Board {
	@Override
	public void process() {
		System.out.println(" �Խ����� ��ü���� ����մϴ�");
	}
}
///////////////////////////////////////
class Write extends Board {
	@Override
	public void process() {
		System.out.println(" �Խ��ǿ� �������� �����մϴ�");
	}
}
///////////////////////////////////////
class Update extends Board {
	@Override
	public void process() {
		System.out.println(" �Խ����� ���� �����մϴ�");
	}
}
///////////////////////////////////////
class Delete extends Board {
	@Override
	public void process() {
		System.out.println(" �Խ����� ���� �����մϴ�");
	}
}
///////////////////////////////////////
public class Ex01abstract {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		Board board=null;

		while(true) {
			System.out.println("1.����  2. �����  3.�ۼ���  4.�ۻ���  5. ����");
			num=sc.nextInt();
			switch(num) {
			case 1:
				board=new Write();
				break;
			case 2:
				board=new List();
				break;
			case 3:
				board=new Update();
				break;
			case 4:
				board=new Delete();
				break;
			default:
				System.out.println("�����մϴ�");
				System.exit(0);
			}
			board.process();
		}
	}

}
