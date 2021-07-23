package day0723;

import java.util.Scanner;

public class Ex10Final_Exe {

	public static void main(String[] args) {
		
		/*
		 * [문제1]
		 * 숫자 inp를 입력받아 배열의 몇번째에 있는지 출력
		 * 없을경우 "없습니다" 출력
		 * 반복해서 입력하다가 0입력시 종료
		 * 
		 * 예)
		 * 입력값 : 11
		 * 			11은 2번째에 있어요!
		 * 입력값 : 100
		 * 			100은 없습니다.
		 * 입력값 : 0
		 * 			종료합니다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,11,12,13,14,15};
		
		System.out.println("숫자를 입력해라");
		while(true) {
			int inp = sc.nextInt();
			for(int i = 0; i<arr.length; i++) {
				if(arr[i]==inp) {
					System.out.println(inp + "은(는) " + (i+1) + "번째에 있어요!");
				}
				if(inp==0) {
					System.out.println("종료합니다");
					break;
				} 
			}		
		}
		
		
		
		
		
		
		
		

	}

}
