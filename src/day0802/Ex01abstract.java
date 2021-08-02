package day0802;

import java.util.Scanner;
/*
 * 일반 class는 abstract메서드가 있다면 class도 abstract를 붙여줘야한다.
 * 추상클래스의 특징 : 1. new로 객체를 생성할 수 없다.
 * 2. 상속받는 클래스는(자식클래스) 반드시 추상메서드를 오버라이드 해야한다.
 * 만약 오버라이드를 안했을 경우 그 자식클래스도 추상화시켜야한다.
 * */
abstract class Board {
	abstract public void process(); //abstract는 미완성 메서드를 의미
}
////////////////////////////////////////
class List extends Board {
	@Override
	public void process() {
		System.out.println(" 게시판의 전체글을 출력합니다");
	}
}
///////////////////////////////////////
class Write extends Board {
	@Override
	public void process() {
		System.out.println(" 게시판에 글을쓰고 저장합니다");
	}
}
///////////////////////////////////////
class Update extends Board {
	@Override
	public void process() {
		System.out.println(" 게시판의 글을 수정합니다");
	}
}
///////////////////////////////////////
class Delete extends Board {
	@Override
	public void process() {
		System.out.println(" 게시판의 글을 삭제합니다");
	}
}
///////////////////////////////////////
public class Ex01abstract {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		Board board=null;

		while(true) {
			System.out.println("1.쓰기  2. 글출력  3.글수정  4.글삭제  5. 종료");
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
				System.out.println("종료합니다");
				System.exit(0);
			}
			board.process();
		}
	}

}
