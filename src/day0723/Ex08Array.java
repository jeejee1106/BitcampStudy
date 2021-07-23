package day0723;

public class Ex08Array {

	public static void main(String[] args) {

		char[] ch; //배열의 선언
		ch = new char[5]; //배열의 생성, 자동 초기화
		
		System.out.println("배열의 크기 : " + ch.length);
		
		//자동으로 초기화된 초기값을 출력해보자
		for(int i = 0; i<ch.length; i++) {
			System.out.println(i + ":" + (int)ch[i]);
		}
		
		System.out.println();
		
		
		
		//배열에 값 넣기
		ch[0] = 'A';
		ch[1] = 66;
		ch[2] = 97;
		ch[3] = 'X';
		ch[4] = 49;
		for(int i=0; i<ch.length; i++) {
			System.out.println(i + ":" + ch[i]);
		}
		
		System.out.println();
		
		
		
		//바로 위 코드와 같은 값을 출력하는 코드임
		for(char a:ch) {
			System.out.println(a);
		}
		
		
	}

}
