package day0730;

import day0729.Person;

class My extends Person{ //부모클래스가 다른 패키지에 있을 경우 protected는 접근이 가능하다
	
	int age;
	
	My(String name, String buseo, int age) {
		this.name = name; 
		this.buseo = buseo;
		this.age = age;
	}
	
	public void write() {
		System.out.println("사원명 : " + this.name);
		System.out.println("부서 : " + this.buseo);
		System.out.println("나이 : " + this.age);
	}
	
	//오버라이드 메서드 구현(메서드명과 인자는 같아야하고 접근지정자는 범위가 넓은것만 가능)
	@Override //골뱅이 붙은건 어노테이션이라고 한다. 오버라이드 검증해주는 일을 함.(자동완성하면 생김)
	public void display() {
		super.display(); //부모의 메서드 호출, 순서는 상관없음
		System.out.println("나이 : " + this.age);
	}
	
}


public class Ex04Inherit_overriding {

	public static void main(String[] args) {
		
		My my1 = new My("유재석", "교육부", 30);
		my1.write();
		System.out.println();
		
		System.out.println("**오버라이드 메서드를 통해 출력해보자**");
		my1.display(); //My의 display가 호출, 만약 My에 display가 없을경우 자동으로 부모것이 호출된다.
		
		
		
		
	}

}
