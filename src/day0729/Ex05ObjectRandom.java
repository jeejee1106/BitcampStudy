package day0729;

import java.util.Random;
import java.util.Scanner;

public class Ex05ObjectRandom {
	private int rnd;
	private int su;
	private int cnt;
	Random r;
	Scanner sc;
	
	public Ex05ObjectRandom() { //생성자 - 멤버변수 초기화
		r = new Random();
		sc = new Scanner(System.in);
		rand();
	}
	
	public void rand() { //초기화 해주는 메서드 구현
		rnd = r.nextInt(100)+1; //1~100사이 난수 발생
		cnt = 0;
		System.out.println("새로운 난수가 발생되고 카운트는 0으로 초기화 함");
	}
	
	public void process() {
		while(true) {
			System.out.println(++cnt + ":");
			su = sc.nextInt();
			if(su>rnd) {
				System.out.println("\t" + su + "보다 작습니다.");
			} else if(su<rnd) {
				System.out.println("\t" + su + "보다 큽니다.");
			} else {
				System.out.println("\t정답입니다.");
//				System.exit(0); //어디에 있던 무조건 프로그램이 종료된다.
				sc.nextLine(); //엔터를 읽어서 없앰
				System.out.println("계속 하려면 y, 그만하려면 n 입력");
				String ans = sc.nextLine();
				if(ans.equalsIgnoreCase("y")){
					System.out.println("*게임 다시 시작*");
					rand(); //난수 다시 구하고 cnt는 0으로 초기화
					continue; //첫줄로 이동
				} else {
					System.out.println("*게임 종료*");
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex05ObjectRandom ex = new Ex05ObjectRandom();
		ex.process();
		
		
		
		
	}

}
