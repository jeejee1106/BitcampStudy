package day0727;

public class Ex07Array2_Exe {

	public static void main(String[] args) {
		
		int sum=0;
		String[] name = {"강호동", "유재석", "이영자"};
		int[][] score = {
				{67,89,70,0},
				{100,90,89,0},
				{80,67,77,0}
		};
		
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<3; j++) {
				score[i][3] += score[i][j];
			}
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점");
		for(int i = 0; i<name.length; i++) {
			System.out.print(name[i] + "\t");{
				for(int j = 0; j<score[i].length; j++) {
					System.out.print(score[i][j] + "\t");
				} System.out.println();
			}
		}
		

	}

}
