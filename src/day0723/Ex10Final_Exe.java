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

//		Scanner sc = new Scanner(System.in);
//		int[] arr = {10,11,12,13,14,15};
//		int inp;
//
//		System.out.println("숫자를 입력해라");
//		Exit:
//		while(true) {
//			inp = sc.nextInt();
//			for(int i = 0; i<arr.length; i++) {
//				if(inp==arr[i]) {
//					System.out.println(inp + "은(는) " + (i+1) + "번째에 있어요!");
//				} else if(inp==0) {
//					System.out.println("종료합니다");
//					break Exit;
//				}
//			}
//		}

		//강사님 코드
		Scanner sc = new Scanner(System.in);
		
		int []arr2= {23,11,56,77,13,9,1,6,90,34,22};
		int inp;
		
		while(true)
		{
			System.out.print("입력값:");
			inp=sc.nextInt();
			if(inp==0)
			{
				System.out.println("종료합니다");
				break;//while문을 빠져나가면서 종료
			}
			
			boolean find=false;//반복문 안에서 찾앗을경우 true로 변경할것
			//배열 갯수만큼 반복해서 입력한숫자 찾기
			for(int i=0;i<arr2.length;i++)
			{
				if(inp==arr2[i])
				{
					find=true;//찾았다는 의미로 true로 변경
					System.out.println("\t"+(i+1)+"번째에 있어요!");
				}
			}
			
			//배열에 없는경우 find 는 여전히 false이다
			if(!find)
			{
				System.out.println("\t"+inp+"는 배열에 없습니다");
			}
			System.out.println();
		}





	}

}
