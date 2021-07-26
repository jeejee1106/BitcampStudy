package day0726;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11Final_Exe {

	public static void main(String[] args) {
		/*문제 1
		 * 12개의 띠를 배열에 저장 후 태어난 년도를 입력하면 해당 년도와 함께 띠를 출력하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String[] ddi = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", 
						"토끼", "용", "뱀", "말", "양"};
		
		for(int i = 0; i<ddi.length; i++) {
			if(year%12==i) {
				System.out.println(year + "년은 " + ddi[i] + "의 해 입니다.");
			}
		}



		/*문제 2
		 * int[] Lotto = new int[6];
		 * 위 배열에 1~45 사이의 난수를 발생시킨 후 오름차순으로 정렬하시오
		 * 단, 중복숫자가 발생하면 다시 구하세요.
		 * */
		//1. 배열의 선언과 초기화
		int[] Lotto = new int[6];

		//2. 랜덤값 6개 배열에 담기.
		Loop:
			for(int i = 0; i<Lotto.length; i++) {
				Lotto[i] = (int)(Math.random()*45)+1; //Lotto배열의 0,1,2,3,4,5 인덱스에 범위 1~45인 랜덤값을 넣을것이다. 6개의 랜덤값을 뽑는 동안 중복값이 나올 수 있다.
				for(int j = 0; j<i; j++) {		  //3. 중복값 제거
					if(Lotto[i]==Lotto[j]) {
						i--;
						continue Loop;
					}
				}
			}								     

		//4. 오름차순 정리
		for(int i = 0; i<Lotto.length-1; i++) {
			for(int j = i+1; j<Lotto.length; j++) {
				if(Lotto[i]>Lotto[j]) {
					int n = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = n;
				}
			}
		}	

		//5. 출력
		System.out.println(Arrays.toString(Lotto));




		/*문제 3
		 * int[] alpha = new int[26];
		 * 영문 문장을 입력 후 분석하여 각 알파벳의 갯수를 구한 후 출력하시오.
		 * */
		
		
		
		
		
		
		
		
		
		
		

	}

}
