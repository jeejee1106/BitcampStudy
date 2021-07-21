package day0721;

import java.util.Scanner;

public class Ex09For_Scanner {

	public static void main(String[] args) {
		
		//숫자 n을 입력받아 1~n까지의 합 구하기
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=n ;i++) {
			sum+=i;
		} System.out.println(sum);
		
		
		
	}

}
