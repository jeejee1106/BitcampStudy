package day0727;

public class Ex06Array2_2 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{23,30},
				{1,5,8},
				{10,20,30,40},
		}; //java는 각 행마다 열갯수를 다르게 줄 수 있다.
		
		System.out.println("총 행갯수 : " + arr.length);
		System.out.println("0번행의 열 갯수 : " + arr[0].length);
		System.out.println("1번행의 열 갯수 : " + arr[1].length);
		System.out.println("2번행의 열 갯수 : " + arr[2].length);
		
		/*
		 * [0][0]=23  [0][1]=30
		 * [1][0]=1   .... 이런식으로 나오도록 출력해보아라
		 * */
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("[%d][%d]=%d\t", i,j,arr[i][j]);
			} System.out.println();
		}
		
		System.out.println();
		
		System.out.println("콜론(:) for문으로도 출력해보자");
		for(int[] a:arr) {
			for(int num:a) {
				System.out.print(num+"\t");
			} System.out.println();
		}
		
		
		
		
		
	}

}
