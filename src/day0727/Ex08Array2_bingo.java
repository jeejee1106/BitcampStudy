package day0727;

import java.util.Scanner;

public class Ex08Array2_bingo {

	public static void main(String[] args) {
		
		
		
		/*
		 * 3��3���� �Ҵ� �� 1~3�� ������ ���� ��
		 * ���͸� ���� �� ���� ���ο� ������ ������
		 * ����, ����, �밢�� �������� ���� ���ڰ� ������� bingo���� 1����
		 * ���� ���ڰ� ������ �� ���
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
			//���
			for(int i = 0; i<puzzle.length; i++) {
				for (int j = 0; j<puzzle[i].length; j++) {
					System.out.print(puzzle[i][j] + "\t");
				} System.out.println();
			}
			
			//��(����,����,�밢��2��)
			bingo = 0;
			//  \���� �밢��
			if(puzzle[0][0]==puzzle[1][1] && puzzle[1][1]==puzzle[2][2]) {
				bingo++;
			}
			//  /���� �밢��
			if(puzzle[0][2]==puzzle[1][1] && puzzle[1][1]==puzzle[2][0]) {
				bingo++;
			}
			//���ι���3��, ���ι���3��
			for(int i = 0; i<puzzle.length; i++) {
				if(puzzle[i][0]==puzzle[i][1] && puzzle[i][1]==puzzle[i][2]) {
					bingo++; //���ι��� ��
				}
				if(puzzle[0][i]==puzzle[1][i] && puzzle[1][i]==puzzle[2][i]) {
					bingo++; //���ι��� ��
				}
			}
			
			//�������
			if(bingo==0) {
				System.out.println("\t��!!");
			} else {
				System.out.println("\t���� " + bingo + "��");
			}
			
			System.out.println();
			System.out.println("���͸� ������ ���� ������ ���ɴϴ�(����:q)");
			String a = sc.nextLine();
			if(a.equalsIgnoreCase("q"))
				break;
		}
		System.out.println("**���α׷� ����**");
		
		
		
		
		
		
	}

}
