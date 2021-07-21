package day0721;

import java.util.Scanner;

public class Ex05Switch_Exe {

	public static void main(String[] args) {

		/*
		 * 숫자를 입력받아 그 숫자가 짝수인지 홀수인지 출력
		 * if문, switch문으로 출력
		 * */
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("if문 - 짝수입니다.");
		} else {
			System.out.println("if문 - 홀수입니다.");
		}
		
		
		switch(num%2) {
		case 0:
			System.out.println("switch문 - 짝수입니다.");
			break;
		default:
			System.out.println("switch문 - 홀수입니다.");
		}
		
	}

}
