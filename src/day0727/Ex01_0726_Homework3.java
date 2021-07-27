package day0727;

import java.util.Scanner;

public class Ex01_0726_Homework3 {
	
	public static void main(String[] args) {
		
		/*문제 3
		 * int[] alpha = new int[26];
		 * 영문 문장을 입력 후 분석하여 각 알파벳의 갯수를 구한 후 출력하시오.
		 * (한줄에 알파벳 7개씩 출력)
		 * 문자열에서 한글자씩 추출은 charAt 을 사용
		 * 추출할 글자가 B일경우 alpha[1]++ 
		 * */
		Scanner sc = new Scanner(System.in);
		
		int []alpha=new int[26];//0으로 초기화
		String msg;
		System.out.println("영문 문장 입력");
		msg=sc.nextLine();
		//각 글자를 추출하여 a(A)면 0번지 증가...
		for(int i=0;i<msg.length();i++) {
			char ch = msg.charAt(i); //i번지에 해당하는 char 글자 추출
			if(ch>='A' && ch<='Z') {
				alpha[ch-'A']++; //대문자인경우 'A' 를 빼면 0~25 의 값이 발생
			} else if(ch>='a' && ch<='z')
				alpha[ch-'a']++; //소문자인경우 'a' 를 빼면 0~25 의 값이 발생
		}

		//한줄에 7개씩 배열값 출력하기
		for(int i=0;i<alpha.length;i++) {
			System.out.print((char)('A'+i)+":"+alpha[i]+"\t");
			if((i+1)%7==0) {
				System.out.println();
				}				
		}
		
		
		
	}

}
