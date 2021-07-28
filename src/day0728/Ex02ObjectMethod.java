package day0728;

//하나의 소스파일에 파일명과 같은 클래스 외에 다른 클래스를 추가로 구현할경우 
//그 클래스는 같은 패키지내에서만 사용 가능한 클래스가 된다(public 사용시 에러남)
class Apple {
	//모든 멤버변수를 private 로 지정해보자
	private String name;
	private int age;
	public static final String ADDR="Seoul";

	//값변경을 위한 메서드를 setter 메서드라고 한다
	//규칙은 setName,setAge
	public void setName(String name) {
		//지역변수와 멤버변수명이 같을 경우에는 구분하기 위해서
		//멤버변수명 앞에 인스턴스 this를 반드시 붙여야한다
		//같은 이름이 없을경우에는 생략이 가능하다
		//this: 자가자신에 대한 인스턴스 변수(일반 멤버변수에만 존재(static멤버변수에는 없다)
		this.name=name;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public void setData(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//값을 반환하기 위한 메서드를 getter method 라고 한다
	//getName,getAge
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}	

	public void write() {
		System.out.println("이름 : "+this.name+", 나이 : "+this.age);
	}
}

public class Ex02ObjectMethod {

	public static void main(String[] args) {
		Apple app=new Apple();
		//app.name="홍길동";//같은 패키지라도 다른 클래스의 private 변수는 접근이 불가능하다

		//값변경
		app.setName("강호동");
		app.setAge(23);

		System.out.println("이름 1 :"+app.getName());
		System.out.println("나이 1 :"+app.getAge());

		Apple app2=new Apple();
		app2.setData("이영자", 35);
		app2.write();
		System.out.println("1번 학생");
		app.write();		
	}
}
