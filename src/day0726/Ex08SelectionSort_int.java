package day0726;

import java.util.Arrays;

public class Ex08SelectionSort_int {

	public static void main(String[] args) {
		
		//���� ����
		int[] arr = {80, 55, 100, 30, 95, 75};
		
		for(int i = 0; i<arr.length-1; i++) { //�������� �ڱ� �ڽŰ��� ���̱� ������ �� �ʿ䰡 ����. �׷��� ������ .length-1
			for(int j = i+1; j<arr.length; j++) { //i�� 1�� Ŀ�� �� ���� j�� �� �� �Ͱ� ���� �ʿ䰡 �����Ƿ� i+1
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		//���
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"->"+arr[i]);
		}

		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
	
		
	}

}
