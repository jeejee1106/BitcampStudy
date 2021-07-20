package day0720;

import java.util.Scanner;

public class Ex04Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //키보드로부터 읽기 위한 선언문
		
		//변수선언
		String name;
		int age;
		String blood;
		
		//키보드로 입력받기
		System.out.println("이름을 입력하세요");
		name = sc.nextLine(); //한줄을 읽는다(공백 사용 가능)
		System.out.println("나이를 입력하세요");
		age = sc.nextInt(); 
		//나이 입력후 엔터를 누르면 그 엔터가 키보드 버퍼로 저장돼서
		//다음 문자열을 읽을 경우 먼저 읽어 버리는 문제가 발생한다
		//그래서 혈액형을 읽기 전에 엔터를 읽어서 없애버린다.
		sc.nextLine(); // 그렇지만 웬만하면 nextLine메서드를 쓰기
		System.out.println("혈액형을 입력하세요");
		blood = sc.nextLine();
		
		//출력
		System.out.println(name + "님의 나이는 " + age + "세 입니다.");
		System.out.println(name + "님의 혈액형은 " + blood + "형 입니다.");
		System.out.println(name + "님의 혈액형은 " + blood.toUpperCase() + "형 입니다.");
		

	}

}
