package day0730;

import java.util.Scanner;

class Board{
	public void process() {
		System.out.println("xxxx");
	}
}

class List extends Board{
	@Override
	public void process() {
		System.out.println("�Խ��ǿ� ���� ���� �����մϴ�.");
	}
}

class Write extends Board{
	@Override
	public void process() {
		System.out.println("�Խ����� ��ü���� ����մϴ�.");
	}
}

class Update extends Board{
	@Override
	public void process() {
		System.out.println("�Խ����� ���� �����մϴ�.");
	}
}

class Delete extends Board{
	@Override
	public void process() {
		System.out.println("�Խ����� ���� �����մϴ�.");
	}
}

public class Ex11Inherit_FinalExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = null;
		
		Loop:
		while(true) {
			int a = sc.nextInt();
			switch(a) {
			case 1 : 
				board = new List();
				board.process();
				continue;
			case 2 :
				board = new Write();
				board.process();
				continue;
			case 3 :
				board = new Update();
				board.process();
				continue;
			case 4 :
				board = new Delete();
				board.process();
				continue;
			case 5 :
				System.out.println("�����մϴ�");
				break Loop;
			}
		}
		
		
//			if(a==1) {
//				board = new List();
//				board.process();
//				continue;
//			}
//			if(a==2) {
//				board = new Write();
//				board.process();
//				continue;
//			}
//			if(a==3) {
//				board = new Update();
//				board.process();
//				continue;
//			}
//			if(a==4) {
//				board = new Delete();
//				board.process();
//				continue;
//			}
//			if(a==5) {
//				System.out.println("�����մϴ�");
//				break;
//			}
//		}
		
		
		
	}

}
