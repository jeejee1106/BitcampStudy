package day0722;

public class Ex09While_Alphabet {

	public static void main(String[] args) {
		
		System.out.println("<<다양한 방법으로 알파벳 대문자 출력하기>>");
		
		//ASCII코드
		int a = 65;
		while(a<=90) {
			System.out.print((char)a++);
		}
		
		System.out.println();
		
		//조건식에 true를 주고 break 걸기
		a = 65;
		while(true) {
			System.out.print((char)a++);
			if(a==91) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
