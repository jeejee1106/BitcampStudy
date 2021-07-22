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
		System.out.println("1. x의 y승 구하기 - x,y를 입력해라");
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		int square = 1;
		for(int i = 1; i<=y; i++) {
			square*=x;
		} System.out.println(x+"의 "+y+"승은 "+square+"입니다.");
		
		
		/*문제 2
		 * 총 10개의 다양한 숫자를 입력받아 양수의 갯수와 음수의 갯수를 구하시오
		 * */
		int a = 0; //양수의 갯수를 담을 그릇?
		int b = 0; //음수의 갯수를 담을 그릇
		System.out.println("문제2. 10개 숫자를 입력해라");
		for(int i = 1; i<=10; i++) {
			int ran = sc.nextInt();
			if(ran>=1) {
				a+=1;
			} else if(ran<=-1) {
				b+=1;
			}
		} System.out.println("양수의 갯수  : " + a 
				+ "\n음수의 갯수 : " +b);
			
		
		/*문제 3
		 * 숫자를 입력시 팩토리얼 값을 구하시오
		 * ex)
		 * 5 입력시 
		 * 5! = 120
		 * */
		System.out.println("3. 팩토리얼 구하기 - 숫자를 입력해라");
		int num = sc.nextInt();
		int result = 1;
		for(int i = 1; i<=num; i++) {
			result*=i;
		} System.out.println(num + "! = " + result);
		
		
	}

}
