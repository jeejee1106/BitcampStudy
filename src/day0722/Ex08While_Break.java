package day0722;

import java.util.Scanner;

public class Ex08While_Break {

	public static void main(String[] args) {
		
		System.out.println("<<<<<break>>>>>");
		int n = 1;
		while(n<10) { //조건은 n이 10보다 작을 때 까지 반복.
			System.out.print((n++) + " "); //n이 1씩 커지는 것을 출력. 언제까지? 10이 되기 전까지
		} 
		
		System.out.println();
		
		n = 1;
		while(true) { //조건이 무조건 트루.
			System.out.print((n++) + " "); //조건이 트루니까 n이 1씩 커지면서 출력.
			if(n>10) { //근데 n이 10보다 커지면
				break; //멈출거야!
			}
		} System.out.println();
		
		
		System.out.println("<<<<<continue>>>>>");
		//whlie문에서 continue를 만나면 조건식을 이동한다
		//조건식인 true일 경우 첫번째줄의 코드부터 다시 실행
		
		/*
		 * 점수가 0이면 while문을 빠져나온다
		 * 점수를 입력받는데 1~100이 아닌 경우 다시 입력받기
		 * 그리고 제대로 된 점수의 갯수 구하기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력");
		int count = 0;
		while(true) {
			int score = sc.nextInt();
			if(score==0) {
				System.out.println("종료");
				break;
			} else if(score<0 || score>100) {
				System.out.println("점수 다시 입력");
				continue;
			} else {
				count++;
				System.out.println("점수 : " + score);
				System.out.println("점수의 갯수 : " + count);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
