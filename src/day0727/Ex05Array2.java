package day0727;

public class Ex05Array2 {

	public static void main(String[] args) {
		
		//2�����迭�� ���� ������ �̷����
		int [][] arr = new int [2][3]; //intŸ���� 0���� �ʱ�ȭ
		System.out.println("�హ�� : " + arr.length);
		System.out.println("0������ ������ : " + arr[0].length);
		System.out.println("1������ ������ : " + arr[1].length);
		
		System.out.println("2��3�� �迭 ���");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("%d, %d = %2d\t", i, j, arr[i][j]);
			}
			System.out.println(); //�� ��� �� ���� �ѱ��
		}
		
		System.out.println();
		
		System.out.println("2���� �迭�� �� ���� �� ���");
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
