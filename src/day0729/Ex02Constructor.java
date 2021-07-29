package day0729;

class Apple{
	
	Apple(){  //기본생성자 - 매개변수가 없는 생성자
		System.out.println("디폴트 생성자");
	}
	Apple(String name){ //생성자의 오버로딩
		System.out.println("이름 " + name + "님을 인자로 받는 생성자");
	}
	Apple(int age){  //생성자의 오버로딩
		System.out.println("나이 " + age  + "를 인자로 받는 생성자");
	}
}

class Orange{
	String name;
	int age;
	
	Orange(){
		this("이영자",20); //인자가 맞는 생성자가 호출된다. 반드시 첫줄
	}
	Orange(String name){
		this(name,20);
	}
	Orange(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void write() {
		System.out.println("name : " + name + ", age : " + age);
	}
}

public class Ex02Constructor {

	public static void main(String[] args) {
		//생성자는 객체 생성시 자동 호출된다.
		Apple a1 = new Apple();
		Apple a2 = new Apple("미자");
		Apple a3 = new Apple(20);
		System.out.println("----------------");
		
		Orange o1 = new Orange();
		o1.write();
		Orange o2 = new Orange("캔디");
		o2.write();
		Orange o3 = new Orange("유재석", 30);
		o3.write();
		
		
		
		
		
		
		
	}

}
