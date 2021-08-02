package day0802;

class Outer2{

	int a= 10;
	static int b = 20;

	class Orange{
		int c = 30;
		//		static int d = 40; //내부클래스에서는 static변수를 사용할 수 없다.

		public void disp() {
			System.out.println("**외부클래스변수**");
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("**내부클래스변수**");
			System.out.println("c = " + c);
			//			System.out.println("d = " + d);
		}
	}

	//static 내부 클래스 선언
	//외부클래스의 인스턴스필드(멤버변수) 접근 불가능.
	static class Kiwi{
		int c = 30;
		static int d = 40;

		public void disp() {
			System.out.println("**외부클래스변수**");
//			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("**내부클래스변수**");
			System.out.println("c = " + c);
			System.out.println("d = " + d);
		}
	}
	
	public void show() {
		Orange or = new Orange();
		or.disp();
		Kiwi ki = new Kiwi();
		ki.disp();
	}
	
}

public class Ex11InnerClass {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		out.show();
		
	}

}
