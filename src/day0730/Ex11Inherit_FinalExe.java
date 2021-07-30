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
		System.out.println("게시판에 글을 쓰고 저장합니다.");
	}
}

class Write extends Board{
	@Override
	public void process() {
		System.out.println("게시판의 전체글을 출력합니다.");
	}
}

class Update extends Board{
	@Override
	public void process() {
		System.out.println("게시판의 글을 수정합니다.");
	}
}

class Delete extends Board{
	@Override
	public void process() {
		System.out.println("게시판의 글을 삭제합니다.");
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
				System.out.println("종료합니다");
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
//				System.out.println("종료합니다");
//				break;
//			}
//		}
		
		
		
	}

}
