package day0721;

public class Ex11For_Alphabet {

	public static void main(String[] args) {

		System.out.println("<<다양한 방법으로 알파벳 대문자 출력하기>>");
		//1번 - ASCII 코드
		for(int i = 65; i<=90; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		
		//2번 - printf (유니코드)
		for(int i = 65; i<=90; i++) {
			System.out.printf("%c",i);
		}
		System.out.println();
		
		//3번 - 문자를 for문에?!
		for(char a='A'; a<='Z'; a++) {
			System.out.print(a);
		}
		System.out.println();
		
		
		
	}

}
