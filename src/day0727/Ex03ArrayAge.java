package day0727;

import java.util.Scanner;

public class Ex03ArrayAge {

	public static void main(String[] args) {
		
		/*
		 * 총 10명의 나이를 입력받아 나이 분포도를 출력
		 * 
		 * ex)
		 * 10대:2명   20대:3명   30대:5명   40대:1명   50대:0명
		 * 10세 이상이거나 60세 이상은 제외
		 * 
		 * 나이 먼저 출력 후 나이별 인원수 출력
		 * */
		
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		int[] inwon = new int[5]; //10대인 경우 index[0] 증가 ...
		
		for(int i = 0; i<age.length; i++) {
			System.out.print("나이입력 : ");
			age[i] = sc.nextInt();
			if(age[i]<10 || age[i]>=60) {
				continue;
			} else if(age[i]/10==(i+1)) {
				inwon[i]++;
			}
		} 
		for(int i = 0; i<inwon.length; i++) {
//		System.out.println(i+1 + "0대 : " + inwon[i] + "명");
		System.out.printf("%d대 : %d명", (i+1)*10, inwon[i]);
		}
		
		
		
		

	}

}
