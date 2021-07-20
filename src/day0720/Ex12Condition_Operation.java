package day0720;

import java.util.Scanner;

public class Ex12Condition_Operation {

	public static void main(String[] args) {

		/*
		 * 점수를 입력받아 90이상이면 "참 잘했어요!"
		 * 80이상이면 "좀 더 노력하세요."
		 * 나머지는 "재시험!!"
		 */
		Scanner sc = new Scanner(System.in);
		int score;
		String mes;
		
		
		//if문으로 메세지 구한 뒤 출력
		System.out.println("<if문으로 구하기>");
		System.out.println("점수를 입력하세요");
		score = sc.nextInt();
		if (score>=90) 
			mes = "참 잘했어요!";
		 else if(score>=80)
			mes = "좀 더 노력하세요";
		 else
			mes = "재시험!!";
		System.out.println(mes);
		
		
		//조건연산자로 메세지 구한 뒤 출력. 위와 완전히 같은 코드
		System.out.println("<조건 연산자로 구하기>");
		mes = score>=90?"참 잘했어요!":score>=80?"좀 더 노력하세요.":"재시험!!";
		System.out.println(mes);
		
		
	}

}
