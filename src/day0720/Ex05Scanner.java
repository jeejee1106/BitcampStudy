package day0720;

import java.util.Scanner;

public class Ex05Scanner {

	public static void main(String[] args) {
		/*
		 * 이름과 키, 몸무개를 입력하면 표준 몸무게와 함께
		 * 입력한 데이터를 출력해보자
		 */
		Scanner sc = new Scanner(System.in);
		//변수선언
		String name;
		double height, weight, st_weight;
		
		//입력
		System.out.println("이름 입력");
		name = sc.nextLine();
		System.out.println("키 입력");
		height = Double.parseDouble(sc.nextLine());
		System.out.println("몸무게 입력");
		weight = Double.parseDouble(sc.nextLine());
		
		//표준 몸무게 계산
		st_weight = (height-100)*0.9;
		
		//출력
		System.out.println("**입력 정보**");
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.printf("권장 표준 몸무게  : %.1f Kg\n", st_weight);

	}

}
