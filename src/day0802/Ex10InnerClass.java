package day0802;

class Outer{
	
	String name = "안소희";
	int age = 20;
	
	class Inner1{ //내부클래스1
		public void disp1() { //내부클래스에서는 외부클래스의 변수 사용이 가능하다.
			System.out.println("**Inner1 내부클래스**");
			System.out.println("이름 : " + name + "나이 : " + age);
		}
	}
	
	class Inner2{ //내부클래스2
		public void disp2() { //내부클래스에서는 외부클래스의 변수 사용이 가능하다.
			System.out.println("**Inner2 내부클래스**");
			System.out.println("이름 : " + name + "나이 : " + age);
		}
	}
	
	//외부클래스에 메서드 추가
	public void disp() {
		//외부클래스의 메서드에서 내부클래스 선언하는 방법
		Inner1 in1 = new Inner1();
		in1.disp1();
		
		Inner2 in2 = new Inner2();
		in2.disp2();
	}
}

public class Ex10InnerClass {
	
	public static void main(String[] args) {
		Outer out = new Outer();
		out.disp();
		
		//다른 클래스에서 외부를 통하지 않고직접 내부 클래스의 메소드를 호출하려면");
		Outer.Inner1 in1 = new Outer().new Inner1();
		in1.disp1();
		
		Outer.Inner2 in2 = out.new Inner2();  //위에랑 같은 코드. 여러가지 방법이 있음.
		in2.disp2();
		
		
	}
}
