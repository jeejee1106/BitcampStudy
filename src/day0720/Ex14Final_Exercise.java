package day0720;

import java.util.Scanner;

public class Ex14Final_Exercise {

	public static void main(String[] args) {
		/*
		 *문제1. 상품명과 수량, 단가를 입력받아 총 금액을 계산해서 출력하는데
		    수량이 5개 이상인 경우에는 10% DC된 금액도 같이 출력해주세요
		*조건문으로 작성하세요
		*(예)
		*상품명
		*딸기
		*수량
		*6
		*단가
		*1000
		*[결과출력]
		*상품명:딸기
		*수량:6개
		*단가:1000원
		*총 금액:6000원
		*DC된 금액:5400원
		*/
		System.out.println("<<물건 가격 구하기>>");
		Scanner sc = new Scanner(System.in);
		String prod;
		int num = 0;
		int pri = 0;
		
		System.out.println("상품 입력");
		prod = sc.nextLine();
		System.out.println("갯수 입력");
		num = sc.nextInt();
		System.out.println("가격 입력");
		pri = sc.nextInt();
		int total = num*pri;
		double dc = (total*0.1);
		
		System.out.println("상품명 : " + prod);
		System.out.println("수량 : " + num +"개");
		System.out.println("가격 : " + pri + "원");
		System.out.println("총 금액 : " + total + "원");
		if(num>=5) {
			System.out.println("DC된 금액 : " + (total-dc) + "원");
		}
				
		System.out.println("");
		/*
		 * 문제2. 점수를 입력받아 학점을 구하시오
		 * 90이상은 A, 80이상은 B, 70이상은 C, 60이상은 D, 나머지는 F
		 * (조건 연산자를 이용)
		 */
		System.out.println("<<학점 구하기>>");
		System.out.println("점수를 입력하세요");
		int score;
		score = sc.nextInt();
		String mes;
		mes = score>=90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"F";
		System.out.println(score + "점은 " + mes + "학점 입니다.");
		
		
		
		
		
		
		
		
		
	}

}
