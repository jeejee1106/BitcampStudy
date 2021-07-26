package day0726;

import java.util.Random;

public class Ex07Array_Random {

	public static void main(String[] args) {
		
		/*
		 * 배열에 1부터 50 사이의 난수를 구해서 넣은후 한줄에 5개씩 출력
		 * 단, 같은 숫자일 경우 그 배열번지(아무래도 인덱스를 말하는듯...?)는 다시 구하세요(중복체크)
		 * 
		 * */
		
		int[] arr = new int[20];
		Random r = new Random();
		
		//중복처리
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
