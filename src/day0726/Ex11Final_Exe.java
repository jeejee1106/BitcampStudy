package day0726;

import java.util.Scanner;

public class Ex11Final_Exe {

	public static void main(String[] args) {
		/*문제 1
		 * 12개의 띠를 배열에 저장 후 태어난 년도를 입력하면 해당 년도와 함께 띠를 출력하시오.
		 */
		Scanner sc = new Scanner(System.in);
		
//		String[] ddi = {~~~};
		
		
		
		/*문제 2
		 * int[] Lotto = new int[6];
		 * 위 배열에 1~45 사이의 난수를 발생시킨 후 오름차순으로 정렬하시오
		 * 단, 중복숫자가 발생하면 다시 구하세요.
		 * */
		int[] Lotto = new int[6];
		
		Loop:
		for(int i = 0; i<Lotto.length; i++) {
			int n = (int)(Math.random()*45)+1;
			Lotto[i] = n;
			for(int j = i+1; j<Lotto.length; j++) {
				if(Lotto[i]==Lotto[j]) {
					i--;
					continue Loop;
				}
				if(Lotto[i]>Lotto[j]) {
					int tmp = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i<Lotto.length; i++) {
			System.out.println("Lotto" + "[" + i + "] = " + Lotto[i] + "\t");
		}
		
		
		
		
		/*문제 3
		 * int[] alpha = new int[26];
		 * 영문 문장을 입력 후 분석하여 각 알파벳의 갯수를 구한 후 출력하시오.
		 * */
		
	}

}
