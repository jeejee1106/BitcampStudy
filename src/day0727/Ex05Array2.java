package day0727;

public class Ex05Array2 {

	public static void main(String[] args) {
		
		//2차원배열은 열과 행으로 이루어짐
		int [][] arr = new int [2][3]; //int타입은 0으로 초기화
		System.out.println("행갯수 : " + arr.length);
		System.out.println("0번행의 열갯수 : " + arr[0].length);
		System.out.println("1번행의 열갯수 : " + arr[1].length);
		
		System.out.println("2행3열 배열 출력");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("%d, %d = %2d\t", i, j, arr[i][j]);
			}
			System.out.println(); //열 출력 후 라인 넘기기
		}
		
		System.out.println();
		
		System.out.println("2차원 배열에 값 변경 후 출력");
		arr[0][1] = 5;
		arr[1][0] = 3;
		arr[1][2] = 7;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("%d, %d = %2d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		

	}

}
