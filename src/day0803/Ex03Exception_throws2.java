package day0803;
//예제 두개임. 헷갈리지 말 것
import java.util.Random;
import java.util.Scanner;

public class Ex03Exception_throws2 {

	public static void process() {
		Scanner sc = new Scanner(System.in); //스캐너 호출한게 자동으로? 삭제될수도ㅜ 복습할 때 스캐너 import됐나 확인.
		int su1, su2;
		System.out.println("두 수를 입력해라");
		su1 = sc.nextInt(); //제대로 된 숫자를 입력한다는 가정하에!
		su2 = sc.nextInt();
		try {
			System.out.println("su1/su2 = " + su1/su2); 
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨 : " + e.getMessage());
		} finally {
			System.out.println("이 영역은 예외 상관없이 무조건 실행");
		}
	}
	
	public static void process2() throws NullPointerException{  //NullPointerException은 객체가 없는 상황에서 객체를 사용하려 할 때 나타나는 에러.
		Random r = null; //r을 null로 초기화. r값은 없는거나 마찬가지.
		int rnd = r.nextInt(10);
		System.out.println("발생한 난수는" + rnd + "입니다."); //없는 값을 불러내려고함. 예외발생
	}
	
	public static void main(String[] args) {
		
		process();
		
		try {
			process2();
		} catch(NullPointerException e) {
			System.out.println("오류메세지 : " + e.getMessage());
		}

		System.out.println("정상종료");
	}

}
