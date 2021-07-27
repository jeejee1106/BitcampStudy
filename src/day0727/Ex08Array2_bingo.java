package day0727;

import java.util.Scanner;

public class Ex08Array2_bingo {

	public static void main(String[] args) {
		
		
		
		/*
		 * 3행3열로 할당 후 1~3의 난수를 넣은 후
		 * 엔터를 누를 때 마다 새로운 난수가 나오고
		 * 가로, 세로, 대각선 방향으로 같은 숫자가 있을경우 bingo변수 1증가
		 * 같은 숫자가 없으면 꽝 출력
		 * 
		 * */

		int[][] puzzle = new int [3][3];
		int bingo;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i<puzzle.length; i++) {
				for (int j = 0; j<puzzle[i].length; j++) {
					puzzle[i][j] = (int)((Math.random()*3)+1);
				}
			}
			//출력
			for(int i = 0; i<puzzle.length; i++) {
				for (int j = 0; j<puzzle[i].length; j++) {
					System.out.print(puzzle[i][j] + "\t");
				} System.out.println();
			}
			
			//비교(가로,세로,대각선2개)
			bingo = 0;
			//  \방향 대각선
			if(puzzle[0][0]==puzzle[1][1] && puzzle[1][1]==puzzle[2][2]) {
				bingo++;
			}
			//  /방향 대각선
			if(puzzle[0][2]==puzzle[1][1] && puzzle[1][1]==puzzle[2][0]) {
				bingo++;
			}
			//가로방향3개, 세로방향3개
			for(int i = 0; i<puzzle.length; i++) {
				if(puzzle[i][0]==puzzle[i][1] && puzzle[i][1]==puzzle[i][2]) {
					bingo++; //가로방향 비교
				}
				if(puzzle[0][i]==puzzle[1][i] && puzzle[1][i]==puzzle[2][i]) {
					bingo++; //세로방향 비교
				}
			}
			
			//빙고출력
			if(bingo==0) {
				System.out.println("\t꽝!!");
			} else {
				System.out.println("\t빙고 " + bingo + "개");
			}
			
			System.out.println();
			System.out.println("엔터를 누르면 다음 난수가 나옵니다(종료:q)");
			String a = sc.nextLine();
			if(a.equalsIgnoreCase("q"))
				break;
		}
		System.out.println("**프로그램 종료**");
		
		
		
		
		
		
	}

}
