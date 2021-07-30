package day0730;

class Color {
	public void hello() {
		System.out.println("다들 안녕하십니깡깡깡깡!");
	}
}

class Red extends Color {
	public void process() {
		System.out.println("나는 모든 문을 빨강색으로 칠하는 일을 할게~");
	}
}

class White extends Color {
	public void process() {
		System.out.println("나는 모든 벽을 하얀색으로 칠하는 일을 할게~");
	}
}


public class Ex09Inherit_Polymorphism {

	public static void main(String[] args) {
		
		System.out.println("Red로 선언하고 Red로 생성한 경우");
		Red red = new Red();
		red.hello();
		red.process();
		System.out.println();
		
		System.out.println("White로 선언하고 White로 생성한 경우");
		White wh = new White();
		wh.hello();
		wh.process();
		System.out.println();
		
		System.out.println("Color로 선언하고 Red로 생성한 경우");
		Color c1 = new Red();
		c1.hello();
//		c1.process(); 
		/* @@부모로 선언하고 자식 클래스로 생성하는 경우?@@
		 * 부모가 가지고 있는 메서드 호출 ok
		 * 메서드가 오버라이드 된 경우 호출 ok
		 * 부모한텐 없고 자식만 가지고 있는 메서드는 호출 xxx!!!		
		 */
		
	}

}
