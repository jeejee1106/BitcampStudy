package day0723;

public class Ex09Array {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; //0���� �ʱⰪ�� �ڵ����� ����
		arr1[1] = 10;
		arr1[4] = 34;
		for(int n:arr1) {
			System.out.println(n); 
			//1,4 �� ������ ������ �����Ϳ� ���� ���� �ʾ����Ƿ� �������� 0���� ���
		}
		
		
		System.out.println();
		
		
		//�迭�� �����ϰ� ���� �� ����
		int[] arr2 = {23,11,56,77,12,9};
		System.out.println("�迭���� : " + arr2.length);
		
		//���1
		for(int i = 0; i<arr2.length; i++) {
			System.out.printf("%5d", arr2[i]);
		}
		
		
		System.out.println();
		
		
		//���2
		for(int n:arr2) {
			System.out.printf("%5d", n);
		}
		
		

	}

}
