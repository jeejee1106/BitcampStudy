package day0720;

public class Ex01DataType_printf {

	public static void main(String[] args) {
		boolean flag = false;
		char ch1 = 'A';
		char ch2 = '가';
		String str = "Happy";
		String str2 = new String("Goog");
		float f = 123.456789f; //정밀도 8자리
		double d = 123.456789; //정밀도 15자리
		System.out.println("출력 #1");
		System.out.println("flag = " + flag);
		System.out.println("not flag = " + !flag);
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		//printf - 변환기호를 이용해서 출력하는 메서드
		//정수 %d, 실수 %f, 문자 %c, 문자열 %s
		System.out.println("--------------");
		System.out.printf("ch1 = %c\n", ch1);
		System.out.printf("ch2 = %c\n", ch2);
		System.out.printf("str = %s\n", str);
		System.out.printf("str2 = %s\n", str2);
		System.out.printf("f = %f\n", f);
		System.out.printf("d = %f\n", d);
		System.out.printf("d = %10.2f\n", d); //전체 자리수 10자리, 소숫점 자릿수 2자리 (공백은 0이 생략된 것)
		System.out.printf("d = %-10.2f#\n", d); //전체 자리수 10자리, 소숫점 자릿수 2자리(왼쪽부터 출력)
		System.out.printf("d = %.1f\n", d); // 소숫점 자릿수 1자리

	}

}
