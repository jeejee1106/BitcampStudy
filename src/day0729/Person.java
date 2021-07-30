package day0729; //0730 연결클래스

public class Person {
	//부모클래스가 다른 패키지에 있을 경우 protected는 접근이 가능하다
	protected String name;
	protected String buseo;
	
	public void display() {
		System.out.println("**부모 변수 출력**");
		System.out.println("이름 : " + this.name);
		System.out.println("부서 : " + this.buseo);
			
	}
}
