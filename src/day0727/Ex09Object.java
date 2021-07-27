package day0727;

public class Ex09Object {
	//instance 멤버 변수 선언 - 인스턴스 변수로만 호출가능
	//일반 인스턴스 멤버변수는 객체생성 후 각가 다른 값을 가질 수 있다.
	String name;
	//static 멤버변수는 주로 상수로 선언 할 때 사용하며 인스턴스변수없이
	//클래스명으로 접근 가능하다(단, 같은 클래스내에서는 클래스면 생략가능)
	//여러 객체가 같은 값을 가져야 할 경우 주로 static으로 선언한다.
	static final String MESSAGE = "Happy Day!";

	public static void main(String[] args) {
		
		System.out.println("static 멤버변수는 new로 생성 없이 호출가능");
		System.out.println(Ex09Object.MESSAGE);
		System.out.println(MESSAGE); //같은 클래스 내의 메서드에서는 클래스명 생략가능
//		MESSAGE="Nice!!"; //오류 - final이라 값 변경 안됨
		
		Ex09Object yh = new Ex09Object(); //객체생성, yh변수를 인스턴스 변수라고한다.
		Ex09Object cs = new Ex09Object(); 
		Ex09Object mj = new Ex09Object();
		
		yh.name = "이영희";
		cs.name = "강철수";
		mj.name = "손미자";
		
		System.out.println(yh.name);
		System.out.println(cs.name);
		System.out.println(mj.name);
		System.out.println("다같이 사용하는 메세지 : " + MESSAGE);
		
		
		
		
		
	}

}
