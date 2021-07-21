package day0721;

import java.util.Scanner;

public class Ex10For_999 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * 구구단 dan을 입력받은 후 2~9가 아닐 경우 "잘못 입력.종료합니다" 출력후 프로그램 종료
		 * 그 이외에는 구구단 출력
		 * ex) 5 입력시
		 * **5단**
		 * 5x1=5
		 * 5x2=10
		 * .....
		 */
		System.out.println("숫자를 입력하세요.");
		int dan = sc.nextInt();
		System.out.println("**" + dan + "단**");
		for(int i = 1; i<=9; i++) {
			if(dan<2 || dan>9) {
				System.out.println("잘못입력. 종료합니다.");
				return;
			} else {
//			System.out.println(dan + " x " + i + " = " + (dan*i));
			System.out.printf("%d x %d = %2d\n", dan, i, (dan*i));
			//위 두개의 코드는 출력값이 아예 똑같은 코드이다.
			//println과 printf의 코드를 비교해봄.
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
