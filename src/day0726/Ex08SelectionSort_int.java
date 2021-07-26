package day0726;

import java.util.Arrays;

public class Ex08SelectionSort_int {

	public static void main(String[] args) {
		
		//숫자 정렬
		int[] arr = {80, 55, 100, 30, 95, 75};
		
		for(int i = 0; i<arr.length-1; i++) { //마지막은 자기 자신과의 비교이기 때문에 할 필요가 없다. 그래서 범위가 .length-1
			for(int j = i+1; j<arr.length; j++) { //i가 1씩 커질 때 마다 j는 그 전 것과 비교할 필요가 없으므로 i+1
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		//출력
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"->"+arr[i]);
		}

		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
	
		
	}

}
