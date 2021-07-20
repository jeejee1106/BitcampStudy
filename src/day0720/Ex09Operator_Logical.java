package day0720;

public class Ex09Operator_Logical {

	public static void main(String[] args) {
		//비교연산자,논리연산자
		int kor = 90, eng = 100, mat = 89;
		System.out.println(kor>eng); // false
		System.out.println(kor<eng && eng<mat); //false
		System.out.println(kor<eng || eng<mat); //true
		System.out.println(kor==mat); // false
		System.out.println(!(kor==mat)); //true
		System.out.println(kor==eng && eng==mat); //false
		
		//대입연산자 연습
		int a=5;
		a+=3; //a=a+5
		System.out.println(a); //8
		a*=4; //a=a*4
		System.out.println(a); //32
		a-=5; //a=a-5
		System.out.println(a); //27
		a/=2;
		System.out.println(a); //13
		a%=3;
		System.out.println(a); //1
	}

}
