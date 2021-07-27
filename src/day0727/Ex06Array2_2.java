package day0727;

public class Ex06Array2_2 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{23,30},
				{1,5,8},
				{10,20,30,40},
		}; //java�� �� �ึ�� �������� �ٸ��� �� �� �ִ�.
		
		System.out.println("�� �హ�� : " + arr.length);
		System.out.println("0������ �� ���� : " + arr[0].length);
		System.out.println("1������ �� ���� : " + arr[1].length);
		System.out.println("2������ �� ���� : " + arr[2].length);
		
		/*
		 * [0][0]=23  [0][1]=30
		 * [1][0]=1   .... �̷������� �������� ����غ��ƶ�
		 * */
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("[%d][%d]=%d\t", i,j,arr[i][j]);
			} System.out.println();
		}
		
		System.out.println();
		
		System.out.println("�ݷ�(:) for�����ε� ����غ���");
		for(int[] a:arr) {
			for(int num:a) {
				System.out.print(num+"\t");
			} System.out.println();
		}
		
		
		
		
		
	}

}
