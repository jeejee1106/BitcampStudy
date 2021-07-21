package day0721;

import java.util.Scanner;

public class Ex14Final_Exe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*문제 1
		 * 두수 x,y를 입력 후 x의 y승을 for문을 이용해서 구하시오
		 * ex)
		 * 4  3  입력시
		 * 4의 3승은 ~입니다.
		 * */
//		System.out.println("숫자 두 개를 입력해라");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		for(int i = 1; i<=y; i++) {
//			System.out.println(x);
//		}
		//
		
		/*문제 2
		 * 총 10개의 다양한 숫자를 입력받아 양수의 갯수와 음수의 갯수를 구하시오
		 * */
		System.out.println("문제2. 10개 숫자를 입력해라");
		for(int i = 1; i<=10; i++) {
			int ran = sc.nextInt();
			if(ran>0) {
				
			}
		}
		
		
		
		
		/*문제 3
		 * 숫자를 입력시 팩토리얼 값을 구하시오
		 * ex)
		 * 5 입력시 
		 * 5! = 120
		 * */
		System.out.println("문제3. 숫자를 입력해라");
		int num = sc.nextInt();
		int fac = 1;
		for(int i = 1; i<=num; i++) {
			fac *=i;
		} System.out.println(num + "! = " + fac);
		
		
		
	}

}
