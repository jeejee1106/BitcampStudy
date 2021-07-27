package day0727;

public class Ex10StaticObject {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		Student stu2 = new Student();

		stu1.name = "이가영";
		stu1.age = 18;
		
		stu2.name = "김기영";
		stu2.age = 16;
		
		Student.schoolName = "강남고등학교"; //static멤버변수는 클래스 이름으로 접근
		
		System.out.println("**클래스 멤버값 출력**");
		System.out.println("학교명 : " + Student.schoolName);
		System.out.println("*학생1의 정보");
		System.out.println("이름 : " + stu1.name + ", 나이 : " + stu1.age);
		System.out.println("*학생2의 정보");
		System.out.println("이름 : " + stu2.name + ", 나이 : " + stu2.age);
	}

}
