package day0727;

import java.util.Scanner;

public class Ex02LottoExe {

	public static void main(String[] args) {
		
		/*
		 * 금액을 입력하면 금액에 해당하는 로또 숫자 발생
		 * 1000원 미만이면 '금액부족' 출력 후 프로그램 종료
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		int[] Lotto = new int[6];
		
		System.out.println("금액 입력");
		money = sc.nextInt();
		if(money<1000) {
			System.out.println("금액 부족. 종료합니다.");
			return;
		}
		
		//1. 로또 발생 횟수 구하기
		int cnt = money/1000; //로또 몇 번 할건지?
		int mod = money%1000; //거스름돈
		
		System.out.println("총 " + cnt + "회의 로또 구입");
		System.out.println("거스름돈 : " + mod + "원");

		//2. 숫자 추출하기
		for(int i = 1; i<=cnt; i++) {
			for(int j = 0; j<Lotto.length; j++) {
				Lotto[j] = (int)(Math.random()*45)+1; //1~45사이의 랜덤한 수 추출
				for(int m = 0; m<j; m++) { //중복값 체크&제거
					if(Lotto[j]==Lotto[m]) {
						m--;
						break;
					}
				}
			}
			//3. 오름차순 정렬
			for(int n = 0; n<Lotto.length-1; n++) {
				for(int m = n+1; m<Lotto.length; m++) {
					if(Lotto[n]>Lotto[m]) {
						int tmp = Lotto[n];
						Lotto[n] = Lotto[m];
						Lotto[m] = tmp;
					}
				}
			}
			System.out.printf("%2d 회 : ", i);
			for(int n = 0; n<Lotto.length; n++) {
				System.out.printf("%5d", Lotto[n]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
