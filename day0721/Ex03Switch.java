package day0721;

import java.util.Scanner;

public class Ex03Switch {

	
	public static void main(String[] args) {
		
		System.out.println("-------숫자 출력-------");
		/*
		 * 숫자를 입력 후 1이면 one, 2면 two, 3이면 three
		 * 그 이외에는 "all" 출력
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("숫자 입력");
		num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("one");
			break; //switch문을 빠져나가게 해줌. break가 없으면 break가 나올 때 까지 모든 코드 실행.
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("all");
		}
		
		
		System.out.println("-------문자 출력-------");
		/*
		 * 문자 1글자를 입력받아 a,A인 경우 "Apple"
		 * b,B인 경우 "Banana"
		 * 그 이외는 "모든 과일을 좋아함"
		 */
		char fruit;
		fruit = sc.nextLine().charAt(0); //입력한 문자열 중 0번(첫글자)를 char로 변환
		//스캐너 메소드 공부가 필요할 듯. 공부하기
		switch(fruit){
			case 'a': case 'A':
				System.out.println("Apple");
				break;
			case 'b': case 'B':
				System.out.println("Banana");
				break;
			default:
				System.out.println("모든 과일을 좋아함");
		}
		
		
		System.out.println("-------문자열 출력-------");
		/*
		 * 문자열로 영어단어를 입력하면 한글로 출력
		 */
		String eword;
		System.out.println("영어단어 입력");
		eword = sc.nextLine();
		switch(eword) {
			case "apple":
				System.out.println("사과");
				break;
			case "strawberry":
				System.out.println("딸기");
					break;
			default:
				System.out.println("잠시만..ㅋㅋㅋ");
		}
		
		
		
		
		
		
	}

}
