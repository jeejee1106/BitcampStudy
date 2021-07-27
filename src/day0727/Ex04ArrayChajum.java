package day0727;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04ArrayChajum {

	public static void main(String[] args) {

		/*
		 * 5개의 답을 입력하면 ox채점 후 정답 갯수와 오답 갯수 출력하기
		 * 
		 * ex)
		 * 5개의 답을 입력해주세요
		 * 	125
		 * 문항수가 부족합니다
		 * 	12ab5
		 * 숫자로만 입력해주세요
		 * 	13124
		 * 1번:O   2번:X   3번:X   4번:O   5번:O
		 * 정답갯수:3   오답갯수:2
		 * */

		Scanner sc = new Scanner(System.in);

		String jung = "12345"; //정답
		String inp; //답 입력받기
		char[] ox = new char[5]; //정답이면 'O', 오답이면 'X'
		int jcnt = 0; //정답갯수
		int ocnt = 0; //오답갯수

		System.out.println("5개의 답을 입력해주세요.");

		Loop:
			while(true) {
				inp = sc.nextLine();
				if(inp.length()<jung.length()) {
					System.out.println("문항수가 부족합니다.");
					continue;
				}
				for(int i=0;i<5;i++)
				{
					char ch=inp.charAt(i);
					if(!(ch>='1' && ch<='9'))
					{
						System.out.println("\t숫자로만 입력해주세요");
						continue Loop;//while 의 조건식으로 이동
					}

				}


				if(inp.length()==jung.length()) {
					break;
				}
			}


		char[] arr = jung.toCharArray();
		char[] arr2 = inp.toCharArray();

		System.out.println("정답 : " + Arrays.toString(arr));
		System.out.println("내가 쓴 답 : " + Arrays.toString(arr2));


		//정답인지 오답인지 체크하고 카운드 ++
		for(int i = 0; i<ox.length; i++) {
			if(arr[i]==arr2[i]) {
				jcnt++;
				System.out.print((i+1) + "번:O\t" );
			} else {
				ocnt++;
				System.out.print((i+1) + "번:X\t" );
			}
		}System.out.println();
		System.out.println("정답갯수 : " + jcnt);
		System.out.println("오답갯수 : " + ocnt);


		//강사님 코드
		//		String jungdap = "12345"; //정답
		//		String inp; //답 입력받기
		//		char[] ox = new char[5]; //정답이면 'O', 오답이면 'X'
		//		int jcnt = 0; //정답갯수
		//		int ocnt = 0; //오답갯수
		//
		//		Loop:
		//			while(true)
		//			{
		//				System.out.println("5개의 답을 입력해주세요");
		//				inp=sc.nextLine();
		//				if(inp.length()<5)
		//				{
		//					System.out.println("\t문항수가 부족합니다");
		//					continue;//조건식으로 이동
		//				}
		//
		//				for(int i=0;i<5;i++)
		//				{
		//					char ch=inp.charAt(i);
		//					if(!(ch>='1' && ch<='9'))
		//					{
		//						System.out.println("\t숫자로만 입력해주세요");
		//						continue Loop;//while 의 조건식으로 이동
		//					}
		//
		//				}
		//				break;//위의 2가지에 해당 안된다면 while문을 빠져나간다		
		//			}
		//
		//		//정답 비교
		//		for(int i=0;i<jungdap.length();i++)
		//		{
		//			char j=jungdap.charAt(i);//정답의 첫번째 숫자
		//			char mydap=inp.charAt(i);//내가 입력한 답의 첫번째 숫자
		//			if(j==mydap)//정답과 같을 경우
		//			{
		//				ox[i]='O';
		//				jcnt++;
		//			}else {//정답과 다들경우
		//				ox[i]='X';
		//				ocnt++;
		//			}
		//		}
		//
		//		System.out.println("** 결과 출력 **");
		//		for(int i=0;i<ox.length;i++)
		//		{
		//			System.out.print(i+1+"번:"+ox[i]+"  ");
		//		}
		//		System.out.println();
		//		System.out.println("정답갯수:"+jcnt+"  오답갯수:"+ocnt);













	}

}
