package day0730;

class Parent { //필드
	private String name;
	private int age;
	
	Parent(){ //생성자
		System.out.println("부모 디폴트 생성자");
		this.name = "이진";
		this.age = 10;
	}
	
	Parent(String name, int age){ //생성자 오버로딩
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
////////////////////////////////////
class Child extends Parent{
	private String hp;
	
	Child() {
//		super(); //얘가 자동 생략되어있음. 디폴트일때만 생략가능. 부모의 다른 생성자와 호출은 생략안됨.
		System.out.println("자식 디폴트 생성자");
		this.hp = "010-1234-5678";
	}
	
	Child(String name, int age, String hp) {
		super(name, age); //생략안됨. 생략시 부모디폴트가 호출, 반드시 첫줄
		this.hp = hp;
	}
	
	public void writeData() {
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("핸드폰 : " + hp);
		System.out.println();
	}
}

public class Ex03Inherit {

	public static void main(String[] args) {
		
		Child ch1 = new Child();
		ch1.writeData();
		
		Child ch2 = new Child("강호돈", 30, "011-345-6789");
		ch2.writeData();
		
		
		
		
		
		
		
		
	}
	
}
