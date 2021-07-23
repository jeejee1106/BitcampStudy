package day0723;

import java.util.Random;
import java.util.Scanner;

public class Ex01Exe {

	public static void main(String[] args) {
		//정답을 맞추면 게임을 끝낼지 계속할지 선택할 수 있음
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("1부터 100까지 숫자 중 하나를 입력하세요");
		int num;
		int n;
		int a;
		Exit:
			while(true){
				n=1;
				num=rand.nextInt(100)+1;
				while(true) {
					System.out.print("기회" + n++ + " : ");
					a = Integer.parseInt(sc.nextLine());
					if(a==num) {
						System.out.println("짝짝짝. 정답입니다.");
						System.out.println("게임을 계속 하려면 y를 눌러주세요");
						char ans = sc.nextLine().charAt(0);
						if(ans=='y'||ans=='Y') {
							System.out.println("새로운 게임이 시작됩니다.");
							continue Exit; //바깥쪽 while문의 조건식으로 이동
						} else {
							System.out.println("***게임종료***");
							break Exit; //바깥쪽 while문을 빠져나가서 메인이 종료
						}
					} else if(a>num) {
						System.out.println(a + "보다 작습니다.");
					} else {
						System.out.println(a + "보다 큽니다.");
					}
				} 
			} System.out.println("***종료***");





	}

}
