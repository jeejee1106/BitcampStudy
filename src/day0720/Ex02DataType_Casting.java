package day0720;

public class Ex02DataType_Casting {

	public static void main(String[] args) {
		
		System.out.println("<올바르지 못한 강제현변환>");
		//byte는 1byte의 정수형 타입. 범위 -128~127
		byte a = 127;
		byte b = (byte)200; //강제 형변환
		System.out.println(a);
		System.out.println(b); //-56. 큰 값을 작을 타입으로 형변환을 할 경우 값손실이 발생
		
		System.out.println("<올바른 강제 형변환 Casting>");
		//강제 형변환을 올바르게 사용하는 법
		int x = 7;
		int y = 4;
		System.out.println(x/y); //정수형끼리의 계산 결과는 무조건 정수 int타입으로 값이 츨력
		System.out.println((double)x/y); // x를 더블형으로 변환한 코드
		System.out.println(x/(double)y); //y를 더블형으로 변환한 코드
		// 두 변수 중 하나만 변환해줘도 된다.
		
		System.out.println("<자동 형변환 Promotion>");
		//자동 형변환(묵시적 형변환)
		//String + int = String
		//double + int = double
		//long + short = long
		//char + int = int
		System.out.println("Happy" + 5 + 6);
		System.out.println("Happy" + (5+6));
		System.out.println('A' + 3);
		System.out.println(2 + 'b');
		System.out.println('a' + 'b'); //문자열들이 다 숫자로 변환되서 출력된다. 아스키코드 참고.
		
	}

}
