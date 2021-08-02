package day0730;

class Work{
	public void process() {
		System.out.println("난 어차피 아무일도 안해요");
	}
}
//////////////////////////////////
class Food extends Work {
	@Override
	public void process() {
		System.out.println("**음식 담당**");
	}
}
///////////////////////////////////
class Clean extends Work {
	@Override
	public void process() {
		System.out.println("**청소 담당**");
	}
}

public class Ex10Inherit_Polymorphism {

	public static void main(String[] args) {
		
		Work work = null; //null로 초기화
		
		work = new Work(); //부모생성-부모호출, 부모 클래스의 process()메서드 호출
		work.process();
		System.out.println();
		
		work = new Food(); //부모생성-자식호출, 자식 클래스의 process()메서드 호출
		work.process();
		System.out.println();
		
		work = new Clean(); //부모생성-자식호출, 자식 클래스의 process()메서드 호툴
		work.process();
		
		/*
		 * 부모클래스로 선언 시 누가 생성되었느냐에 따라 자식 클래스의 오버라이드 메서드가 호출됨.
		 * 그래서 하나의 변수로 호출 시 누가 생성되어있느냐에 따라 그 기능이 달라지는데,
		 * 이 기능을 다형성 이라고 한다!!!!!!!!!
		 * */
	}

}
