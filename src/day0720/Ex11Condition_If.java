package day0720;

import java.util.Scanner;

public class Ex11Condition_If {

	public static void main(String[] args) {
		
		/*
		 * 세개 수를 입력하여 더 큰 수를 출력하시오
		 * if문과 조건연산자를 이용하여 결과를 출력해본다
		 */
		Scanner sc = new Scanner(System.in);
		int x,y,z,max;
		System.out.println("세개의 수 입력");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		System.out.println("<if문>");
		if(x>y && x>z)
			max=x;
		else if (y>x && y>z)
			max=y;
		else
			max = z;
		System.out.println("max = " + max);
		
		////////////////////////////////////////////
		System.out.println("<조건 연산자>");
		max = x>y&&x>z?x:y>x&&y>z?y:z; // 조건식?true값:false값
		System.out.println("max = " + max);
	}

}
