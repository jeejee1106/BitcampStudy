package day0726;

import java.util.Random;

public class Ex07Array_Random {

	public static void main(String[] args) {
		
		/*
		 * �迭�� 1���� 50 ������ ������ ���ؼ� ������ ���ٿ� 5���� ���
		 * ��, ���� ������ ��� �� �迭����(�ƹ����� �ε����� ���ϴµ�...?)�� �ٽ� ���ϼ���(�ߺ�üũ)
		 * 
		 * */
		
		int[] arr = new int[20];
		Random r = new Random();
		
		//�ߺ�ó��
		Loop:
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(50)+1;
			for(int j = 0; j<i; j++) {
				if(arr[i]==arr[j]) {
				i--;
				continue Loop;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print("arr" + "[" + i + "] = " + arr[i] + "\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
		
		
		
		

	}

}
