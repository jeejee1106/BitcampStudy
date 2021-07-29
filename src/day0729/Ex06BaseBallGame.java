package day0729;

import java.util.Random;
import java.util.Scanner;

class Baseball{
	//필드
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int[] comsu = new int[3];
	int[] usersu = new int[3];

	//생성자
	Baseball() { //디폴트 생성자
		//consu배열의 1~9사이 숫자를 넣는데 같은 숫자가 발생하면 다시 구하시오
		for(int i = 0; i<comsu.length; i++) { //중복처리
			comsu[i] = r.nextInt(9)+1;
			for(int j = 0; j<i; j++) {
				if(comsu[i]==comsu[j]) {
					i--;
					break;
				}
			}
		}

//		System.out.printf("%d %d %d\n", comsu[0], comsu[1], comsu[2]);
	}

	public void process() { //숫자맞추기 로직을 위한 메서드
		int cnt = 0;
		int strike, ball;
		while(true) {
			System.out.println(++cnt + ":");
			String s = sc.nextLine();
			if(s.length()!=3) {
				System.out.println("\t 3개의 숫자를 연속적으로 입력하세요");
				continue;
			}
			this.input(s);

			strike=ball=0;
			//comsu와 비교하여 자릿수까지 같으면 strike 변수 증가
			//있긴한데 자릿수가 다르면 ball 변수 증가
			//다중 for문 이용해서 비교할 것
			
			//내코드
			for(int i = 0; i<comsu.length; i++) {
				if(comsu[i]==usersu[i]) {
					strike++;
				} 
				for(int j = 0; j<comsu.length; j++) {
					if(comsu[i]!=usersu[i]&&comsu[i]==usersu[j]) {
						ball++;
					}
				}
			}
			
			
			//강사님 코드
			for(int i = 0; i<comsu.length; i++) {
				for(int j = 0; j<comsu.length; j++) {
					if(comsu[i]==usersu[j]) {
						if(i==j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			
			
			//출력
			System.out.println(strike + "s" + ball + "b");
			if(strike==3) {
				System.out.println("정답입니다.");
				break;
			}
		}
	}

	public void input(String s) { //문자열을 입력하면 그 숫자를 분리하여 배열에 넣어주기 위한 메서드
		//문자열 s를 분리하여 usersu배열에 넣어보세요
		for(int i = 0; i<usersu.length; i++) {
			char ch = s.charAt(i);
			usersu[i] = ch-'0'; //문자 '1'에서 숫자 '0'을 빼면 숫자 1이 된다.
		}

		//확인(코드를 짜고 이렇게 확인을 해줘야 버그가 있나없나 알 수 있다)
		//		System.out.printf("%d%d%d\n", usersu[0], usersu[1], usersu[2]);
	}

}

public class Ex06BaseBallGame {

	public static void main(String[] args) {

		Baseball bb= new Baseball();
		bb.process();
		System.out.println("*종료합니다.*");


	}

}
