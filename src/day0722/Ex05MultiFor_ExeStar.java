package day0722;

public class Ex05MultiFor_ExeStar {

	public static void main(String[] args) {
		
		System.out.println("<����� �⺻>");
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=10; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		System.out.println();
		
		System.out.println("<1���� �þ��. ��������>");
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		System.out.println();
		
		System.out.println("<1���� �پ���. ��������>");
		for(int i = 1; i<=10; i++) {
			for(int j = 10; j>=i; j--) {
				System.out.print("*");
			} System.out.println();
		}
		
		System.out.println();
		
		System.out.println("<�ϳ��� �þ��. ����������>");
		for(int i = 1; i<=10; i++) {
			for(int j = 10; j>=1; j--) {
				if(i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} System.out.println();
		}
		
		//����� �ڵ�
		for(int i=1;i<=10;i++) {
			for(int j=i;j<10;j++) { //������ 5,4,3,2,1
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {//* �� 1,2,3,4,5
				System.out.print("*");
				} System.out.println();
		}

		System.out.println();
		
		
		System.out.println("<�Ƕ�̵� �����>");
		
		
		
		//����� �ڵ�
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) { //������ 5,4,3,2,1
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) { //* �� 1,3,5,7,9
				System.out.print("*");
			} System.out.println();
		}

		
		System.out.println("<���ڰ� �� �����>");
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
		
		System.out.println("<���ĺ� �ϳ��� �þ��>"); //���� �ʼ�@@@@@
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
