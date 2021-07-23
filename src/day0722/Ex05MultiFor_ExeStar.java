package day0722;

public class Ex05MultiFor_ExeStar {

	public static void main(String[] args) {
		
		System.out.println("<별찍기 기본>");
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=10; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		System.out.println();
		
		System.out.println("<1개씩 늘어나게. 왼쪽정렬>");
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		System.out.println();
		
		System.out.println("<1개씩 줄어들게. 왼쪽정렬>");
		for(int i = 1; i<=10; i++) {
			for(int j = 10; j>=i; j--) {
				System.out.print("*");
			} System.out.println();
		}
		
		System.out.println();
		
		System.out.println("<하나씩 늘어나게. 오른쪽정렬>");
		for(int i = 1; i<=10; i++) {
			for(int j = 10; j>=1; j--) {
				if(i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} System.out.println();
		}
		
		//강사님 코드
		for(int i=1;i<=10;i++) {
			for(int j=i;j<10;j++) { //공백은 5,4,3,2,1
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {//* 는 1,2,3,4,5
				System.out.print("*");
				} System.out.println();
		}

		System.out.println();
		
		
		System.out.println("<피라미드 별찍기>");
		
		
		
		//강사님 코드
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) { //공백은 5,4,3,2,1
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) { //* 는 1,3,5,7,9
				System.out.print("*");
			} System.out.println();
		}

		
		System.out.println("<숫자가 들어간 별찍기>");
		/*
		 *   1****
		 *   *2***
		 *   **3**
		 *   ***4*
		 *   ****5
		 */
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=10; j++) {
				if (i==j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			} System.out.println();
		}
		
		System.out.println();
		
		System.out.println("<알파벳 하나씩 늘어나게>"); //복습 필수@@@@@
		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ABCDE
		 */
		for(int i = 1; i<=5; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print((char)('A'+j));
			}System.out.println();
		}
		
		
		
		
		
		
	}

}
